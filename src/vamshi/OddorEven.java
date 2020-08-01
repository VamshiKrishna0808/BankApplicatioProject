package vamshi;

import java.util.Scanner;

public class OddorEven {
	
	public static void main(String args[]) {
		
		OddorEven number = new OddorEven();
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		number.oddoreven(sc.nextInt());
		
	}
	
	
	public void oddoreven(int number) {
		
		if(number%2==0) {
			System.out.println("Number is even" + " " +number);
		}else {
			System.out.println("Number is odd" + " "+ number);
		}
		
	}

}
