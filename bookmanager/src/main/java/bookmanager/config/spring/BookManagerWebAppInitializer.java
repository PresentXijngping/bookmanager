package bookmanager.config.spring;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author: spider_hgyi
 * @Date: Created in 上午11:16 17-11-20.
 * @Modified By:
 * @Description:
 */
public class BookManagerWebAppInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }

    //将一个或多个路径映射到DispatcherServlet上（处理应用的所有请求）
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
