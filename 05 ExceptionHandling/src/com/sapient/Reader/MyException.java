package com.sapient.Reader;

public class MyException extends Exception {

	private Object object;
	
	public MyException(Object obj,String message) {
		// TODO Auto-generated constructor stub
		super(message);
		this.object=obj;
		obj.toString();
		
	}
}
