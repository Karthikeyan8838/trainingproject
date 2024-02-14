package com.gp.bean;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;


public class Training {
	private int trainingid;
	private String trainingstartdate;
	private String trainingenddate;
	private int studentid;
	private int courseid;
	private int idtrainer;
	
	

	public int getTrainingid() {
		return trainingid;
	}



	public void setTrainingid(int trainingid) {
		this.trainingid = trainingid;
	}



	public String getTrainingstartdate() {
		return trainingstartdate;
	}



	public void setTrainingstartdate(String trainingstartdate) {
		this.trainingstartdate = trainingstartdate;
	}



	public String getTrainingenddate() {
		return trainingenddate;
	}



	public void setTrainingenddate(String trainingenddate) {
		this.trainingenddate = trainingenddate;
	}



	public int getStudentid() {
		return studentid;
	}



	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}



	public int getCourseid() {
		return courseid;
	}



	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}



	public int getIdtrainer() {
		return idtrainer;
	}



	public void setIdtrainer(int idtrainer) {
		this.idtrainer = idtrainer;
	}



	@Override
	public String toString() {
		return "Training [trainingid=" + trainingid + ", trainingstartdate=" + trainingstartdate + ", trainingenddate="
				+ trainingenddate + ", studentid=" + studentid + ", courseid=" + courseid + ", idtrainer=" + idtrainer
				+ "]";
	}



	public Training(int trainingid, String trainingstartdate, String trainingenddate, int studentid, int courseid,
			int idtrainer) {
		super();
		this.trainingid = trainingid;
		this.trainingstartdate = trainingstartdate;
		this.trainingenddate = trainingenddate;
		this.studentid = studentid;
		this.courseid = courseid;
		this.idtrainer = idtrainer;
	}



	@Override
	public int hashCode() {
		return Objects.hash(courseid, idtrainer, studentid, trainingenddate, trainingid, trainingstartdate);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Training other = (Training) obj;
		return Objects.equals(courseid, other.courseid) && idtrainer == other.idtrainer && studentid == other.studentid
				&& Objects.equals(trainingenddate, other.trainingenddate) && trainingid == other.trainingid
				&& Objects.equals(trainingstartdate, other.trainingstartdate);
	}



	public Training() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
