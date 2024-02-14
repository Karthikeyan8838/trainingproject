package com.gp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gp.bean.Course;
import com.gp.bean.Feedback;
import com.gp.bean.Request;
import com.gp.bean.Student;
import com.gp.bean.Trainer;
import com.gp.bean.Training;
import com.gp.exception.NoAccountException;
import com.gp.service.StudentService;
import com.gp.service.TrainerService;

@Controller
public class Studentcontroller {
	@Autowired
	StudentService studentservice;
	
	@GetMapping("searchstudenttrainingschedule/{student}")
	public String searchTraining(HttpServletRequest request, Model model, @PathVariable("student") String studentId) throws NoAccountException {
	     // Assuming student ID is passed as a path variable, remove the session-related code
	     // String studentid = (String) session.getAttribute("student");
	     // System.out.println(studentid);

	     // Use the provided student ID from the path variable
	     System.out.println("Student ID: " + studentId);

	     // Fetch student details using the service
	     Training student = studentservice.getStudentSchedule(studentId);
	     
	     // Print the retrieved student details to the console
	     System.out.println("Student: " + student);

	     // Add the student details to the model
	     model.addAttribute("studenttraining", student);

	     // Return the view name
	     return "Studenttraining";
	 }
	
//	 @PostMapping("searchstudentbyid")
//	    public String searchAccount(@RequestParam("studenttraining") int batchno , Model model) throws NoAccountException {
//	    	Training tr= studentservice.getStudentSchedule(batchno);
//	    	model.addAttribute("studenttraining",tr);
//	    	return "Studenttraining";
//	    	
//	 }
	 @GetMapping("viewstudentcourse")
	    public String searchmycourse() {
	    	return "Searchstudentcourse";
	    }
	 @PostMapping("searchstudentbycourse")
	    public String searchCourse(@RequestParam("searchstudentcourse") int courseid , Model model) throws NoAccountException {
	    	Course c= studentservice.getstudentCoursedetails(courseid);
	    	model.addAttribute("mycourse",c);
	    	return "Displaycourse";
	    	
	    }
	 
//	    public String searchmystudent() {
//	    	return "Searchstudent";
//	    }
	 
	 
	 @GetMapping("studentdetails/{student}")
	 public String searchStudent(HttpServletRequest request, Model model, @PathVariable("student") String studentId) throws NoAccountException {
	     // Assuming student ID is passed as a path variable, remove the session-related code
	     // String studentid = (String) session.getAttribute("student");
	     // System.out.println(studentid);

	     // Use the provided student ID from the path variable
	     System.out.println("Student ID: " + studentId);

	     // Fetch student details using the service
	     Student student = studentservice.getStudentbyId(studentId);
	     
	     // Print the retrieved student details to the console
	     System.out.println("Student: " + student);

	     // Add the student details to the model
	     model.addAttribute("mystudent", student);

	     // Return the view name
	     return "Displaystudent";
	 }

	 @RequestMapping("/studentfeedback")
	 public String addFeedback(Model m) {
		m.addAttribute("feedback", new Feedback());
		return "Addfeedback";
	 }
	 @GetMapping("/studentfeedback")
		public String add3(Model model) {
			model.addAttribute("feedback", new Feedback());
			
			List<Trainer> trainerList = studentservice.getallTrainerid();
			model.addAttribute("trainerList", trainerList);
			System.out.println(trainerList);
			return "Addfeedback";
			
		}
	 @PostMapping("/addfeedbackpost")
		public String addStudent(@ModelAttribute("feedback")Feedback feedback, Model model) {
	        // Process the form data (save to database, perform business logic, etc.)
	        // For simplicity, we'll just add the form data to the model and return a success view
			
	        model.addAttribute("feedback", feedback);
	        studentservice.addFeedback(feedback);
	        return "Studentindex";
		}
	 @RequestMapping("showallcourse1")
	    public String showAllcourses(Model m) {
	    	System.out.println("Listing All courses");
	    	List<Course> clist = studentservice.getCourseList();
	    	m.addAttribute("clist", clist);
	    	return "Listallcourses2";
	    }
	 
	 
	 @RequestMapping("/addenrollment1")
	 public String addRequest(Model m) {
		m.addAttribute("request", new Request());
		return "Addrequest";
	 }
	 @GetMapping("/addenrollment1")
		public String add1(Model model) {
			model.addAttribute("request",new Request());
			List <Course> courseList = studentservice.getallCourseid();
			System.out.println(courseList);
			model.addAttribute("courseList", courseList);
			return "Addrequest";
		}
	 @PostMapping("/addrequestpost")
		public String addrequest(@ModelAttribute("request")Request  request, Model model) {
	        // Process the form data (save to database, perform business logic, etc.)
	        // For simplicity, we'll just add the form data to the model and return a success view
			
	        model.addAttribute("request", request);
	        studentservice.addrequest(request);
	        return "redirect:/showallcourse1";
		}
}
