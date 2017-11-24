package bookmanager.dao.dbservice;

import bookmanager.model.po.bookcomment.BookCommentPO;

/**
 * @Author: spider_hgyi
 * @Date: Created in 上午11:33 17-11-24.
 * @Modified By:
 * @Description:
 */
public interface BookCommentService {
    //向评论表中插入一条数据
    void save(BookCommentPO bookComment);
}
