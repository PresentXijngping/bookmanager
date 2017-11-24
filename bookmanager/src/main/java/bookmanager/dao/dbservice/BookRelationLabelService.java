package bookmanager.dao.dbservice;

import bookmanager.model.BookInfoDO;
import bookmanager.model.BookRelationLabelDO;

import java.util.List;

/**
 * Created by dela on 11/23/17.
 */
public interface BookRelationLabelService {
    //通过标签Id获取标签下的所有书籍信息
    List<BookInfoDO> getListBookInfoByLabelId(int labelId);

    //在某标签下添加一本书籍信息
    void save(BookRelationLabelDO bookRelationLabel);
}
