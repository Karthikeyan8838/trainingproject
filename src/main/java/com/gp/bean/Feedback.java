package com.gp.bean;

import java.util.Objects;

public class Feedback {
	private int feedbackid;
	private int studentid;
	private String trainingcontent;
	private String trainerevaluation;
	private String logisticssupport;
	private String overallsatisfication;
	private String date;
	private int idtrainer;

	public int getIdtrainer() {
		return idtrainer;
	}
	public void setIdtrainer(int idtrainer) {
		this.idtrainer = idtrainer;
	}
	public int getFeedbackid() {
		return feedbackid;
	}
	public void setFeedbackid(int feedbackid) {
		this.feedbackid = feedbackid;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getTrainingcontent() {
		return trainingcontent;
	}
	public void setTrainingcontent(String trainingcontent) {
		this.trainingcontent = trainingcontent;
	}
	public String getTrainerevaluation() {
		return trainerevaluation;
	}
	public void setTrainerevaluation(String trainerevaluation) {
		this.trainerevaluation = trainerevaluation;
	}
	public String getLogisticssupport() {
		return logisticssupport;
	}
	public void setLogisticssupport(String logisticssupport) {
		this.logisticssupport = logisticssupport;
	}
	public String getOverallsatisfication() {
		return overallsatisfication;
	}
	public void setOverallsatisfication(String overallsatisfication) {
		this.overallsatisfication = overallsatisfication;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Feedback [feedbackid=" + feedbackid + ", studentid=" + studentid + ", trainingcontent="
				+ trainingcontent + ", trainerevaluation=" + trainerevaluation + ", logisticssupport="
				+ logisticssupport + ", overallsatisfication=" + overallsatisfication + ", date=" + date
				+ ", idtrainer=" + idtrainer + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(date, feedbackid, idtrainer, logisticssupport, overallsatisfication, studentid,
				trainerevaluation, trainingcontent);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feedback other = (Feedback) obj;
		return Objects.equals(date, other.date) && feedbackid == other.feedbackid && idtrainer == other.idtrainer
				&& Objects.equals(logisticssupport, other.logisticssupport)
				&& Objects.equals(overallsatisfication, other.overallsatisfication) && studentid == other.studentid
				&& Objects.equals(trainerevaluation, other.trainerevaluation)
				&& Objects.equals(trainingcontent, other.trainingcontent);
	}
	
	
	public Feedback(int feedbackid, int studentid, String trainingcontent, String trainerevaluation,
			String logisticssupport, String overallsatisfication, String date, int idtrainer) {
		super();
		this.feedbackid = feedbackid;
		this.studentid = studentid;
		this.trainingcontent = trainingcontent;
		this.trainerevaluation = trainerevaluation;
		this.logisticssupport = logisticssupport;
		this.overallsatisfication = overallsatisfication;
		this.date = date;
		this.idtrainer = idtrainer;
	}
	public Feedback() {
		// TODO Auto-generated constructor stub
	}
	
	
}
