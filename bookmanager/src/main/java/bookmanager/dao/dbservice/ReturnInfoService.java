package bookmanager.dao.dbservice;

import bookmanager.model.po.returninfo.ReturnInfoPO;

/**
 * @Author: spider_hgyi
 * @Date: Created in 下午1:25 17-11-24.
 * @Modified By:
 * @Description:
 */
public interface ReturnInfoService {
    // 向归还表中插入一条信息
    void save(ReturnInfoPO returnInfo);
}
