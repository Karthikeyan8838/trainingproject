package com.gp.bean;

import java.util.Objects;

public class Request {
	int requestid;
	int studentid;
	String coursename;
	String phno;
	String date;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getRequestid() {
		return requestid;
	}
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	@Override
	public int hashCode() {
		return Objects.hash(coursename, phno, requestid, studentid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Request other = (Request) obj;
		return Objects.equals(coursename, other.coursename) && Objects.equals(phno, other.phno)
				&& requestid == other.requestid && studentid == other.studentid;
	}
	@Override
	public String toString() {
		return "Request [requestid=" + requestid + ", studentid=" + studentid + ", coursename=" + coursename + ", phno="
				+ phno + "date = "+date+"]";
	}
	public Request(int requestid, int studentid, String coursename, String phno,String date) {
		super();
		this.requestid = requestid;
		this.studentid = studentid;
		this.coursename = coursename;
		this.phno = phno;
		this.date = date;
	}
	public Request() {
		
		// TODO Auto-generated constructor stub
	}
	
	
}
