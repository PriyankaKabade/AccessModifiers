package com.org.accessmodifiers.test;

import com.org.accessmodifiers.ProtectedDemo;

public class SubclassProtectedDemo extends ProtectedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubclassProtectedDemo subclassProtectedDemo=new ProtectedDemo();
		
		System.out.println(subclassProtectedDemo.getFirstNo());
		
		System.out.println(subclassProtectedDemo.addition());
		
	}

}
