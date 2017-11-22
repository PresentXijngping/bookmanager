package bookmanager.model;

import java.util.Date;

/**
 * Created by dela on 11/22/17.
 */
public class BorrowInfoDO {
    private int pkId;   //wuyiyizhujian
    private int bookInfoPkId;  //bookinfo zhezhangbiaodezhujian
    private int userId;        //yonghuzhezhangbiaodeid
    private Date borrowDate;   //jieshuriqi

    public BorrowInfoDO() { }

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

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }
}
