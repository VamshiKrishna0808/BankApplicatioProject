package vamshi;

public class Reverse {


	
	public void reverse() {
	
		String array[] = {"vamshi", "krishna", "rayarao"};
	     
		
		int n= array.length;
		
		String[] reverse = new String[n];
		
		
		for( int i=0; i<array.length; i++) {
			
			reverse[n-1]= array[i];
			n=n-1;
			
		}
		
		for(int k=0; k<reverse.length; k++) {
			
			System.out.println("reverse of array is " + " " + reverse[k]);
			
		}
		
		for( int i=array.length; i>0; i--) {
			System.out.println("reverse of array is logic 2 " + " " + array[i-1]);
		}
		
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Reverse().reverse();
	}

}
