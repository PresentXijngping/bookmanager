package bookmanager.dao.dbimpl;

import bookmanager.dao.dbservice.BookRelationLabelService;
import bookmanager.model.BookInfoDO;
import bookmanager.model.BookRelationLabelDO;
import bookmanager.model.BorrowInfoDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by dela on 11/23/17.
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

    public List<BookInfoDO> getListBookInfoByLabelId(int labelId) {
        return jdbc.queryForList(GET_LIST_BOOKINFO_BY_LABELID, new BookRelationLabelRowMapper(), labelId);
    }

    public void save(BookRelationLabelDO bookRelationLabel) {
        jdbc.update(SAVE, bookRelationLabel.getBookInfoPkId(), bookRelationLabel.getBookLabelPkId());
    }

    private final static class BookRelationLabelRowMapper implements RowMapper<BookInfoDO> {

        public BookInfoDO mapRow(ResultSet resultSet, int i) throws SQLException {
            return new BookInfoDO(

            );
        }
    }
}
