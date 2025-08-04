package com.facebook;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//User u=new User("meghana","1234");
		User u=new User();
		u.setUsername("lavanya");
		u.setPassword("12345");
		System.out.println(u.getUsername());
		System.out.println(u.getPassword());
	}

}
