package com.gp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.gp.bean.Course;
import com.gp.bean.Feedback;
import com.gp.bean.Request;
import com.gp.bean.Student;
import com.gp.bean.Trainer;
import com.gp.bean.Training;
@Repository("studentdao")
public class StudentDAOImpl implements StudentDAO{

	@Autowired
	  //@Resource  // equivalent  to @Autowired // @Inject
	  private JdbcTemplate jdbcTemplate;
	
	@Override
	public Training getStudentSchedule(String studentid) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from training where studentid="+studentid, 
				new ResultSetExtractor<Training>() {

					@Override
					public Training extractData(ResultSet rs) throws SQLException, DataAccessException {
						System.out.println("Retrieving account");
						Training ob=new Training();
						if(rs.next())
						{
						ob.setTrainingid(rs.getInt("trainingid"));
						ob.setTrainingstartdate(rs.getString("trainingstartdate"));
						ob.setTrainingenddate(rs.getString("trainingenddate"));
						ob.setStudentid(rs.getInt("studentid"));
						ob.setCourseid(rs.getInt("courseid"));
						ob.setIdtrainer(rs.getInt("idtrainer"));
						
						}
						System.out.println("Retrieved account "+ob);
						return ob;
					}	
		});
	}

	@Override
	public Student getStudentbyId(String studentid) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from student where studentid="+studentid, 
				new ResultSetExtractor<Student>() {

					@Override
					public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
						System.out.println("Retrieving account");
						Student ob=new Student();
						if(rs.next())
						{
						ob.setStudentid(rs.getInt("studentid"));
						ob.setName(rs.getString("name"));
						ob.setAge(rs.getInt("age"));
						ob.setDob(rs.getString("dob"));
						ob.setBatchno(rs.getInt("batchno"));
						ob.setCourseid(rs.getInt("courseid"));
						ob.setPlace(rs.getString("place"));
						ob.setQualification(rs.getString("qualification"));
						ob.setCgpa(rs.getDouble("cgpa"));
						ob.setPhno(rs.getString("phno"));
						ob.setMailid(rs.getString("mailid"));
						ob.setPassword(rs.getString("password"));
						
						}
						System.out.println("Retrieved account "+ob);
						return ob;
					}	
		});
	}

	@Override
	public Course getstudentCoursedetails(int courseid) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from course where courseid="+courseid, 
				new ResultSetExtractor<Course>() {

					@Override
					public Course extractData(ResultSet rs) throws SQLException, DataAccessException {
						System.out.println("Retrieving account");
						Course ob=new Course();
						if(rs.next())
						{
						ob.setCourseid(rs.getInt("courseid"));
						ob.setCoursename(rs.getString("coursename"));
						ob.setCoursedescription(rs.getString("coursedescription"));
						ob.setCoursebenefits(rs.getString("coursebenefits"));
						ob.setCourseduration(rs.getString("courseduration"));
						}
						System.out.println("Retrieved account "+ob);
						return ob;
					}	
		});
	}

	@Override
	public int addfeedback(Feedback f) {
		// TODO Auto-generated method stub
		String sql = "insert into feedback (studentid, trainingcontent, trainerevaluation, logisticssupport, overallsatisfaction,date,idtrainer) values (?,?,?,?,?,?,?)";
		int i = jdbcTemplate.update(sql,f.getStudentid(),f.getTrainingcontent(),f.getTrainerevaluation(),f.getLogisticssupport(),f.getOverallsatisfication(),LocalDate.now(),f.getIdtrainer());
		return i;
	}
	public List<Trainer> getallTrainerid(){
		String sql = "select * from trainer";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Trainer.class));
	
	}
	public List<Course> getCourseList() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from course", 
				new ResultSetExtractor<List<Course>>()
				{
				//	@Override
					public List<Course> extractData(ResultSet rs) 
					throws SQLException, DataAccessException {
						// TODO Auto-generated method stub
						List<Course> alist=new ArrayList<Course>();
						while(rs.next())
						{
							Course ob=new Course();
							ob.setCourseid(rs.getInt("courseid"));
							ob.setCoursename(rs.getString("coursename"));
							ob.setCoursedescription(rs.getString("coursedescription"));
							ob.setCoursebenefits(rs.getString("coursebenefits"));
							ob.setCourseduration(rs.getString("courseduration"));
							alist.add(ob);
						}
						return alist;
					}	
				});

	}

	@Override
	public int addrequest(Request q) {
		// TODO Auto-generated method stub
		String sql = "insert into request (studentid, coursename , phno , date) values (?,?,?,?)";
		int i = jdbcTemplate.update(sql,q.getStudentid(),q.getCoursename(),q.getPhno(),LocalDate.now());
		return i;
	}
	public List<Course> getallCourseid(){
		String sql = "select * from course";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Course.class));
	}

	
}
