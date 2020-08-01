package vamshi;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Divisible().divisible(10);
	}
	
	
	public void divisible(int number) {
		
		if((number%2)==0 || (number%3)==0) {
		
			System.out.println("number is divisble by 2  "+" " + number );
		
		} /*
			 * else if( (number%3)==0) { System.out.println("number is divisble by 3" + " "+
			 * number);
			 * 
			 * }
			 */else {
			
			System.out.println("not divisible by 2 or 3");
		}
	}

}
