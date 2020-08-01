package vamshi.HashMapStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import vamshi.map.Student;

public class MapRetrive {

	public static void main(String args[]) {
		
		Map<Integer,Integer> MapRetrive = new HashMap<>();
		List<Integer> list= new ArrayList<>();
		
		int id;
		int value;
		Scanner sc = new Scanner(System.in);
		for(int i= 0; i<10; i++) {
			
			System.out.println("enter the key ");
			id= sc.nextInt();
			System.out.println("enter the Value ");
			value= sc.nextInt();
			if(MapRetrive.containsKey(id)) {
				System.out.println("please enter unique key");
			}else {
				MapRetrive.put(id,value);
			}
			
		}
		
		Set mapSet = MapRetrive.entrySet();// Step 1
		Iterator mapSetiter = mapSet.iterator();// Step 2
		while (mapSetiter.hasNext()) {

			Map.Entry entry = (Map.Entry) mapSetiter.next();
			System.out.println("value"+ " "+entry.getKey()+" value "+" "+entry.getValue() );
			
			
			
		list.add((Integer) entry.getKey());
			
		}
		
		for (Integer intr : list) {
			
			System.out.println("list values" + " "+intr.valueOf(intr));
			
			
			
			
		}
	}
	
}
