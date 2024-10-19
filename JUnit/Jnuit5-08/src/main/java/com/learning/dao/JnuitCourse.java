package com.learning.dao;

public class JnuitCourse implements Course {

	@Override
	public boolean coursePurchased()
	{
		System.out.println("Jnuit course purchased");
		return true;
	}
}
