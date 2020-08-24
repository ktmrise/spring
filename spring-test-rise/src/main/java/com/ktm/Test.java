package com.ktm;

import com.ktm.test.CustomBean;
import com.ktm.test.Fu;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	//调试由大到小缩小范围
	public static void main(String[] args)  {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomBean cb = (CustomBean) ac.getBean("cb");
		cb.test();
	}
}
