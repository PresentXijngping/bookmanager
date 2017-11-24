package bookmanager.dao.dbservice;

import bookmanager.model.po.booklabel.LabelPO;
import bookmanager.model.po.booklabel.PkIdPO;

import java.util.List;

/**
 * @Author: spider_hgyi
 * @Date: Created in 下午4:47 17-11-20.
 * @Modified By:
 * @Description:
 */

public interface BookLabelService {
    List<LabelPO> getParentLabelsByParentId(int parentId);
    List<LabelPO> getChildrenLabelsNyByParentId(int parentId);
    PkIdPO getParentLabelIdByParentLabelName(String parentLabelName);
    void insertNewLabel(LabelPO label);
}
