package bookmanager.model.po.returninfo;

/**
 * @Author: spider_hgyi
 * @Date: Created in 上午11:45 17-11-24.
 * @Modified By:
 * @Description:
 */
public class ReturnInfoPO {
    private int pkId;               // 无意义主键
    private int bookInfoPkId;       // bookInfo这张表里面的主键
    private int userId;             // 用户表里的id
    private String returnDate;      // 归还日期

    public ReturnInfoPO() { }

    public ReturnInfoPO(int pkId, int bookInfoPkId, int userId, String returnDate) {
        this.pkId = pkId;
        this.bookInfoPkId = bookInfoPkId;
        this.userId = userId;
        this.returnDate = returnDate;
    }

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
