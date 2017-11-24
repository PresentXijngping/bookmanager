package bookmanager.model.po.booklabel;

/**
 * @Author: spider_hgyi
 * @Date: Created in 下午1:51 17-11-20.
 * @Modified By:
 * @Description:
 */
public class LabelPO {
    private int pk_id;              // 每个标签的ID
    private String name;            // 标签名
    private int parentId;           // 标签父ID

    public LabelPO(String uk_name, int parentId) {
        this.name = uk_name;
        this.parentId = parentId;
    }

    public LabelPO(int pk_id, String uk_name, int parentId) {
        this.pk_id = pk_id;
        this.name = uk_name;
        this.parentId = parentId;
    }

    public int getPkId() {
        return pk_id;
    }

    public String getName() {
        return name;
    }

    public int getParentId() {
        return parentId;
    }
}
