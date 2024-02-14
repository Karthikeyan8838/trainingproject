package com.gp.bean;

import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
//	@Min(value = 2000,message = "Student id Must be above 2000")
	private int studentid;
	private String name;
	private int age;
	private String dob;
	private int batchno;
	private int courseid;
	private String place;
	private String qualification;
	private double cgpa;
	private String phno;
//	@Email(message = "Enter valid emailid")
	private String mailid;
//	@Pattern(regexp = "^[0-9]{10}$", message = "Please enter a valid 10-digit phone number")
	private String password;
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getBatchno() {
		return batchno;
	}
	public void setBatchno(int batchno) {
		this.batchno = batchno;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, batchno, cgpa, courseid, dob, mailid, name, password, phno, place, qualification,
				studentid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && batchno == other.batchno
				&& Double.doubleToLongBits(cgpa) == Double.doubleToLongBits(other.cgpa) && courseid == other.courseid
				&& Objects.equals(dob, other.dob) && Objects.equals(mailid, other.mailid)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(phno, other.phno) && Objects.equals(place, other.place)
				&& Objects.equals(qualification, other.qualification) && studentid == other.studentid;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", age=" + age + ", dob=" + dob + ", batchno="
				+ batchno + ", courseid=" + courseid + ", place=" + place + ", qualification=" + qualification
				+ ", cgpa=" + cgpa + ", phno=" + phno + ", mailid=" + mailid + ", password=" + password + "]";
	}
	public Student(int studentid, String name, int age, String dob, int batchno, int courseid, String place,
			String qualification, double cgpa, String phno, String mailid, String password) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.batchno = batchno;
		this.courseid = courseid;
		this.place = place;
		this.qualification = qualification;
		this.cgpa = cgpa;
		this.phno = phno;
		this.mailid = mailid;
		this.password = password;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}

	
}
