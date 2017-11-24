package bookmanager.dao.dbservice;

import bookmanager.model.UserDO;

/**
 * Created by dela on 11/23/17.
 */
public interface UserService {
    //按用户名查询用户
    UserDO getUserByName(String name);

    //按用户id查询用户
    UserDO getUserById(int id);
}
