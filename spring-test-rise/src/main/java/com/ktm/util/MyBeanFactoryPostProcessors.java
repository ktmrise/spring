package com.ktm.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;


@Component
public class MyBeanFactoryPostProcessors implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractBeanDefinition a = (AbstractBeanDefinition) beanFactory.getBeanDefinition("a");
		a.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
	}
}
