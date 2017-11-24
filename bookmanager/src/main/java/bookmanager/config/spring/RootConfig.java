package bookmanager.config.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author: spider_hgyi
 * @Date: Created in 上午11:20 17-11-20.
 * @Modified By:
 * @Description:
 */
@Configuration
@ComponentScan(basePackages = {"bookmanager"}, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
})
public class RootConfig {

}
