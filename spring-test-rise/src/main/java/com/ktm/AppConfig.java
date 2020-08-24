package com.ktm;


import com.ktm.util.MyImportBeanDefinitionRegistar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.ktm")
@Import(MyImportBeanDefinitionRegistar.class)
public class AppConfig {


	void test() {
		System.out.println("11111111111");
	}


//	@Bean
//	public String create() {
//		return new String("456");
//	}
}
