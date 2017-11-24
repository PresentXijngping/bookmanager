package bookmanager.dao.dbimpl;

import bookmanager.dao.dbservice.BookInfoService;
import bookmanager.model.po.bookinfo.BookInfoPO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: spider_hgyi
 * @Date: Created in 下午1:27 17-11-24.
 * @Modified By:
 * @Description:
 */
@Repository
public class BookInfoServiceImpl implements BookInfoService {
    @Override
    public void save(BookInfoPO bookInfo) {

    }

    @Override
    public BookInfoPO getBookInfoByBookId(int bookId) {
        return null;
    }

    @Override
    public List<BookInfoPO> getListBookInfoByNAO(String keywords) {
        return null;
    }

    @Override
    public void updateBookInfo(BookInfoPO bookInfo) {

    }
}