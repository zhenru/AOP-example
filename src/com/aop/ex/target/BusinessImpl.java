package com.aop.ex.target;

import org.springframework.stereotype.Component;

@Component
public class BusinessImpl implements Business {

	public void doSomeOperation() {
		System.out.println("working.");
	}

}
