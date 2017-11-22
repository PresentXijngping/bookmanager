package bookmanager.model;

/**
 * Created by dela on 11/22/17.
 */
public class BookLabelDO {
    private int pkId;       //label id(youyiyizhujian)
    private String ukName;  //shujibiaoqian(weiyizuhesuoyin)
    private int parentId;   //fubiaoqian id

    public BookLabelDO() { }

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
