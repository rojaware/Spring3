package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LEES4
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Shop shop = new Shop("Scott");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Shop shop = (Shop)context.getBean("shop");
//		shop.setName("Scott");
		shop.speak();

		Address address = (Address)context.getBean("address");
		System.out.println(address);
		
		shop.setAddress(address);
		System.out.println(shop);
		((ClassPathXmlApplicationContext)context).close();
	}

}
