package com.hec.aurora.util;

import org.springframework.beans.BeansException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Springfactory implements ApplicationContextAware {

	public static ApplicationContext applicationContext;

	// private static ApplicationContext context;
	public Springfactory() {
		// TODO Auto-generated constructor stub

		System.out.println(this.getClass().getName());

	}

	public void setApplicationContext(ApplicationContext applicationContext)

			throws BeansException {

		this.applicationContext = applicationContext;
		System.out.println(this.applicationContext.toString());

	}

	/**
	 * 根据beanName名字取得bean
	 * 
	 * @param beanName
	 * @return
	 */
	public static <T> T getBean(String beanName) {
		if (null != applicationContext) {
			return (T) applicationContext.getBean(beanName);
		}
		return null;
	}

}