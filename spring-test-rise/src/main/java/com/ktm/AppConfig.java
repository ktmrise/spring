package com.ktm;


import com.ktm.util.MyImportBeanDefinitionRegistar;
import com.ktm.util.MySelect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.ktm")
@Import({MyImportBeanDefinitionRegistar.class, MySelect.class})
public class AppConfig {


	void test() {
		System.out.println("11111111111");
	}


//	@Bean
//	public String create() {
//		return new String("456");
//	}
}
