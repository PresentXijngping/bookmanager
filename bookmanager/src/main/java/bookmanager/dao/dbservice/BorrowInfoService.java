package bookmanager.dao.dbservice;

import bookmanager.model.BorrowInfoDO;

/**
 * Created by dela on 11/23/17.
 */
public interface BorrowInfoService {
    //向借阅表中插入一条信息
    void save(BorrowInfoDO borrowInfo);
}
