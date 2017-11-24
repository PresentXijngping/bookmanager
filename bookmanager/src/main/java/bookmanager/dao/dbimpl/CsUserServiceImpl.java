package bookmanager.dao.dbimpl;

import bookmanager.dao.dbservice.CsUserService;
import bookmanager.model.po.csuser.PrivilegePO;
import bookmanager.model.po.csuser.UserPO;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: spider_hgyi
 * @Date: Created in 上午9:10 17-11-24.
 * @Modified By:
 * @Description:
 */
@Repository
public class CsUserServiceImpl implements CsUserService {
    JdbcOperations jdbcOperations;
    private final static String QUERY_PRIVILEGE_BY_UID = "SELECT privilege FROM cs_user " +
            "WHERE uid = ?";

    @Inject
    public CsUserServiceImpl(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    @Override
    public PrivilegePO getPrivilegeByUid(int uid) {
        return (PrivilegePO) jdbcOperations.query(QUERY_PRIVILEGE_BY_UID, new privilegeRowMapper(), uid);
    }

    private final static class privilegeRowMapper implements RowMapper<PrivilegePO> {
        public PrivilegePO mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            return new PrivilegePO(
                    resultSet.getInt("privilege")
            );
        }
    }

    private final static class UserRowMapper implements RowMapper<UserPO> {

        public UserPO mapRow(ResultSet resultSet, int i) throws SQLException {
            return new UserPO(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getInt(3),
                    resultSet.getString(4),
                    resultSet.getInt(5),
                    resultSet.getString(6),
                    resultSet.getString(7),
                    resultSet.getString(8),
                    resultSet.getString(9),
                    resultSet.getString(10),
                    resultSet.getString(11),
                    resultSet.getString(12),
                    resultSet.getString(13),
                    resultSet.getString(14),
                    resultSet.getString(15),
                    resultSet.getString(16)
            );
        }
    }
}
