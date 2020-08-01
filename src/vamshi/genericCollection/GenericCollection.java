package vamshi.genericCollection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenericCollection {


	public static void main(String[] args) {
		
		List<StudentDetails> studentdetails = new ArrayList<>();
		studentdetails.add(GenericCollection.student("vamshi", "tenth", new Date(), "raghu", "aruna"));
		studentdetails.add(GenericCollection.student("krishna", "seventh", new Date(), "raghu", "aruna"));
		studentdetails.add(GenericCollection.student("rayarao", "sixth", new Date(), "raghu", "aruna"));
		studentdetails.add(GenericCollection.student("anand", "fifth", new Date(), "raghu", "aruna"));
		
		
		for (StudentDetails studentDetails2 : studentdetails) {
			
			System.out.println("student name" + "" + studentDetails2.getName());
			System.out.println("studentstandard"+ " "+ studentDetails2.getStandard());
			System.out.println("student mother Name"+ " " + studentDetails2.getMother() );
			System.out.println("student fatherName" + " " + studentDetails2.getFatherName());
			System.out.println("student dob"+ " " + studentDetails2.getDob());
			for (ExamScore exam : studentDetails2.getExamscore()) {
				
				System.out.println("exam type" + exam.getExamType());
				System.out.println("exam score"+ exam.getExamScore());
			}
			
		}
		

	}
	
	
	public static StudentDetails student(String name, String standard,Date Dob, String fatherName, String mother) {
		
		StudentDetails student = new StudentDetails();
		
		student.setName(name);
		student.setStandard(standard);
		student.setMother(mother);
		student.setFatherName(fatherName);
		List<ExamScore> examscore = new ArrayList<>();
		examscore.add(GenericCollection.examscore("quartly", 45));
		examscore.add(GenericCollection.examscore("halfyearly", 65));
		examscore.add(GenericCollection.examscore("yearly", 75));
		student.setExamscore(examscore);
		return student;
	}

	public static ExamScore examscore(String examtype, int examScore) {
		
		ExamScore exam = new ExamScore();
		exam.setExamType(examtype);
		exam.setExamScore(examScore);
		return exam;
	}
	
}
