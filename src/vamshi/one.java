package vamshi;

public class one {

	int array[] = {1,2,3};
	
	int number;
	
	public  void findNumber( int number) {

		boolean isNumberPresent=false;
		
		for(int i =0; i<array.length;i++) {
			if(number==array[i]){	
				isNumberPresent=true;
			}
		}
		if(isNumberPresent)
			System.out.println("Number found :"+number);
		else
			System.out.println("number not found :"+number);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new one().findNumber(5);
		
	}

}
