package com.gp.service;

import java.util.List;

import com.gp.bean.*;
import com.gp.exception.NoAccountException;

public interface AdminService {
	
	// Student process ***********************
	public int addStudent(Student s);
	public int updateStudent(Student s);
	public int deleteStudent(int studentid);
	public Student getStudentId(int studentid) throws NoAccountException;
	public List<Student> getStudentList();
	
	// Trainer process **********************
	public int addTrainer(Trainer t);
	public int updateTrainer(Trainer t);
	public int deleteTrainer(int idtrainer);
	public Trainer getTrainerbyId(int idtrainer) throws NoAccountException;
	public List<Trainer> getTrainerList();
	public List<Trainer> getallTrainerid();
	
	
	// Course Details *************************
	public int addCourse(Course c);
	public int updateCourse(Course c);
	public int deleteCourse(int courseid);
	public Course getCoursebyId(int courseid) throws NoAccountException;
	public List<Course> getCourseList();
	public List<Course> getallCourseid();
	
	
	// Training Details ************
	public int addTraining(Training tr);
	public int updateTraining(Training tr);
	public int deleteTraining(int trainingid);
	public Training getTrainingbyId(int trainingid) throws NoAccountException;
	public List<Training> getTrainingList();
	
	
	// Login Details **************
	public boolean getemail(String email, String password);
	public boolean getstudentemail(String email, String password);
	public List<Feedback> getFeedbacklist();
	public int deleteFeedback(int feedbackid);
	public Feedback getbyFeedbackId(int feedbackid);
	public Student getstudentname(String studentid);
	public Trainer gettraienrname(String idtraienr);
	public List<Request> getrequestList() ;
	public Request getbyRequestId(int requestid) throws NoAccountException;
	public int deleteRequest(int requestid);
	
	// Enrollment Details **************************
	public int addEnrollment(Enrollment e);
	public int updateEnrollment(Enrollment e);
	public int deleteEnrollment(int enrollmentId);
	public Enrollment getbyenrollmentId(int enrollmentId) throws NoAccountException;
	public List<Enrollment> getEnrollmentList();
	public int amountAdded(double amount, Enrollment e);
	
	
}
