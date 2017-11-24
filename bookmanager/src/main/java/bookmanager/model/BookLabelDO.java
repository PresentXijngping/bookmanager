package bookmanager.model;

/**
 * Created by dela on 11/22/17.
 */

//书籍标签表
public class BookLabelDO {
    private int pkId;       //标签id(有意义主键)(这几张表里唯一一个有意义的主键id)
    private String ukName;  //书籍标签(唯一索引)
    private int parentId;   //当前标签的父标签id

    public BookLabelDO() { }

    public BookLabelDO(int pkId, String ukName, int parentId) {
        this.pkId = pkId;
        this.ukName = ukName;
        this.parentId = parentId;
    }

    public int getPkId() {
        return pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

    public String getUkName() {
        return ukName;
    }

    public void setUkName(String ukName) {
        this.ukName = ukName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
