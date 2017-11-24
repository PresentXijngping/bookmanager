package bookmanager.dao.dbservice;

import bookmanager.model.po.borrowinfo.BorrowInfoPO;

/**
 * @Author: spider_hgyi
 * @Date: Created in 下午1:25 17-11-24.
 * @Modified By:
 * @Description:
 */
public interface BorrowInfoService {
    // 向借阅表中插入一条信息
    void save(BorrowInfoPO borrowInfo);
}
