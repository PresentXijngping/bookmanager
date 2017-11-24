package bookmanager.dao.dbfactory;

import bookmanager.dao.dbimpl.*;
import bookmanager.dao.dbservice.*;

/**
 * Created by dela on 11/23/17.
 */
public class dbFactory {
    public static UserService getUserService() {
        return new UserServiceImpl();
    }

    public static BookInfoService getBookInfoService() {
        return new BookInfoServiceImpl();
    }

    public static BookLabelService getBookLabelService() {
        return new BookLabelServiceImpl();
    }

    public static BookRelationLabelService getBookRelationLabelService() {
        return new BookRelationLabelServiceImpl();
    }

    public static BorrowInfoService getBorrowInfoService() {
        return new BorrowInfoServiceImpl();
    }

    public static ReturnInfoService getReturnInfoService() {
        return new ReturnInfoServiceImpl();
    }

    public static BookCommentService getBookCommentService() {
        return new BookCommentServiceImpl();
    }
}
