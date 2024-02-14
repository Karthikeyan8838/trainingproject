package com.gp.dao;

import java.util.List;

import com.gp.bean.Course;
import com.gp.bean.Enrollment;
import com.gp.bean.Feedback;
import com.gp.bean.Request;
import com.gp.bean.Student;
import com.gp.bean.Trainer;
import com.gp.bean.Training;

public interface AdminDAO {
//	Student *************
	public int addStudent(Student s);
	public int updateStudent(Student s);
	public int deleteStudent(int studentid);
	public Student getStudentId(int studentid);
	public List<Student> getStudentList();
	
//	Trainer ************
	public int addTrainer(Trainer t);
	public int updateTrainer(Trainer t);
	public int removeTrainer(int idtrainer);
	public Trainer getTrainerbyId(int idtrainer);
	public List<Trainer> getTrainerList();
	public List<Trainer> getallTrainerid();
	
	
	
//	Course ******************
	public int addCourse(Course c);
	public int updateCourse(Course c);
	public int deleteCourse(int courseid);
	public Course getCoursebyId(int courseid);
	public List<Course> getCourseList();
	public List<Course> getallCourseid();
	
	
//  Training ***********************
	public int addTraining(Training tr);
	public int updateTraining(Training tr);
	public int deleteTraining(int trainingid);	
	public Training getTrainingbyId(int trainingid);
	public List<Training> getTrainingList();
	
	
//	Login ****************
	public boolean trainerlogin(String email,String password);
	public boolean studentlogin(String email,String password);
	public List<Feedback> getFeedbackList();
	public int deleteFeedback(int feedbackid);
	public Feedback getbyFeedbackId(int feedbackid);
	public Student getstudentname(String studentid);
	public Trainer gettrainername(String idtrainer);
	public List<Request> getrequestList();
	public Request getbyRequestId(int requestid);
	public int deleteRequest(int requestid);
	
//	Student ********************
	public int addEnrollment(Enrollment e);
	public int updateEnrollment(Enrollment e);
	public int deleteEnrollment(int enrollmentId);
	public Enrollment getbyenrollmentId(int enrollmentId);
	public List<Enrollment> getEnrollmentList();
	
	
}
