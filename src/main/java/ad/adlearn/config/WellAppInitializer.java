package ad.adlearn.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Slf4j
public class WellAppInitializer implements WebApplicationInitializer {
    private static final String DISPATCHER_SERVLET_NAME = "dispatcher";

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // Servlet Context defines methods that a servlet uses to communicate with its server container
        // which is Tomcat in this project
        log.info("onStartup()");

        // create the spring application context
        AnnotationConfigWebApplicationContext context =
                new AnnotationConfigWebApplicationContext();
        context.register(WebConfig.class);

        // create the dispatcher servlet
        DispatcherServlet dispatcherServlet =
                new DispatcherServlet(context);

        // register and configure the dispatcher servlet
        ServletRegistration.Dynamic registration =
                servletContext.addServlet(DISPATCHER_SERVLET_NAME, dispatcherServlet);

        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}
