package com.org.accessmodifiers.test;

import com.org.accessmodifiers.AccesserMutator;

public class AccesserMutatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccesserMutator accesserMutator =new AccesserMutator();
		
		accesserMutator.setId(1);
		accesserMutator.setName("Priyanka");
		accesserMutator.setEmpStatus(true);
		accesserMutator.setSal(200000);
		
		System.out.println(accesserMutator.getId());
		System.out.println(accesserMutator.getName());
		
		System.out.println(accesserMutator.getSal());
		
		System.out.println(accesserMutator.isEmpStatus());
		
		
		
		
	}

}
