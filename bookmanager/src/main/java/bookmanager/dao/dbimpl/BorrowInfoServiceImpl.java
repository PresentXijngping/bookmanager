package bookmanager.dao.dbimpl;

import bookmanager.dao.dbservice.BorrowInfoService;
import bookmanager.model.po.borrowinfo.BorrowInfoPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: spider_hgyi
 * @Date: Created in 下午1:30 17-11-24.
 * @Modified By:
 * @Description:
 */
@Repository
public class BorrowInfoServiceImpl implements BorrowInfoService {
    private JdbcOperations jdbc;

    private final static String SAVE = "INSERT INTO borrow_info(book_info_pk_id, cs_user_uid, borrow_date) VALUES(?, ?, ?)";


    @Autowired
    public BorrowInfoServiceImpl(JdbcOperations jdbc) {
        this.jdbc = jdbc;
    }

    public void save(BorrowInfoPO borrowInfo) {
        jdbc.update(SAVE, borrowInfo.getBookInfoPkId(), borrowInfo.getUserId(), borrowInfo.getBorrowDate());
    }

    private final static class BorrowInfoRowMapper implements RowMapper<BorrowInfoPO> {

        public BorrowInfoPO mapRow(ResultSet resultSet, int i) throws SQLException {
            return new BorrowInfoPO(
                    resultSet.getInt(1),
                    resultSet.getInt(2),
                    resultSet.getInt(3),
                    resultSet.getString(4)
            );
        }
    }
}
