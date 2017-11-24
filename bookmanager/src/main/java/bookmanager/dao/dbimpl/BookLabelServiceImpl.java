package bookmanager.dao.dbimpl;

import bookmanager.dao.dbservice.BookLabelService;
import bookmanager.model.po.booklabel.LabelPO;
import bookmanager.model.po.booklabel.PkIdPO;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: spider_hgyi
 * @Date: Created in 下午4:54 17-11-20.
 * @Modified By:
 * @Description:
 */
@Repository
public class BookLabelServiceImpl implements BookLabelService {
    JdbcOperations jdbcOperations;
    private final static String QUERY_PARENT_LABELS_BY_PARENT_ID = "SELECT * FROM book_label " +
            "WHERE parent_id = ?";
    private final static String QUERY_CHILDREN_LABELS_BY_PARENT_ID = "SELECT * FROM book_label " +
            "WHERE parent_id <> ?";
    private final static String QUERY_CHILDREN_PKID_BY_PARENT_NAME = "SELECT pk_id FROM label_tree" +
            "WHERE uk_name = ?";
    private final static String INSERT_NEW_LABEL = "INSERT INTO book_label (uk_name, parent_id)" +
            "VALUES (?, ?)";

    @Inject
    public BookLabelServiceImpl(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    @Override
    public List<LabelPO> getParentLabelsByParentId(int parentId) {
        return jdbcOperations.query(QUERY_PARENT_LABELS_BY_PARENT_ID,
                new LabelRowMapper(), parentId);
    }

    @Override
    public List<LabelPO> getChildrenLabelsNyByParentId(int parentId) {
        return jdbcOperations.query(QUERY_CHILDREN_LABELS_BY_PARENT_ID,
                new LabelRowMapper(), parentId);
    }

    @Override
    public PkIdPO getParentLabelIdByParentLabelName(String parentLabelName) {
        return (PkIdPO) jdbcOperations.query(QUERY_CHILDREN_PKID_BY_PARENT_NAME,
                new PkIdRowMapper(), parentLabelName);
    }

    @Override
    public void insertNewLabel(LabelPO label) {
        jdbcOperations.update(INSERT_NEW_LABEL, label.getName(), label.getParentId());
    }

    private final static class LabelRowMapper implements RowMapper<LabelPO> {
        public LabelPO mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            return new LabelPO(
                    resultSet.getInt("pk_id"),
                    resultSet.getString("uk_name"),
                    resultSet.getInt("parent_id")
            );
        }
    }

    private final static class PkIdRowMapper implements RowMapper<PkIdPO> {
        public PkIdPO mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            return new PkIdPO(
                    resultSet.getInt("pk_id")
            );
        }
    }
}
