package kr.or.connect.navermovie.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = { "kr.or.connect.navermovie.dao",  "kr.or.connect.navermovie.service"})
@Import({ DBConfig.class })
public class ApplicationConfig {

}