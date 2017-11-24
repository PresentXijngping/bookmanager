package bookmanager.dao.dbservice;

import bookmanager.model.po.bookrelationlabel.BookRelationLabelPO;

import java.util.List;
import java.util.Map;

/**
 * @Author: spider_hgyi
 * @Date: Created in 下午1:24 17-11-24.
 * @Modified By:
 * @Description:
 */
public interface BookRelationLabelService {
    // 通过标签Id获取标签下的所有书籍信息
    List<Map<String, Object>> getListBookInfoByLabelId(int labelId);

    // 在某标签下添加一本书籍信息
    void save(BookRelationLabelPO bookRelationLabel);
}
