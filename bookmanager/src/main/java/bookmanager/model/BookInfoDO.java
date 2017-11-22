package bookmanager.model;

import java.util.Date;

/**
 * Created by dela on 11/22/17.
 */
public class BookInfoDO {
    private int pkId;   //wuyiyizhujian
    private String ugkName;  //shuming(zuhesuoyin)
    private String author;  //zuozhe
    private int ugkUid;     //userbiaolideuid(zuhesuoyin)
    private int amount;     //shuliang
    private Date uploadDate; //shangchuanriqi
    private String describ;  //shujimiaoshu

    public BookInfoDO() { }

    public int getPkId() {
        return pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

    public String getUgkName() {
        return ugkName;
    }

    public void setUgkName(String ugkName) {
        this.ugkName = ugkName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getUgkUid() {
        return ugkUid;
    }

    public void setUgkUid(int ugkUid) {
        this.ugkUid = ugkUid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getDescrib() {
        return describ;
    }

    public void setDescrib(String describ) {
        this.describ = describ;
    }
}
