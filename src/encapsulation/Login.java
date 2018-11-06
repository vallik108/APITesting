package encapsulation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Login {
	
	
	
	private int x =12;
	private int y=0 ;
	
	String name  = null;

	String[] arr = {"a","b","c"};
	
	String num ="sudharsan";

	public void getData() throws FileNotFoundException {
	
		
		FileInputStream file = new FileInputStream("");
		try {
			
	
	System.out.println("Hello World");
	System.out.println("Hello World");

	System.out.println("Hello World");

	//Arithmetic Exception
	System.out.println(x/y);
	
	//NullPointerException
	//System.out.println(name.length());
	
	//ArrayIndexOutOfBoundsException
	//System.out.println(arr[4]);
	
	//NumberFormatException
	//System.out.println(Integer.parseInt(num));
	
	System.out.println("Hello World");

	System.out.println("Hello World");

	System.out.println("Hello World");

	System.out.println("Hello World");
	
	
	
	
	}
			
	catch(ArithmeticException e) {
		System.out.println("ArithmeticException");
			
	}
	catch(NumberFormatException e) {
		System.out.println("numberformat");
	}
	catch(Exception e) {
		
		System.out.println("exception");
	}
	
	finally {
		
		System.out.println("finally");
	}

	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Login log = new Login();
		log.getData();
	}
	
	
	
	
	
	
	
	
	

}
