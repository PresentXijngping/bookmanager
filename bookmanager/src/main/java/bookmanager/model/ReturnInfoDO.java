package bookmanager.model;

import java.util.Date;

/**
 * Created by dela on 11/22/17.
 */
public class ReturnInfoDO {
    private int pkId;   //wuyiyizhujian
    private int bookInfoPkId;  //bookinfo zhezhangbiaodezhujian
    private int userId;      //yonghubiaodeid
    private Date returnDate;  //guihuanriqi

    public ReturnInfoDO() { }

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

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
