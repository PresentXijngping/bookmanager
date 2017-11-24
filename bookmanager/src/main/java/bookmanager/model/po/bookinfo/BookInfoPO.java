package bookmanager.model.po.bookinfo;

/**
 * @Author: spider_hgyi
 * @Date: Created in 上午11:42 17-11-24.
 * @Modified By:
 * @Description:
 */
public class BookInfoPO {
    private int pkId;                   // 无意义主键
    private String ugkName;             // 书名(组合索引)
    private String author;              // 作者
    private int ugkUid;                 // 所有者(即用户表里的id)(组合索引)
    private int amount;                 // 数量
    private String uploadDate;          // 上传时间
    private String describ;             // 书籍描述

    public BookInfoPO() { }

    public BookInfoPO(int pkId, String ugkName, String author, int ugkUid, int amount, String uploadDate, String describ) {
        this.pkId = pkId;
        this.ugkName = ugkName;
        this.author = author;
        this.ugkUid = ugkUid;
        this.amount = amount;
        this.uploadDate = uploadDate;
        this.describ = describ;
    }

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

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getDescrib() {
        return describ;
    }

    public void setDescrib(String describ) {
        this.describ = describ;
    }
}
