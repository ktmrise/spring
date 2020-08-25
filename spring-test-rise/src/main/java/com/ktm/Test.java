package com.ktm;

import com.ktm.test.CustomBean;
import com.ktm.test.Fu;
import com.ktm.test.Zi;
import com.ktm.util.MyFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	//调试由大到小缩小范围
	public static void main(String[] args)  {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		Zi zi = (Zi) ac.getBean("com.ktm.test.Zi");
		System.out.println(zi);
	}
}
