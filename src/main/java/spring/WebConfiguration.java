package spring;

import org.h2.server.web.WebServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * Created by insight-ks on 2015-08-13.
 */
public class WebConfiguration {

    @Bean
    ServletRegistrationBean h2servletRegistration(){

        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());

        registrationBean.addUrlMappings("/console/*");

        return registrationBean;

    }

}
