package bookmanager.config.database;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ResourceBundle;

/**
 * @Author: spider_hgyi
 * @Date: Created in 下午1:38 17-11-20.
 * @Modified By:
 * @Description:
 */
@Configuration
public class Config {
    private static String URL;
    private static String USERNAME;
    private static String PASSWD;
    private static String Driver;

    //加载配置文件
    private static ResourceBundle rb = ResourceBundle.getBundle("db-config");

    //静态代码块在加载类时只执行一次
    static {
        URL = rb.getString("jdbc.URL");
        USERNAME = rb.getString("jdbc.USERNAME");
        PASSWD = rb.getString("jdbc.PASSWD");
        Driver = rb.getString("jdbc.Driver");
    }

    //配置DataSource数据库连接池
    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(Driver);
        dataSource.setUrl(URL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWD);
        dataSource.setInitialSize(5);
        dataSource.setMaxIdle(10);

        return dataSource;
    }

    //jdbcOperations接口，jdbc数据库操作模板
    @Bean
    public JdbcOperations jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
