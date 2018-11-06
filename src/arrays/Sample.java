package arrays;

public class Sample {
	
	public String x ;
	public String y;
	
	ArraySample as = new ArraySample();
	public void setup() {
		
		System.out.println(x);
		System.out.println(y);
		as.test();
		System.out.println(as.x);
	}
	
	
	public int sum() {
		
		int a =12;
		int b=13;
		int c = a+b;	
		return c;
	}
	
	

	public static void main(String[] args) {

		Sample s = new Sample();
		s.setup();
		int x = s.sum();
		System.out.println(x);
	
	}
	
	
	
	
	

}
