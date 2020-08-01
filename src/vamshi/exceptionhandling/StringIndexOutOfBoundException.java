package vamshi.exceptionhandling;

public class StringIndexOutOfBoundException {
	
	String st= "hello Worlds every time";
	
	public static void main(String args[]) {
		
		try {
			new StringIndexOutOfBoundException().method();
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
	}
	
	
	public void method() {
		String st= "hello Worlds every time";
		
		System.out.println(st.charAt(55));
		
	}
	

}
