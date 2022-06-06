package cs544.cov2.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		// Create the 'root' Spring application context
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(Config.class);
		container.addListener(new ContextLoaderListener(rootContext));

		// Create the dispatcher servlet
		ServletRegistration.Dynamic appServlet = container.addServlet("mvc",
				new DispatcherServlet(new GenericWebApplicationContext()));
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/");

		FilterRegistration.Dynamic openInView = container.addFilter("OpenInView", new OpenEntityManagerInViewFilter());
		openInView.addMappingForUrlPatterns(null, true, "/*");

		container.addFilter("springSecurityFilterChain", 
			new DelegatingFilterProxy("springSecurityFilterChain"))
			.addMappingForUrlPatterns(null, false, "/*");
	}
}
