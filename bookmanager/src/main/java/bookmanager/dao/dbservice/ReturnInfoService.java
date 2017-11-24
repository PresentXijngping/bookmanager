package bookmanager.dao.dbservice;

import bookmanager.model.ReturnInfoDO;

/**
 * Created by dela on 11/23/17.
 */
public interface ReturnInfoService {
    //向归还表中插入一条信息
    void save(ReturnInfoDO returnInfo);
}
