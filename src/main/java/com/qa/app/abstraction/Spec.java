package com.qa.app.abstraction;

import java.util.ArrayList;

public abstract class Spec {

	//abstract classes can have abstract and non-abstract methods
	//normal classes can only have non-abstract methods(methods with implementation)
	//interfaces can only have abstract methods
	
	//abstract method
	abstract void create();
	
	abstract ArrayList<String> read();
	
	//non-abstract method
	
	public String hW() {
		return "Hello World";
	}
	
}
