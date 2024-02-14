package com.gp.dao;

import java.util.List;

import com.gp.bean.Course;
import com.gp.bean.Feedback;
import com.gp.bean.Request;
import com.gp.bean.Student;
import com.gp.bean.Trainer;
import com.gp.bean.Training;

public interface StudentDAO {
	public Training getStudentSchedule(String studentid);
	public Student getStudentbyId(String studentid);
	public Course getstudentCoursedetails(int courseid);
	public int addfeedback(Feedback f);
	public List<Trainer> getallTrainerid();
	public List<Course> getCourseList();
	public int addrequest(Request q);
	public List<Course> getallCourseid();
	
}
