package com.gp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gp.bean.Course;
import com.gp.bean.Enrollment;
import com.gp.bean.Feedback;
import com.gp.bean.Request;
import com.gp.bean.Student;
import com.gp.bean.Trainer;
import com.gp.bean.Training;
import com.gp.dao.AdminDAO;
import com.gp.dao.AdminDAOImpl;
import com.gp.exception.NoAccountException;

@Service("adminservice")
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminDAO admindao;

	@Override
	public int  addStudent(Student s) {
		// TODO Auto-generated method stub
		//System.out.println(s); 
		return admindao.addStudent(s);
	}

	@Override
	public int  addTrainer(Trainer t) {
		// TODO Auto-generated method stub
		return admindao.addTrainer(t);
	}

	@Override
	public int  updateStudent(Student s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		return admindao.updateStudent(s);
	}
 
	@Override
	public int  updateTrainer(Trainer t) {
		// TODO Auto-generated method stub
		return admindao.updateTrainer(t);
	}

	@Override
	public int deleteStudent(int studentid) {
		// TODO Auto-generated method stub
		return admindao.deleteStudent(studentid);
	}

	@Override
	public int  deleteTrainer(int idtrainer) {
		// TODO Auto-generated method stub
		return admindao.removeTrainer(idtrainer);  
	}

	@Override
	public int addCourse(Course c) {
		// TODO Auto-generated method stub
		return admindao.addCourse(c);
	}

	@Override
	public int addTraining(Training tr) {
		// TODO Auto-generated method stub
		return admindao.addTraining(tr);
	}
	
	public int updateCourse(Course c) {
		return admindao.updateCourse(c);
	}
	
	public int deleteCourse(int courseid) {
		return admindao.deleteCourse(courseid);
	}
	
	//@Override
		public Course getCoursebyId(int courseid) throws NoAccountException{
			Course ob=admindao.getCoursebyId(courseid);
			if(ob==null || ob.getCourseid()==0) {
				throw new NoAccountException("Course with courseid "+courseid + "does not exists");
			}
			return ob;
		}

		@Override
		public List<Course> getCourseList() {
			// TODO Auto-generated method stub
			return admindao.getCourseList();
		}

		@Override
		public int updateTraining(Training tr) {
			// TODO Auto-generated method stub
			return admindao.updateTraining(tr);
		}

		@Override
		public int deleteTraining(int trainingid) {
			// TODO Auto-generated method stub
			return admindao.deleteTraining(trainingid);
		}

		@Override
		public Training getTrainingbyId(int trainingid) throws NoAccountException{
			Training ob=admindao.getTrainingbyId(trainingid);
			if(ob==null || ob.getTrainingid() == 0) {
				throw new NoAccountException("Course with courseid "+trainingid + "does not exists");
			}
			// TODO Auto-generated method stub
			return ob;
		}

		@Override
		public List<Training> getTrainingList() {
			// TODO Auto-generated method stub
			return admindao.getTrainingList();
		}
		public boolean getemail(String idtrainer, String password) {
			return admindao.trainerlogin(idtrainer,password);
		}
		public boolean getstudentemail(String studentid, String password) {
			System.out.println(studentid + password);
			return admindao.studentlogin(studentid, password);
		}

		@Override
		public Student getStudentId(int studentid) throws NoAccountException {
			// TODO Auto-generated method stub
			Student ob=admindao.getStudentId(studentid);
			if(ob==null || ob.getStudentid()==0) {
				throw new NoAccountException("Student with Studentid "+studentid + "does not exists");
			}
			// TODO Auto-generated method stub
			return ob;
		}

		@Override
		public int addEnrollment(Enrollment e) {
			// TODO Auto-generated method stub
			return admindao.addEnrollment(e);
		}

		@Override
		public int updateEnrollment(Enrollment e) {
			// TODO Auto-generated method stub
			return admindao.updateEnrollment(e);
		}

		@Override
		public int deleteEnrollment(int enrollmentId) {
			// TODO Auto-generated method stub
			return admindao.deleteEnrollment(enrollmentId);
		}

		@Override
		public Enrollment getbyenrollmentId(int enrollmentId) throws NoAccountException {
			Enrollment ob=admindao.getbyenrollmentId(enrollmentId);
			if(ob==null || ob.getEnrollmentId()==0) {
				throw new NoAccountException("Student with Studentid "+enrollmentId + "does not exists");
			}
			// TODO Auto-generated method stub
			return ob;
		}

		@Override
		public List<Enrollment> getEnrollmentList() {
			// TODO Auto-generated method stub
			return admindao.getEnrollmentList();
		}
		
		public List<Course> getallCourseid(){
			return admindao.getallCourseid();
		}
		
		public Trainer getTrainerbyId(int idtrainer) throws NoAccountException {
			// TODO Auto-generated method stub
			Trainer ob = admindao.getTrainerbyId(idtrainer);
			if(ob==null || ob.getIdtrainer() == 0) {
				throw new NoAccountException("Course with courseid "+idtrainer + "does not exists");
			}
			return ob;
		}

		@Override
		public List<Trainer> getTrainerList() {
			// TODO Auto-generated method stub
			return admindao.getTrainerList();
		}

		@Override
		public int amountAdded(double amount, Enrollment e) {
			// TODO Auto-generated method stub
			double ca= e.getCourseamount();
			double p=e.getPaid();
			double am=p+amount;
			double bal = ca-am;
			e.setBalence(bal);
			return admindao.updateEnrollment(e);
		}

		@Override
		public List<Trainer> getallTrainerid() {
			// TODO Auto-generated method stub
			return admindao.getallTrainerid();
		}

		@Override
		public List<Student> getStudentList() {
			// TODO Auto-generated method stub
			return admindao.getStudentList();
		}
		
		public List<Feedback> getFeedbacklist(){
			return admindao.getFeedbackList();
		}
		public int deleteFeedback(int feedbackid) {
			return admindao.deleteFeedback(feedbackid);
		}

		@Override
		public Feedback getbyFeedbackId(int feedbackid) {
			// TODO Auto-generated method stub
			return admindao.getbyFeedbackId(feedbackid);
		}

		@Override
		public Student getstudentname(String studentid) {
			// TODO Auto-generated method stub
			return  admindao.getstudentname(studentid);
		}

		@Override
		public Trainer gettraienrname(String idtraienr) {
			// TODO Auto-generated method stub
			return admindao.gettrainername(idtraienr);
		}
		public List<Request> getrequestList() {
			return admindao.getrequestList();
		}
		public Request getbyRequestId(int requestid) throws NoAccountException {
			Request ob = admindao.getbyRequestId(requestid);
			if(ob==null || ob.getRequestid() == 0) {
				throw new NoAccountException("Request with requestid "+requestid + "does not exists");
			}
			return ob;			
		}
		public int deleteRequest(int requestid) {
			return admindao.deleteRequest(requestid);
		}
		

}
