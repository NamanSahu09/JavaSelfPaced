package com.learning.dao;

public class SprinbootCourse implements Course 
{

	@Override
	public boolean coursePurchased()
	{
		System.out.println("Spring Boot course purchased");
		return true;
	}

}
