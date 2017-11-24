package bookmanager.dao.dbservice;

import bookmanager.model.BookInfoDO;

import java.util.List;

/**
 * Created by dela on 11/23/17.
 */
public interface BookInfoService {
    //向书籍信息表中插入一条数据
    void save(BookInfoDO bookInfo);

    //通过书籍id进行查询
    BookInfoDO getBookInfoByBookId(int bookId);

    //通过关键字进行书名|作者|所属者模糊查询
    List<BookInfoDO> getListBookInfoByNAO(String keywords);

    //修改一本书籍的信息
    void updateBookInfo(BookInfoDO bookInfo);
}
