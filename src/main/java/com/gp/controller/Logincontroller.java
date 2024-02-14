package com.gp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gp.bean.Student;
import com.gp.bean.Trainer;
import com.gp.service.AdminService;

@Controller
public class Logincontroller {
	
	@Autowired
	private AdminService adminservice;
	
	
	
	@GetMapping("openAdminLoginPage")
	public String showadminLogin() {
		return "Adminlogin";
	}
	
	@PostMapping("/adminlogin")
	public String adminlogin(
			@RequestParam("Username") String username, @RequestParam("Password") String password,Model model) {
		if ("admin".equals(username) && "admin@123".equals(password)) {
			model.addAttribute("message","Logged successfully");
			return "Adminindex";
		}
		else {
			model.addAttribute("error", "Enter Correct Username and password");
			return "Adminlogin";
		}
		
	}
	@GetMapping("openTrainerLoginPage")
	public String showtrainerLogin() {
		return "Trainerlogin";
	}
	@PostMapping("/trainerloginpost")
	public String trainerlogin(HttpServletRequest request, Model model) {
		String idtrainer = request.getParameter("idtrainer");
		model.addAttribute("idtrainer", idtrainer);
		
		boolean isValidadmin = adminservice.getemail(request.getParameter("idtrainer"), request.getParameter("password"));
		System.out.println("Valid user "+isValidadmin);
		if (isValidadmin) {
			Trainer trainer = adminservice.gettraienrname(idtrainer);
			HttpSession session =request.getSession(true);
         session.setAttribute("name" ,trainer.getTrainername());

        model.addAttribute("name",trainer.getTrainername());
			return "Trainerindex";
		}
		else {
			model.addAttribute("error","Enter Correct Username and Password");
			return "Trainerlogin";
		}
	}
	@GetMapping("openTraineeLoginPage")
	public String showstudentlogin() {
		return "Studentlogin";
	}
	@PostMapping("/studentloginpost")
	public String studentlogin(HttpServletRequest request, Model model) {
		
		String studentid = request.getParameter("studentid");
		model.addAttribute("student", studentid);
		System.out.println(studentid);
		boolean isValidstudent = adminservice.getstudentemail(request.getParameter("studentid"), request.getParameter("password"));
		System.out.println("Valid user "+isValidstudent);
		if (isValidstudent) {
			Student student = adminservice.getstudentname(studentid);
			HttpSession session =request.getSession(true);
         session.setAttribute("name" ,student.getName());

        model.addAttribute("name",student.getName());
			
			return "Studentindex";
		}
		else {
			model.addAttribute("error","Enter correct Username and password");
			return "Studentlogin";
		}
	}
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		session.invalidate();
		return "Welcome";
	}
	
	
}
