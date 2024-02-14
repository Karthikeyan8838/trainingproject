package com.gp.bean;

import java.util.*;

public class Enrollment {
	private int enrollmentId;
	private int studentId;
	private int courseId;
	private String enrollmentDate;
	private double paid;
	private double courseamount;
	private double balence;
	private double amountpaid;
	public int getEnrollmentId() {
		return enrollmentId;
	}
	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	public double getPaid() {
		return paid;
	}
	public void setPaid(double paid) {
		this.paid = paid;
	}
	public double getCourseamount() {
		return courseamount;
	}
	public void setCourseamount(double courseamount) {
		this.courseamount = courseamount;
	}
	public double getBalence() {
		return balence;
	}
	public void setBalence(double balence) {
		this.balence = balence;
	}
	public double getAmountpaid() {
		return amountpaid;
	}
	public void setAmountpaid(double amountpaid) {
		this.amountpaid = amountpaid;
	}
	@Override
	public int hashCode() {
		return Objects.hash(amountpaid, balence, courseId, courseamount, enrollmentDate, enrollmentId, paid, studentId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enrollment other = (Enrollment) obj;
		return Double.doubleToLongBits(amountpaid) == Double.doubleToLongBits(other.amountpaid)
				&& Double.doubleToLongBits(balence) == Double.doubleToLongBits(other.balence)
				&& courseId == other.courseId
				&& Double.doubleToLongBits(courseamount) == Double.doubleToLongBits(other.courseamount)
				&& Objects.equals(enrollmentDate, other.enrollmentDate) && enrollmentId == other.enrollmentId
				&& Double.doubleToLongBits(paid) == Double.doubleToLongBits(other.paid) && studentId == other.studentId;
	}
	@Override
	public String toString() {
		return "Enrollment [enrollmentId=" + enrollmentId + ", studentId=" + studentId + ", courseId=" + courseId
				+ ", enrollmentDate=" + enrollmentDate + ", paid=" + paid + ", courseamount=" + courseamount
				+ ", balence=" + balence + ", amountpaid=" + amountpaid + "]";
	}
	public Enrollment(int enrollmentId, int studentId, int courseId, String enrollmentDate, double paid,
			double courseamount, double balence, double amountpaid) {
		super();
		this.enrollmentId = enrollmentId;
		this.studentId = studentId;
		this.courseId = courseId;
		this.enrollmentDate = enrollmentDate;
		this.paid = paid;
		this.courseamount = courseamount;
		this.balence = balence;
		this.amountpaid = amountpaid;
	}
	public Enrollment() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
}
