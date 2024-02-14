package com.gp.service;

import java.util.List;

import com.gp.bean.Course;
import com.gp.bean.Feedback;
import com.gp.bean.Request;
import com.gp.bean.Student;
import com.gp.bean.Trainer;
import com.gp.bean.Training;
import com.gp.exception.NoAccountException;

public interface StudentService {
	public Training getStudentSchedule(String studentId) throws NoAccountException;
	public Student getStudentbyId(String studentid)throws NoAccountException;
	public Course getstudentCoursedetails(int courseid)throws NoAccountException;
	public int addFeedback(Feedback f);
	public List<Trainer> getallTrainerid();
	public List<Course> getCourseList();
	public int addrequest(Request q);
	public List<Course> getallCourseid();
}
