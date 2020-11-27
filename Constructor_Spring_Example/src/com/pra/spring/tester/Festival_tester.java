package com.pra.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pra.spring.files.Festival;
import com.pra.spring.files.Season;

public class Festival_tester {

	public static void main(String[] args) {

		String xmlFile = "resources/context.xml";
		// instantiation...initialize
		ApplicationContext spring = new ClassPathXmlApplicationContext(xmlFile);
		Festival refOfFestival = spring.getBean(Festival.class);
		String name = refOfFestival.getName();
		System.out.println(name);
		/*Season refOfSeason = spring.getBean("summerSeason", Season.class);
		refOfSeason.display();
		refOfFestival.celebration("Srikanth");*/

	}

}
