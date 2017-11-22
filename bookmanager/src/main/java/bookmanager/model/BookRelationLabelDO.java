package bookmanager.model;

/**
 * Created by dela on 11/22/17.
 */
public class BookRelationLabelDO {
    private int pkId;           //wuyiyizhujian
    private int bookInfoPkId;   //bookinfo zhezhangbiaolimiandezhujian
    private int bookLabelPkId;  //biaoqian zhezhangbiaolimiandezhujian

    public BookRelationLabelDO() { }

    public int getPkId() {
        return pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

    public int getBookInfoPkId() {
        return bookInfoPkId;
    }

    public void setBookInfoPkId(int bookInfoPkId) {
        this.bookInfoPkId = bookInfoPkId;
    }

    public int getBookLabelPkId() {
        return bookLabelPkId;
    }

    public void setBookLabelPkId(int bookLabelPkId) {
        this.bookLabelPkId = bookLabelPkId;
    }
}
