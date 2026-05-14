package in.infogalaxy.beans;

public class Student {
	
	private int rollno;
	private String name;
	private String email;
	
	public int getrollno() {
		return rollno;
	}
	
	public void setrollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("Student Roll No. is : "+rollno);
		System.out.println("Student Name is : "+name);
		System.out.println("Student Email id is ; "+email);
	}
	
}
