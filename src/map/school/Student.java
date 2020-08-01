package map.school;

import java.util.Map;

public class Student {

	private String studentName;
	private int studentId;
	private String studnetAddress;
	private int studentPhoneNumber;
	private Map<String,Marks> marks;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudnetAddress() {
		return studnetAddress;
	}

	public void setStudnetAddress(String studnetAddress) {
		this.studnetAddress = studnetAddress;
	}

	public int getStudentPhoneNumber() {
		return studentPhoneNumber;
	}

	public void setStudentPhoneNumber(int studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}

	public Map<String, Marks> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Marks> marks) {
		this.marks = marks;
	}

	

}
