package com.org.accessmodifiers.test;

import com.org.accessmodifiers.PrivateDemo;

public class PrivateDemoTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateDemo privateDemo  = new PrivateDemo();
		
		privateDemo.setFirstNo(2);

		System.out.println(privateDemo.getFirstNo());

		System.out.println(privateDemo.addition());

	}

}
