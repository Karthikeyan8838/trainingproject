package com.gp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gp.bean.Course;
import com.gp.bean.Enrollment;
import com.gp.bean.Feedback;
import com.gp.bean.Request;
import com.gp.bean.Student;
import com.gp.bean.Trainer;
import com.gp.bean.Training;
import com.gp.exception.NoAccountException;
import com.gp.service.AdminService;

@Controller
public class Admincontroller {
	
	@Autowired
	AdminService adminservice;
	
	@RequestMapping("/addstudent")
	public String getaddstudent(Model m)
	{
		m.addAttribute("student", new Student());
		return "Addstudent";
	}
	
	@GetMapping("/addstudent")
	public String add1(Model model) {
		model.addAttribute("student",new Student());
		List <Course> courseList = adminservice.getallCourseid();
		System.out.println(courseList);
		model.addAttribute("courseList", courseList);
		return "Addstudent";
	}
	
	
	@PostMapping("/addstudentpost")
	public String addStudent(@ModelAttribute("student")Student student, Model model) {
        // Process the form data (save to database, perform business logic, etc.)
        // For simplicity, we'll just add the form data to the model and return a success view
		
        model.addAttribute("student", student);
        adminservice.addStudent(student);
        return "Adminindex";
	}
	
	
	@RequestMapping("/addtrainer")
	public String getaddtrainer(Model m)
	{
		m.addAttribute("trainer", new Trainer());
		return "Addtrainer";
	}
	
	@PostMapping("/addtrainerpost")
	public String addtrainer(@ModelAttribute("trainer")Trainer trainer, Model model) {
		model.addAttribute("trainer",trainer);
		adminservice.addTrainer(trainer);
		return "Adminindex";
		
	}
	
	@RequestMapping("/addcourse")
	public String getaddcourse(Model m)
	{
		m.addAttribute("course", new Course());
		return "Addcourse";
	}
	@PostMapping("/addcoursepost")
	public String addcourse(@Valid @ModelAttribute("course")Course course, Model model,BindingResult result) {
		if (result.hasErrors()) {
			return "Addcourse";
		}
		model.addAttribute("course",course);
		adminservice.addCourse(course);
		return "Adminindex";
		
	}
	
	@RequestMapping("/addtraining")
	public String getaddtraining(Model m)
	{
		m.addAttribute("training", new Training());
		return "Addtraining";
	}
	
	@GetMapping("/addtraining")
	public String add3(Model model) {
		model.addAttribute("training", new Training());
		List<Course> courseList = adminservice.getallCourseid();
		model.addAttribute("courseList",courseList);
		System.out.println(courseList);
		List<Trainer> trainerList = adminservice.getallTrainerid();
		model.addAttribute("trainerList", trainerList);
		System.out.println(trainerList);
		return "Addtraining";
		
	}
	
	@PostMapping("/addtrainingpost")
	public String addtraining(@ModelAttribute("training")Training training, Model model) {
		model.addAttribute("training",training);
		adminservice.addTraining(training);
		return "Adminindex";
		
	}
	 @RequestMapping("showallcourse")
	    public String showAllcourses(Model m) {
	    	System.out.println("Listing All courses");
	    	List<Course> clist = adminservice.getCourseList();
	    	m.addAttribute("clist", clist);
	    	return "Listallcourses";
	    }
	    
	 @RequestMapping("showallstudent")
	    public String showAllstudent(Model m) {
	    	System.out.println("Listing All student");
	    	List<Student> clist = adminservice.getStudentList();
	    	m.addAttribute("clist", clist);
	    	return "Listallstudent";
	    }
	
	 @RequestMapping(value="/editcourse/{courseid}")    
	    public String edit1(@PathVariable("courseid") int courseid, Model m) throws NoAccountException{    
	    	System.out.println("Before edit form");
	        Course ac=adminservice.getCoursebyId(courseid);    
	        m.addAttribute("course",ac);  
	        return "Updatecourse";   
	    }
	 
   
	    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	    public String editsave(@Valid @ModelAttribute("course") Course c , BindingResult result){    
	     	if(result.hasErrors()) {
		   		return "Updatecourse";
		   	}
	     	else {
	     		System.out.println("Update in controller");
	     		System.out.println(c);
	     		adminservice.updateCourse(c);
	     		return "redirect:/showallcourse";   
	     	}
	    } 
	    @RequestMapping(value="/deletecourse/{courseid}",method = RequestMethod.GET)    
	    public String delete(@PathVariable int courseid) throws NoAccountException{
	    	Course ac=adminservice.getCoursebyId(courseid);  
	    	adminservice.deleteCourse(courseid);
	        return "redirect:/showallcourse";    
	    }  
	    
	    @RequestMapping("showalltraining")
	    public String showAllTraining(Model m) {
	    	System.out.println("Listing All Training");
	    	List<Training> tlist = adminservice.getTrainingList();
	    	m.addAttribute("tlist", tlist);
	    	return "Listalltraining";
	    }
	    
	    @RequestMapping(value="/edittraining/{trainingid}")    
	    public String edit(@PathVariable("trainingid") int trainingid, Model m) throws NoAccountException{    
	    	System.out.println("Before edit form");
	        Training tr=adminservice.getTrainingbyId(trainingid);    
	        m.addAttribute("training",tr);  
	        return "Updatetraining";   
	    }
	    
	    @RequestMapping(value="/update",method = RequestMethod.POST)    
	    public String editsave1(@Valid @ModelAttribute("training") Training t , BindingResult result){    
	     	if(result.hasErrors()) {
		   		return "Updatetraining";
		   	}
	     	else {
	     		System.out.println("Update in controller");
	     		System.out.println(t);
	     		adminservice.updateTraining(t);
	     		return "redirect:/showalltraining";   
	     	}
	    } 
	    @RequestMapping(value="/deletetraining/{trainingid}",method = RequestMethod.GET)    
	    public String delete1(@PathVariable int trainingid) throws NoAccountException{
	    	Training ac=adminservice.getTrainingbyId(trainingid);  
	    	adminservice.deleteTraining(trainingid);
	        return "redirect:/showalltraining";    
	    }  
	    
	    @GetMapping("deletestudent")
	    public String searchmystudent() {
	    	return "Deletestudent";
	    }
	    
	    @PostMapping("deletestudentbyid")
	    public String deletestudent(@RequestParam("deletestudent")int studentid) {
	    	adminservice.deleteStudent(studentid);
	    	return "Adminindex";
	    }
	    
	    
	    @RequestMapping("/addenrollment")
		public String getaddenrollment(Model m)
		{
			m.addAttribute("enrollment", new Enrollment());
			return "Addenrollment";
		}
	    
	    @GetMapping("/addenrollment")
		public String add2(Model model) {
			model.addAttribute("enrollment",new Enrollment());
			List<Course> courseList = adminservice.getallCourseid();
			System.out.println(courseList);
			model.addAttribute("courseList", courseList);
			return "Addenrollment";
		}
	    @PostMapping("/addenrollmentpost")
		public String addenrollment(@ModelAttribute("enrollment")Enrollment enrollment, Model model) {
	        // Process the form data (save to database, perform business logic, etc.)
	        // For simplicity, we'll just add the form data to the model and return a success view
			
	        model.addAttribute("enrollment", enrollment);
	        adminservice.addEnrollment(enrollment);
	        return "Adminindex";
		}
	    @RequestMapping("showallenrollment")
	    public String showAllenrollment(Model m) {
	    	System.out.println("Listing All courses");
	    	List<Enrollment> elist = adminservice.getEnrollmentList();
	    	System.out.println(elist);
	    	m.addAttribute("elist", elist);
	    	return "Listallenrollment";
	    }
	    @RequestMapping(value="/editenrollment/{enrollmentId}")
	    public String edintenrollment (@PathVariable ("enrollmentId") int enrollmentId, Model model) throws NoAccountException {
	    	Enrollment e = adminservice.getbyenrollmentId(enrollmentId);
	    	model.addAttribute("enrollment",e);
	    	return "Updateenrollment";
	    }
	    @RequestMapping(value="/enrollupdate",method = RequestMethod.POST)    
	    public String updatenroll(@Valid @ModelAttribute("enrollment") Enrollment e , BindingResult result){    
	     	if(result.hasErrors()) {
		   		return "Updateenrollment";
		   	}
	     	else {
	     		System.out.println("Update in controller");
	     		System.out.println(e);
	     		adminservice.updateEnrollment(e);
	     		return "redirect:/showallenrollment";   
	     	}
	    }
	    @RequestMapping(value="/deleteenrollment/{enrollmentId}",method = RequestMethod.GET)    
	    public String enrollmentdelete1(@PathVariable int enrollmentId) throws NoAccountException{
	    	Enrollment ac=adminservice.getbyenrollmentId(enrollmentId);  
	    	adminservice.deleteEnrollment(enrollmentId);
	        return "redirect:/showallenrollment";    
	    }
	    @GetMapping("updatestudent")
	    public String searchstudent() {
	    	return "Searchstudent1";
	    }
	    @PostMapping("searchbystudent1")
	    public String searchstudent(@RequestParam("searchstudent1") int studentid , Model model) throws NoAccountException {
	    	Student c= adminservice.getStudentId(studentid);
	    	model.addAttribute("mystudent",c);
	    	return "Displaystudent2";
	    }
	    @RequestMapping(value = "/updatestudentdetails/{studentid}")
	    public String updatestudent(@PathVariable ("studentid") int studentid ,Model m ) throws NoAccountException {
	    	Student st = adminservice.getStudentId(studentid);
	    	m.addAttribute("student",st);
	    	return  "Updatestudent";
	    	
	    }
	    @RequestMapping(value = "/updatestudentpost", method = RequestMethod.POST)
	    public String editstudent(@Valid @ModelAttribute("student") Student s, BindingResult result) {
	    	if (result.hasErrors()) {
	    		return "Updatestudent";
	    	}
	    	else {
	    		System.out.println(s);
	    		adminservice.updateStudent(s);
	    		return "Adminindex";
	    	}
	    }
	    
	    
	    @RequestMapping("showalltrainer")
	    public String showAlltrainer(Model m) {
	    	System.out.println("Listing All Trainers");
	    	List<Trainer> trlist = adminservice.getTrainerList();
	    	System.out.println(trlist);
	    	m.addAttribute("trlist", trlist);
	    	return "Listalltrainers";
	    }
	    
	    @RequestMapping(value="/edittrainer/{idtrainer}")
	    public String edittrainer (@PathVariable ("idtrainer") int idtrainer, Model model) throws NoAccountException {
	    	Trainer e = adminservice.getTrainerbyId(idtrainer);
	    	model.addAttribute("trainer",e);
	    	return "Updatetrainer";
	    }
	    @RequestMapping(value = "/updatetrainerpost", method = RequestMethod.POST)
	    public String updatetrainerpost(@Valid @ModelAttribute("trainer") Trainer s, BindingResult result) {
	    	if (result.hasErrors()) {
	    		return "Updatetrainer";
	    	}
	    	else {
	    		System.out.println(s);
	    		adminservice.updateTrainer(s);
	    		return "redirect:/showalltrainer";
	    	}
	    }
	    @RequestMapping(value="/deletetrainer/{idtrainer}",method = RequestMethod.GET)    
	    public String deletetrainer1(@PathVariable int idtrainer) throws NoAccountException{ 
	    	Trainer ac = adminservice.getTrainerbyId(idtrainer);
	    	adminservice.deleteTrainer(idtrainer);
	        return "redirect:/showalltrainer";    
	    }
	    
	    @RequestMapping("showallfeedback")
	    public String showAllfeedback(Model m) {
	    	System.out.println("Listing All feedback");
	    	List<Feedback> flist = adminservice.getFeedbacklist();
	    	m.addAttribute("flist", flist);
	    	return "Listallfeedback";
	    }
	    @RequestMapping(value="/deletefeedback/{feedbackid}",method = RequestMethod.GET)    
	    public String deletefeedback1(@PathVariable int feedbackid) throws NoAccountException{ 
	    	Feedback ac = adminservice.getbyFeedbackId(feedbackid);
	    	adminservice.deleteFeedback(feedbackid);
	        return "redirect:/showallfeedback";    
	    }
	    @RequestMapping("showallrequest")
	    public String showallrequest(Model m) {
	    	System.out.println("Listing All feedback");
	    	List<Request> rlist = adminservice.getrequestList();
	    	m.addAttribute("rlist", rlist);
	    	return "Listallrequest";
	    }
	    @RequestMapping(value="/deleterequest/{requestid}",method = RequestMethod.GET)    
	    public String deleterequest1(@PathVariable int requestid) throws NoAccountException{ 
	    	Request ac = adminservice.getbyRequestId(requestid);
	    	adminservice.deleteRequest(requestid);
	        return "redirect:/showallrequest";    
	    }

}
