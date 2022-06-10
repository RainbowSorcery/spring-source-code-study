package com.lyra.service;

import com.lyra.condition.ComponentCondit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class UserService {


	protected OrderService orderService() {

		return null;
	}

	public void test() {
		System.out.println("Hello world");
	}


}
