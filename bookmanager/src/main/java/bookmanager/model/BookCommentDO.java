package bookmanager.model;

import java.util.Date;

/**
 * Created by dela on 11/22/17.
 */
public class BookCommentDO {
    private int pkId; //wuyiyizhujie
    private int bookInfoPkId;  //shujixinxizhujianid
    private int userId;  //yonghuid
    private String content;  //pinglunneirong
    private Date commentDateTime;  //pinglunriqi

    public BookCommentDO() { }

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCommentDateTime() {
        return commentDateTime;
    }

    public void setCommentDateTime(Date commentDateTime) {
        this.commentDateTime = commentDateTime;
    }
}
