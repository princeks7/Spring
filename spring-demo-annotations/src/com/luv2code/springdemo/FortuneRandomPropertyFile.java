package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class FortuneRandomPropertyFile implements FortuneService {
	
	// create an array of strings
	    @Value("${for.fortune}")
		private String[] data ;
		
		// create a ramdom number generator
		private Random myRandom = new Random();
		
		@Override
		public String getFortune() {
			int index = myRandom.nextInt(data.length);
			return data[index];
		}


}
