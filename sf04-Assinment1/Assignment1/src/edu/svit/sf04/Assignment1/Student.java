package edu.svit.sf04.Assignment1;

public class Student {
	
	private String fullname;
	private String rollNumber;
	private String grade;
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	private String percentage;

	@Override
	public String toString() {
		return "Student [fullname=" + fullname + ", rollNumber=" + rollNumber + ", grade=" + grade + ", percentage="
				+ percentage + "]";
	}
	
	

}
