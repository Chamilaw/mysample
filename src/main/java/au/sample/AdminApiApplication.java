package au.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jndi.JndiObjectFactoryBean;




@EnableCaching
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"au.sample"})
public class AdminApiApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AdminApiApplication.class, args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AdminApiApplication.class);
    }

}


