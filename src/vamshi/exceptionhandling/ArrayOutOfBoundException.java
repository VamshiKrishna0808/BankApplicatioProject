package vamshi.exceptionhandling;



public class ArrayOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		try {
			new ArrayOutOfBoundException().Array();
		}

		 catch (Exception e) {
			// TODO: handle exception
			 
			System.out.println("stack trace");
			e.printStackTrace();
		}
	}

	public void Array() {
		int array[]= new int[5];
		
		for(int i =0; i<10; i++) {
			
			array[i]= i;
			System.out.println("array "+ array[i]);
		}
		
	}
	
	
}
