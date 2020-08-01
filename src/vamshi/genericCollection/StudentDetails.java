package vamshi.genericCollection;

import java.util.Date;
import java.util.List;

public class StudentDetails {

	private String name;
	private String standard;
	private Date Dob;
	private String fatherName;
	private String mother;
	private List<ExamScore> examscore;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public Date getDob() {
		return Dob;
	}

	public void setDob(Date dob) {
		Dob = dob;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	public List<ExamScore> getExamscore() {
		return examscore;
	}

	public void setExamscore(List<ExamScore> examscore) {
		this.examscore = examscore;
	}

}
