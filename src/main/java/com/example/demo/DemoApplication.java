package com.example.demo;

import com.example.demo.servlet.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@Bean
	public ServletRegistrationBean servletRegistrationBean(){
		return new ServletRegistrationBean(new MyServlet(),"/css/*");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
