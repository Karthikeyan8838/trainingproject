package com.gp.service;

import java.util.List;

import com.gp.bean.Course;
import com.gp.bean.Trainer;
import com.gp.bean.Training;
import com.gp.exception.NoAccountException;

public interface TrainerService {
	public Training trainingSchedule(String idtrainer) throws NoAccountException;
	public Course getCoursedetails(int courseid) throws NoAccountException;
	public Trainer getTrainerbyId(String idtrainer) throws NoAccountException;
	public List<Course> getallCourseid();
	public List<Course> getCourseList();
}
