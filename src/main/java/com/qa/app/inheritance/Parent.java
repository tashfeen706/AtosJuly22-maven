package com.qa.app.inheritance;

public class Parent extends GrandParent{

	String lastname = "mickey";
	
	String eyecolour = "blue";
	
	public void info() {
		System.out.println(lastname + " has eye color of " + eyecolour);
	}
	
	
}
