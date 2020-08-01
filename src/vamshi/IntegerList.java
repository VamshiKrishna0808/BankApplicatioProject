package vamshi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new IntegerList().sort(100, 16, 15);
		
	}

	public void sort(int number1, int number2 , int number3) {
		List<Integer> list = new ArrayList<>();
	
		list.add(number1);
		list.add(number2);
		list.add(number3);
		Collections.sort(list);	
		System.out.println(list);
		
		}
		
		
		
	}
	
	
	
