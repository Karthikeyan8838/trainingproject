package com.gp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.gp.bean.Course;
import com.gp.bean.Trainer;
import com.gp.bean.Training;

@Repository("trainerdao")
public class TrainerDAOImpl implements TrainerDAO{

	@Autowired
	  //@Resource  // equivalent  to @Autowired // @Inject
	  private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Training getTrainingSchedule(String idtrainer) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from training where idtrainer="+idtrainer, 
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
	public Trainer getTrainerbyId(String idtrainer) {
		return jdbcTemplate.query("select * from trainer where idtrainer="+idtrainer, 
				new ResultSetExtractor<Trainer>() {

					@Override
					public Trainer extractData(ResultSet rs) throws SQLException, DataAccessException {
						System.out.println("Retrieving account");
						Trainer ob=new Trainer();
						if(rs.next())
						{
						ob.setIdtrainer(rs.getInt("idtrainer"));
						ob.setTrainername(rs.getString("trainername"));
						ob.setTrainerQualification(rs.getString("trainerQualification"));
						ob.setExperience(rs.getString("trainerexperience"));
						ob.setDescription(rs.getString("trainerdescription"));
						ob.setEmail(rs.getString("email"));
						ob.setPhno(rs.getString("phno"));
						ob.setPassword(rs.getString("password"));
						}
						System.out.println("Retrieved account "+ob);
						return ob;
					}	
		});
	}

	@Override
	public Course getCoursedetails(int courseid) {
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
	public List<Course> getallCourseid() {
		// TODO Auto-generated method stub
		String sql = "select * from course";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Course.class));
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

}
