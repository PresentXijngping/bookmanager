package bookmanager.config.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @Author: spider_hgyi
 * @Date: Created in 上午11:21 17-11-20.
 * @Modified By:
 * @Description:
 */
@Configuration
//启用Spring MVC
@EnableWebMvc
@ComponentScan("bookmanager.web")
public class WebConfig extends WebMvcConfigurerAdapter {
    //配置视图解析器
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        resolver.setPrefix("/view/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);

        return resolver;
    }

    //配置静态资源的处理（对静态资源处理的请求转发至默认的Servlet上，而不是使用DispatcherServlet进行处理）
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}

