package com.gp.bean;

import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Trainer {
//	@Min(value = 200,message = "Starts with 200")
	private int idtrainer;
	private String trainername;
	private String trainerQualification;
	private String trainerexperience;
	private String trainerdescription;
//	@Email(message = "Enter valid emailid")
	private String email;
//	@Pattern(regexp = "^[0-9]{10}$", message = "Please enter a valid 10-digit phone number")
	private String phno;
	private String password;
	public int getIdtrainer() {
		return idtrainer;
	}
	public void setIdtrainer(int idtrainer) {
		this.idtrainer = idtrainer;
	}
	public String getTrainername() {
		return trainername;
	}
	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}
	public String getTrainerQualification() {
		return trainerQualification;
	}
	public void setTrainerQualification(String trainerQualification) {
		this.trainerQualification = trainerQualification;
	}
	public String getExperience() {
		return trainerexperience;
	}
	public void setExperience(String experience) {
		this.trainerexperience = experience;
	}
	public String getDescription() {
		return trainerdescription;
	}
	public void setDescription(String description) {
		this.trainerdescription = description;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(trainerdescription, email, trainerexperience, idtrainer, password, phno, trainerQualification,
				trainername);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainer other = (Trainer) obj;
		return Objects.equals(trainerdescription, other.trainerdescription) && Objects.equals(email, other.email)
				&& Objects.equals(trainerexperience, other.trainerexperience) && idtrainer == other.idtrainer
				&& Objects.equals(password, other.password) && Objects.equals(phno, other.phno)
				&& Objects.equals(trainerQualification, other.trainerQualification)
				&& Objects.equals(trainername, other.trainername);
	}
	@Override
	public String toString() {
		return "Trainer [idtrainer=" + idtrainer + ", trainername=" + trainername + ", trainerQualification="
				+ trainerQualification + ", experience=" + trainerexperience + ", description=" + trainerdescription + ", email="
				+ email + ", phno=" + phno + ", password=" + password + "]";
	}
	public Trainer(int idtrainer, String trainername, String trainerQualification, String experience,
			String description, String email, String phno, String password) {
		super();
		this.idtrainer = idtrainer;
		this.trainername = trainername;
		this.trainerQualification = trainerQualification;
		this.trainerexperience = experience;
		this.trainerdescription = description;
		this.email = email;
		this.phno = phno;
		this.password = password;
	}
	public Trainer() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
