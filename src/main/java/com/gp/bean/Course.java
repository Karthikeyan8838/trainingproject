package com.gp.bean;

import java.util.Objects;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Course {
	//@Min(value = 1000 , message = "Please enter the value above 1000")
	private int courseid;
	//@Size(min = 4 , message = "Please minimum of 4 characters")
	private String coursename;
	//@Size (min = 50, message = "Please minimum of 50 words")
	private String coursedescription;
	//@Size(min = 50, message = "Please enter minimum of 50 words")
	private String coursebenefits;
	private String courseduration;
	
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCoursedescription() {
		return coursedescription;
	}
	public void setCoursedescription(String coursedescription) {
		this.coursedescription = coursedescription;
	}
	public String getCoursebenefits() {
		return coursebenefits;
	}
	public void setCoursebenefits(String coursebenefits) {
		this.coursebenefits = coursebenefits;
	}
	public String getCourseduration() {
		return courseduration;
	}
	public void setCourseduration(String courseduration) {
		this.courseduration = courseduration;
	}
	@Override
	public int hashCode() {
		return Objects.hash(coursebenefits, coursedescription, courseduration, courseid, coursename);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(coursebenefits, other.coursebenefits)
				&& Objects.equals(coursedescription, other.coursedescription)
				&& Objects.equals(courseduration, other.courseduration) && Objects.equals(courseid, other.courseid)
				&& Objects.equals(coursename, other.coursename);
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", coursedescription="
				+ coursedescription + ", coursebenefits=" + coursebenefits + ", courseduration=" + courseduration + "]";
	}
	public Course(int courseid, String coursename, String coursedescription, String coursebenefits,
			String courseduration) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.coursedescription = coursedescription;
		this.coursebenefits = coursebenefits;
		this.courseduration = courseduration;
	}
	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	

}
	