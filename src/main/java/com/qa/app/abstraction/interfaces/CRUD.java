package com.qa.app.abstraction.interfaces;

import java.util.ArrayList;

public interface CRUD {

	//when an interface only has one abstract method in it - functional interface
	
	//only expecting abstract methods
	
	void create();
	
	ArrayList<String> read();
	
	void update();
	
	void delete();
}
