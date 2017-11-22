package bookmanager.config.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by dela on 11/22/17.
 */

//配置DispatcherServlet应用上下文的JavaConfig
//@EnableWebMvc注解开启Spring MVC

@Configuration
@EnableWebMvc
@ComponentScan("bookmanager.web") //启用组件扫描, 组件扫描只会扫描到这里设置的包及其子包
public class WebConfig extends WebMvcConfigurerAdapter {
    //配置ViewResolver视图解析器具体解析view名字的规则
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("WEB-");
    }
}
