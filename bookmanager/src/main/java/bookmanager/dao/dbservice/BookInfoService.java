package bookmanager.dao.dbservice;

import bookmanager.model.po.bookinfo.BookInfoPO;

import java.util.List;

/**
 * @Author: spider_hgyi
 * @Date: Created in 下午1:22 17-11-24.
 * @Modified By:
 * @Description:
 */
public interface BookInfoService {
    // 向书籍信息表中插入一条数据
    void save(BookInfoPO bookInfo);

    // 通过书籍id进行查询
    BookInfoPO getBookInfoByBookId(int bookId);

    // 通过关键字进行书名|作者|所属者模糊查询
    List<BookInfoPO> getListBookInfoByNAO(String keywords);

    // 修改一本书籍的信息
    void updateBookInfo(BookInfoPO bookInfo);
}
