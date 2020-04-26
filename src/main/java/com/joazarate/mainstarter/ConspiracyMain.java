package com.joazarate.mainstarter;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.joazarate.mainstarter.family.PazziFamily;

public class ConspiracyMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(SpringbootMainStarterApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		PazziFamily pazziFamily = applicationContext.getBean(PazziFamily.class);
		
		System.out.println(pazziFamily.attack());
		
	}

}
