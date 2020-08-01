package vamshi.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapUnique {

	public static void main(String args[]) {
		int studentId;
		Map<Integer, List<Student>> studentMap = new HashMap<>();
		List<Student> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int i;
		// System.out.println("you want to continue");

		// int i; System.out.println("enter name");
		// 1 studentId = sc.nextInt();
		/**
		 * System.out.println("Enter the confirmation Weather you want to add values");
		 * if((i=sc.nextInt())==1) { System.out.println("enter the Student Id");
		 * studentId =(sc.nextInt());
		 */

		// System.out.println("Values should be in format of String, int, int, String");

		/*
		 * System.out.println("enter name");
		 * 
		 * //String Name1= sc.nextLine();
		 * 
		 * System.out.println(" phone number");
		 * 
		 * int id = sc.nextInt();
		 * 
		 * System.out.println("id");
		 * 
		 * int phoneNumber = sc.nextInt();
		 * 
		 * System.out.println("address");
		 * 
		 * String address = sc.nextLine();
		 */

		// if((i=sc.nextInt())==1) {

		// studentId = sc.nextInt();

		// student.add(MapUnique.student("vamshi", 12, 12345, "krishna"));
		/*
		 * if() { System.out.println("dublicate Keys are not allowed"); }else {
		 * studentMap.put(studentId, student); }
		 */

		Student student = MapUnique.student("vamshi", 12, 123456, "krishna");

		studentList.add(student);
		student = MapUnique.student("vamshi", 12, 123456, "krishna");
		studentList.add(student);

		for (int j = 0; j < 10; j++) {

			System.out.println("Key : ");

			studentId = sc.nextInt();

			System.out.println("Name : ");
			String name = sc.nextLine();
			System.out.println("Address : ");
			String address = sc.nextLine();
			student = MapUnique.student(name, 12, 123456, address);

			studentList.add(student);
			student = MapUnique.student(name, 12, 123456, address);
			studentList.add(student);

			if (studentMap.containsKey(studentId)) {
				System.out.println("program terminated ");

			} else {

				System.out.println("continue to add values");
				studentMap.put(studentId, studentList);

			}

		}
		Set studentInfoSet = studentMap.entrySet();// Step 1
		Iterator studentInfoSetItr = studentInfoSet.iterator();// Step 2
		while (studentInfoSetItr.hasNext()) {

			Map.Entry entry = (Map.Entry) studentInfoSetItr.next();
			System.out.println("*************" + entry.getKey() + "*********************");
			List<Student> emp = (List<Student>) entry.getValue();
			for (Student List : studentList) {
				System.out.println(List.getName() + " " + List.getId());

			}
		}
	}

	public static Student student(String name, int id, int phoneNumber, String address) {

		Student student = new Student();

		student.setAddress(address);
		student.setId(id);
		student.setPhoneNumber(phoneNumber);
		student.setName(name);

		return student;

	}

}
