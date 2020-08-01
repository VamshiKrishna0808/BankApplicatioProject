package map.school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class MapKeyMain {

	public static void main(String[] args) {

		
		Map<String,List<Student>> map = new HashMap<>();
		
		List<Student> student = new ArrayList<>();
		student.add(MapKeyMain.student("vamshi", 1, "sangareddy", 12345));
		student.add(MapKeyMain.student("krishna", 2, "sangareddy", 279317));
		
		map.put("KarunaHighSchool", student);

		Set studentSet = map.entrySet();// Step 1
		Iterator studentInfoSetItr = studentSet.iterator();// Step 2
		while (studentInfoSetItr.hasNext()) {

			Map.Entry entry = (Map.Entry) studentInfoSetItr.next();
			System.out.println("*" +"SchoolName"+ entry.getKey() + "*");
			List<Student> emp = (List<Student>) entry.getValue();
			for (Student list : student) {
				System.out.println("student Name"+" "+list.getStudentName() + " " + list.getStudnetAddress()+" "+ list.getStudentPhoneNumber()+ " "+ list.getStudentId());
				if(null!=list.getMarks()) {
				
					Set marksSet = list.getMarks().entrySet();// Step 1
					Iterator marksInfoSetItr = marksSet.iterator();// Step 2
					while (marksInfoSetItr.hasNext()) {
						
					@SuppressWarnings("unchecked")
					Map.Entry<String,Marks> entryMarks = (Map.Entry<String,Marks>) marksInfoSetItr.next();
					
				    Marks mark = (Marks)entryMarks.getValue();
					
				    System.out.println(entryMarks.getKey()+" "+"marks"+ " " +mark.getMarkEnglish()+mark.getMarkMaths()+mark.getMarkScience()+ " "+mark.getTotal());	
					
					
				}
				}
			}
		
		}
		

	}

	
	public static Student student(String studentName, int studentId, String studnetAddress, int studentPhoneNumber) {
		
		Student student = new Student();
		
		student.setStudentId(studentId);
		student.setStudentName(studentName);
		student.setStudentPhoneNumber(studentPhoneNumber);
		student.setStudnetAddress(studnetAddress);
		Map<String, Marks> marks=new HashMap<>();
		marks.put("qauterly", MapKeyMain.marks(50, 60, 70));
		marks.put("halfyearly", MapKeyMain.marks(50, 60, 70));
		marks.put("yearly", MapKeyMain.marks(50, 60, 70));
		student.setMarks(marks);
		return student;
		
		
	}
	
	
	public static Marks marks(int markEnglish,int markMaths,int markScience) {
		
		Marks marks = new Marks();
		
		marks.setMarkEnglish(markEnglish);
		marks.setMarkMaths(markMaths);
		marks.setMarkScience(markScience);
		marks.setTotal(markMaths+markScience+markEnglish);
		return marks;
	
		
		
	}
	
}
