package Inheritance;

public class AreaMethods {
	
	
	
	
	public void area(int a) {
		
		System.out.println(a*a);
		
	}
	
	
	
	public void area(long a) {
		
		System.out.println(a*a);
		
	}
	
	
	public void area(int a,int b) {
		
		System.out.println(a*b);
		
	}
	
	
	public void area(int a,int b ,int h) {
		
		
		System.out.println(a*b*h);
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		AreaMethods method = new AreaMethods();
		method.area(10);
	}

}
