package bookmanager.dao.dbservice;

import bookmanager.model.po.csuser.PrivilegePO;

/**
 * @Author: spider_hgyi
 * @Date: Created in 上午9:00 17-11-24.
 * @Modified By:
 * @Description:
 */
public interface CsUserService {
    PrivilegePO getPrivilegeByUid(int uid);
}
