package lr.spmvcwbap.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "lr.spmvcwbap")
public class WebMvcConfig implements WebMvcConfigurer {

//    @Bean
//    public InternalResourceViewResolver viewResolver() {
//        InternalResourceViewResolver vr = new InternalResourceViewResolver();
//        vr.setPrefix("/WEB-INF/view/");
//        vr.setSuffix(".jsp");
//        return vr;
//    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

        registry.jsp("/WEB-INF/view/", ".jsp");
    }
}
