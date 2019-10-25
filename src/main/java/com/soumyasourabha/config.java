package com.soumyasourabha;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.soumyasourabha"})
@EnableWebMvc
public class config extends WebMvcConfigurationSupport {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
//		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		
		return vr;
	}

}
