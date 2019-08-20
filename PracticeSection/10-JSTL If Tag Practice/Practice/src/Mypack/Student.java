package Mypack;

public class Student {
	private String name;
	private String gender;
	private String address;
	private double gpa;
	
	public Student() {}
	
	public Student(String name, String gender, String address, double gpa) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}
