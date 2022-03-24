package com.krishnam.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@ComponentScan({"com.krishnam.controllers"})
@EnableWebMvc
public class SpringConfiguration extends WebMvcConfigurerAdapter{
	
	

}
