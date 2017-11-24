package bookmanager.model.po.borrowinfo;

/**
 * @Author: spider_hgyi
 * @Date: Created in 上午11:44 17-11-24.
 * @Modified By:
 * @Description:
 */
public class BorrowInfoPO {
    private int pkId;               // 无意义主键
    private int bookInfoPkId;       // bookInfo这张表里面的主键
    private int userId;             // 用户表里的id
    private String borrowDate;      // 借阅时间

    public BorrowInfoPO() { }

    public BorrowInfoPO(int pkId, int bookInfoPkId, int userId, String borrowDate) {
        this.pkId = pkId;
        this.bookInfoPkId = bookInfoPkId;
        this.userId = userId;
        this.borrowDate = borrowDate;
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

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }
}
