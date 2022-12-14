package com.org.accessmodifiers;

public class PrivateDemo {
	
	private int firstNo= 10;
	private int secondNo=20;
	
	
	public int addition(){
		
		//return name;
		
		return getFirstNo() + secondNo;
	}


	public int getFirstNo() {
		return firstNo;
	}


	public void setFirstNo(int firstNo) {
		this.firstNo = firstNo;
	}

	

}
