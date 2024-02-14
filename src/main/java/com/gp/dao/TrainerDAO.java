package com.gp.dao;

import java.util.List;

import com.gp.bean.Course;
import com.gp.bean.Trainer;
import com.gp.bean.Training;

public interface TrainerDAO {
	public Training getTrainingSchedule(String idtrainer);
	public Trainer getTrainerbyId(String idtrainer);
	public Course getCoursedetails(int courseid);
	public List<Course> getallCourseid();
	public List<Course> getCourseList();

}
