package com.sapient.Reader;

import javax.management.BadBinaryOpValueExpException;

public class MyFileReader {

	
	private String fileName;
	
	MyFileReader(String fileName)
	{
		super();
		this.fileName=fileName;
	}



public void print() throws Exception 
{
	boolean isFileExists = false;
	
	if(isFileExists == false)
	{
		Exception e = new Exception("FIle Not Found Exception");
		throw e;
	}
		
	
}


}