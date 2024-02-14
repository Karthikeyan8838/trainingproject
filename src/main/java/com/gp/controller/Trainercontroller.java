package com.gp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gp.bean.Course;
import com.gp.bean.Student;
import com.gp.bean.Trainer;
import com.gp.bean.Training;
import com.gp.exception.NoAccountException;
import com.gp.service.TrainerService;

@Controller
public class Trainercontroller {

	@Autowired
	TrainerService trainerservice;
	
//	@GetMapping("searchtrainingschedule")
//    public String searchmyaccount() {
//    	return "Searchtrainingschedule";
//    }
	@GetMapping("searchtrainingschedule/{idtrainer}")
	public String searchTraining(HttpServletRequest request, Model model, @PathVariable("idtrainer") String idtrainer) throws NoAccountException {
	     // Assuming student ID is passed as a path variable, remove the session-related code
	     // String studentid = (String) session.getAttribute("student");
	     // System.out.println(studentid);

	     // Use the provided student ID from the path variable
	     System.out.println("Student ID: " + idtrainer);

	     // Fetch student details using the service
	     Training student = trainerservice.trainingSchedule(idtrainer);
	     
	     // Print the retrieved student details to the console
	     System.out.println("Student: " + student);

	     // Add the student details to the model
	     model.addAttribute("mytraining", student);

	     // Return the view name
	     return "Displaytraining";
	 }
	
//	 @PostMapping("searchbyid")
//	    public String searchAccount(@RequestParam("searchtraining") int idtrainer , Model model) throws NoAccountException {
//	    	Training tr= trainerservice.trainingSchedule(idtrainer);
//	    	model.addAttribute("mytraining",tr);
//	    	return "Displaytraining";
//	    	
//	    }
	 
	 @GetMapping("searchcourse")
	    public String searchmycourse() {
	    	return "Searchcourse";
	    }
	 @PostMapping("searchbycourse")
	    public String searchCourse(@RequestParam("searchcourse") int courseid , Model model) throws NoAccountException {
	    	Course c= trainerservice.getCoursedetails(courseid);
	    	model.addAttribute("mycourse",c);
	    	return "Displaycourse";
	    	
	    }
	 @GetMapping("trainerdetails")
	    public String searchmytrainer() {
	    	return "Searchtrainer";
	    }
	 @GetMapping("trainerdetails/{idtrainer}")
	 public String searchStudent(HttpServletRequest request, Model model, @PathVariable("idtrainer") String idtrainer) throws NoAccountException {
	     // Assuming student ID is passed as a path variable, remove the session-related code
	     // String studentid = (String) session.getAttribute("student");
	     // System.out.println(studentid);

	     // Use the provided student ID from the path variable
	     System.out.println("Student ID: " + idtrainer);

	     // Fetch student details using the service
	     Trainer student = trainerservice.getTrainerbyId(idtrainer);
	     
	     // Print the retrieved student details to the console
	     System.out.println("Student: " + student);

	     // Add the student details to the model
	     model.addAttribute("mytrainer", student);

	     // Return the view name
	     return "Displaytrainer";
	 }
//	 @PostMapping("searchbytrainer")
//	    public String searchtrainer(@RequestParam("searchtrainer") int idtrainer , Model model) throws NoAccountException {
//	    	Trainer c= trainerservice.getTrainerbyId(idtrainer);
//	    	model.addAttribute("mytrainer",c);
//	    	return "Displaytrainer";
//	 }
	 @RequestMapping("showallcourse2")
	    public String showAllcourses(Model m) {
	    	System.out.println("Listing All courses");
	    	List<Course> clist = trainerservice.getCourseList();
	    	m.addAttribute("clist", clist);
	    	return "Listallcourses1";
	    }
}
