package com.gp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gp.bean.Course;
import com.gp.bean.Trainer;
import com.gp.bean.Training;
import com.gp.dao.AdminDAO;
import com.gp.dao.TrainerDAO;
import com.gp.exception.NoAccountException;

@Service("trainerservice")
public class TrainerServiceImpl implements TrainerService{
	
	@Autowired
	private TrainerDAO trainerdao;
	
	
	@Override
	public Training trainingSchedule(String  idtrainer) throws NoAccountException {
		// TODO Auto-generated method stub
		Training ob=trainerdao.getTrainingSchedule(idtrainer);
		if(ob==null || ob.getIdtrainer()==0) {
			throw new NoAccountException("Training with this ID "+idtrainer + "does not exists");
		}
		// TODO Auto-generated method stub
		return ob;
	}


	@Override
	public Course getCoursedetails(int courseid) throws NoAccountException {
		// TODO Auto-generated method stub
		Course ob = trainerdao.getCoursedetails(courseid);
		if(ob==null || ob.getCourseid()==0) {
			throw new NoAccountException("Course with courseid "+courseid + "does not exists");
		}
		return ob;
	}


	@Override
	public Trainer getTrainerbyId(String idtrainer) throws NoAccountException {
		// TODO Auto-generated method stub
		Trainer ob = trainerdao.getTrainerbyId(idtrainer);
		if(ob==null || ob.getIdtrainer() == 0) {
			throw new NoAccountException("Trainer with courseid "+idtrainer + "does not exists");
		}
		return ob;
	}


	@Override
	public List<Course> getallCourseid() {
		// TODO Auto-generated method stub
		return trainerdao.getallCourseid();
	}


	@Override
	public List<Course> getCourseList() {
		// TODO Auto-generated method stub
		return trainerdao.getCourseList();
	}

//	@Autowired
//	AdminDAO admindao;
//	
//	@Override
//	public void trainingSchedule(Training tr) {
//		// TODO Auto-generated method stub
//		System.out.println(tr);
//		admindao.TrainingSchedule(tr);
//	}
//	
}
