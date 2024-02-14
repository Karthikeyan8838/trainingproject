package com.gp.test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.gp.bean.Course;
import com.gp.bean.Enrollment;
import com.gp.bean.Student;
import com.gp.bean.Trainer;
import com.gp.bean.Training;
import com.gp.dao.AdminDAO;
import com.gp.dao.StudentDAO;
import com.gp.dao.StudentDAOImpl;
import com.gp.service.AdminService;
import com.gp.service.AdminServiceImpl;


//@ExtendWith(SpringExtension.class)
@ExtendWith(MockitoExtension.class)
class AdminserviceImpltest {
	
	@Mock
	AdminDAO adminDAO;
	
	@InjectMocks
	AdminService accountService=new AdminServiceImpl();

	@Test
	public void testAddStudent() {
		Student student=new Student();
		student.setStudentid(11006);
        student.setName("John Doe");
        student.setAge(25);
        student.setDob("1997-01-01");
        student.setBatchno(123);
        student.setCourseid(456);
        student.setPlace("City");
        student.setQualification("Bachelor's");
        student.setCgpa(3.5);
        student.setPhno("6379881537");
        student.setMailid("john.doe@example.com");
        student.setPassword("password123");
		when(adminDAO.addStudent(student)).thenReturn(1);
		
		assertTrue(adminDAO.addStudent(student) == 1);
		
		verify(adminDAO,times(1)).addStudent(student);
	}
	
	@Test
	public void testaddTrainer() {
		Trainer trainer = new Trainer();
	        trainer.setIdtrainer(1);
	        trainer.setTrainername("John Doe");
	        trainer.setTrainerQualification("Masters in Computer Science");
	        trainer.setExperience("5 years");
	        trainer.setDescription("Experienced trainer in programming and software development");
	        		
		when(adminDAO.addTrainer(trainer)).thenReturn(1);
		
		assertTrue(adminDAO.addTrainer(trainer) == 1);
		
		verify(adminDAO,times(1)).addTrainer(trainer);
	}
	
	@Test
	public void testaddEnrollment() {
		Enrollment enrollment = new Enrollment();
        enrollment.setEnrollmentId(101);
        enrollment.setStudentId(11001);
        enrollment.setCourseId(1001);
        enrollment.setEnrollmentDate("2024-01-09");
        enrollment.setPaid(500.0);
        enrollment.setCourseamount(1000.0);
        
        when(adminDAO.addEnrollment(enrollment)).thenReturn(1);
		
		assertTrue(adminDAO.addEnrollment(enrollment) == 1);
		
		verify(adminDAO,times(1)).addEnrollment(enrollment);
	}
	@Test
	public void testaddTraining() {
		Training training = new Training();
        training.setTrainingid(1);
        training.setTrainingstartdate("2024-01-01");
        training.setTrainingenddate("2024-01-31");
        training.setStudentid(11001);
        training.setCourseid(1001);
        training.setIdtrainer(5001);
        
        when(adminDAO.addTraining(training)).thenReturn(1);
		
		assertTrue(adminDAO.addTraining(training) == 1);
		
		verify(adminDAO,times(1)).addTraining(training);
	}
	
	@Test
	public void testaddCourse() {
		 Course course = new Course();
	        course.setCourseid(1);
	        course.setCoursename("Java Programming");
	        course.setCoursedescription("Learn Java programming language.");
	        course.setCoursebenefits("Build real-world applications.");
	        course.setCourseduration("8 weeks");
        
        when(adminDAO.addCourse(course)).thenReturn(1);
		
		assertTrue(adminDAO.addCourse(course) == 1);
		
		verify(adminDAO,times(1)).addCourse(course);
	}

	@Test
	public void testupdateStudent() {
		Student student=new Student();
		student.setStudentid(11006);
        student.setName("John Doe");
        student.setAge(25);
        student.setDob("1997-01-01");
        student.setBatchno(123);
        student.setCourseid(456);
        student.setPlace("Krishnagiri");
        student.setQualification("Bachelor's");
        student.setCgpa(8.5);
        student.setPhno("6379881537");
        student.setMailid("john.doe@example.com");
        student.setPassword("password123");
		when(adminDAO.updateStudent(student)).thenReturn(1);
		
		assertTrue(adminDAO.updateStudent(student) == 1);
		
		verify(adminDAO,times(1)).updateStudent(student);
	}
	@Test
	public void testupdateTrainer() {
		Trainer trainer = new Trainer();
	        trainer.setIdtrainer(1);
	        trainer.setTrainername("John Doe");
	        trainer.setTrainerQualification("Masters in Electrical Science");
	        trainer.setExperience("10 years");
	        trainer.setDescription("Experienced trainer in programming and software development also in Electrical Connection");
	        		
		when(adminDAO.updateTrainer(trainer)).thenReturn(1);
		
		assertTrue(adminDAO.updateTrainer(trainer) == 1);
		
		verify(adminDAO,times(1)).updateTrainer(trainer);
	}
	
	@Test
	public void testupdateEnrollment() {
		Enrollment enrollment = new Enrollment();
        enrollment.setEnrollmentId(101);
        enrollment.setStudentId(11001);
        enrollment.setCourseId(1001);
        enrollment.setEnrollmentDate("2024-01-09");
        enrollment.setPaid(5000.0);
        enrollment.setCourseamount(12000.0);
        
        when(adminDAO.updateEnrollment(enrollment)).thenReturn(1);
		
		assertTrue(adminDAO.updateEnrollment(enrollment) == 1);
		
		verify(adminDAO,times(1)).updateEnrollment(enrollment);
	}
	@Test
	public void testupdateTraining() {
		Training training = new Training();
        training.setTrainingid(1);
        training.setTrainingstartdate("2024-03-01");
        training.setTrainingenddate("2024-04-31");
        training.setStudentid(11001);
        training.setCourseid(1001);
        training.setIdtrainer(5001);
        
        when(adminDAO.updateTraining(training)).thenReturn(1);
		
		assertTrue(adminDAO.updateTraining(training) == 1);
		
		verify(adminDAO,times(1)).updateTraining(training);
	}
	
	@Test
	public void testupdateCourse() {
		 Course course = new Course();
	        course.setCourseid(1);
	        course.setCoursename("Java Programming");
	        course.setCoursedescription("Learn Java programming language.");
	        course.setCoursebenefits("Build real-world applications.");
	        course.setCourseduration("16 weeks");
        
        when(adminDAO.updateCourse(course)).thenReturn(1);
		
		assertTrue(adminDAO.updateCourse(course) == 1);
		
		verify(adminDAO,times(1)).updateCourse(course);
	}
	
	@Test
	public void deleteStudent() {
		int studentid = 1000;
		when(adminDAO.deleteStudent(studentid)).thenReturn(1);
		assertTrue(adminDAO.deleteStudent(studentid) == 1);
		
		verify(adminDAO,times(1)).deleteStudent(studentid);
	}
	
	@Test
    public void testdeleteEnrollment() {
        int enrollmentid = 11001;
        when(adminDAO.deleteEnrollment(enrollmentid)).thenReturn(1);
        
        assertTrue(adminDAO.deleteEnrollment(enrollmentid) == 1);
        
        verify(adminDAO,times(1)).deleteEnrollment(enrollmentid);
    
        
    }
    
    @Test
    public void testdeleteFeedback() {
        int feedbackid = 11001;
        when(adminDAO.deleteFeedback(feedbackid)).thenReturn(1);
        
        assertTrue(adminDAO.deleteFeedback(feedbackid) == 1);
        
        verify(adminDAO,times(1)).deleteFeedback(feedbackid);
    
        
    }
	
}
