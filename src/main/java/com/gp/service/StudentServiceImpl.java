package com.gp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gp.bean.Course;
import com.gp.bean.Feedback;
import com.gp.bean.Request;
import com.gp.bean.Student;
import com.gp.bean.Trainer;
import com.gp.bean.Training;
import com.gp.dao.StudentDAO;
import com.gp.dao.TrainerDAO;
import com.gp.exception.NoAccountException;
@Service("studentservice")
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO studentdao;
	
	
	@Override
	public Training getStudentSchedule(String studentid) throws NoAccountException {
		// TODO Auto-generated method stub
		Training ob=studentdao.getStudentSchedule(studentid);
		if(ob==null || ob.getStudentid()==0) {
			throw new NoAccountException("Training with this ID "+studentid + "does not exists");
		}
		// TODO Auto-generated method stub
		return ob;
	}

	@Override
	public Student getStudentbyId(String studentid) throws NoAccountException {
		
		Student ob=studentdao.getStudentbyId(studentid);
		if(ob==null || ob.getStudentid() == 0) {
			throw new NoAccountException("Student with this ID "+studentid + "does not exists");
		}
		// TODO Auto-generated method stub
		return ob;
	}

	@Override
	public Course getstudentCoursedetails(int courseid) throws NoAccountException {
		// TODO Auto-generated method stub
		Course ob = studentdao.getstudentCoursedetails(courseid);
		if(ob==null || ob.getCourseid()==0) {
			throw new NoAccountException("Course with courseid "+courseid + "does not exists");
		}
		return ob;
	}

	@Override
	public int addFeedback(Feedback f) {
		// TODO Auto-generated method stub
		return studentdao.addfeedback(f);
	}
	
	@Override
	public List<Trainer> getallTrainerid() {
		// TODO Auto-generated method stub
		return studentdao.getallTrainerid();
	}

	@Override
	public List<Course> getCourseList() {
		// TODO Auto-generated method stub
		return studentdao.getCourseList();
	}
	public int addrequest(Request q) {
		return studentdao.addrequest(q);
	}
	public List<Course> getallCourseid(){
		return studentdao.getallCourseid();
	}
	

}
