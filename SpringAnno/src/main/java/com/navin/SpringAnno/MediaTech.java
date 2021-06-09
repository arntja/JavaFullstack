package com.navin.SpringAnno;

import org.springframework.stereotype.Component;

@Component
public class MediaTech implements MobileProcessor {

	public void process() {
		System.out.println("world 2nd best cpu");
	}

}
