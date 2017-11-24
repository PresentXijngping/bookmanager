package bookmanager.dao.dbimpl;

import bookmanager.dao.dbservice.BookRelationLabelService;
import bookmanager.model.po.bookinfo.BookInfoPO;
import bookmanager.model.po.bookrelationlabel.BookRelationLabelPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: spider_hgyi
 * @Date: Created in 下午1:28 17-11-24.
 * @Modified By:
 * @Description:
 */
@Repository
public class BookRelationLabelServiceImpl implements BookRelationLabelService {
    private JdbcOperations jdbc;

    private final static String GET_LIST_BOOKINFO_BY_LABELID = "SELECT * FROM book_relation_label WHERE label_tree_pk_id = ?";
    private final static String SAVE = "INSERT INTO book_relation_label(book_info_pk_id, label_tree_pk_id) VALUES(?, ?)";

    @Autowired
    public BookRelationLabelServiceImpl(JdbcOperations jdbc) {
        this.jdbc = jdbc;
    }

    public List<Map<String, Object>> getListBookInfoByLabelId(int labelId) {
        return jdbc.queryForList(GET_LIST_BOOKINFO_BY_LABELID, new BookRelationLabelRowMapper(), labelId);
    }

    public void save(BookRelationLabelPO bookRelationLabel) {
        jdbc.update(SAVE, bookRelationLabel.getBookInfoPkId(), bookRelationLabel.getBookLabelPkId());
    }

    private final static class BookRelationLabelRowMapper implements RowMapper<BookInfoPO> {

        public BookInfoPO mapRow(ResultSet resultSet, int i) throws SQLException {
            return new BookInfoPO(

            );
        }
    }
}
