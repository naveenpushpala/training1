package com.sapient.Reader;

public class ExceptionDemo {

	public static void main(String[] args) {
		MyFileReader fileReader = new MyFileReader("c:\\a.txt");
			try {
				fileReader.print();
				int i=10;
				int j=0;
				System.out.println(i/j);
			} 
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			catch(Throwable e){
				System.out.println("supre class");
			}
		
			
			
			
		
	}
	
	
}
