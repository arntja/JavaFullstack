package com.navin.SpringAnno;

import org.springframework.stereotype.Component;

@Component
//@primary
public class Snapdragon implements MobileProcessor {

	public void process() {
		System.out.println("World's best cpu");
	}

}
