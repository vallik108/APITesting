package arrays;

 public class ArraySample {
	
	
	protected String x ="Test";
	
	protected void test() {
	
		
		int[] arr = {1,2,3,4,5,6};
		
		String[] st = {"ravi","prem","sudha","praveen"};
		
		
		
		/*for(int i=0;i<st.length;i++) {
			
			
			if(st[i].length()==4) {
				System.out.println(st[i]);
			}
			if(st[i].equals("ravi")) {
				
				System.out.println("matched");
				break;
			}
			
		}*/
		
		
		for(String out:st) {
			
			System.out.println(out);
		}
		
		
		String s ="sachin ramesh Tendulkar";
		
		
		String[] output = s.split(" ");
		
		System.out.println(output[0]);
		System.out.println(output[1]);
		System.out.println(output[2]);

	
	}
	

	public static void main(String[] args) {
		
		ArraySample arr = new ArraySample();
		arr.test();
	}
	
	
	
	

}
