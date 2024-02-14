package com.gp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.gp.bean.Enrollment;
import com.gp.bean.Student;

@Repository("enrollmentdao")
public class EnrollmentDAOImpl implements EnrollmentDAO{
	
	@Autowired
	  //@Resource  // equivalent  to @Autowired // @Inject
	  private JdbcTemplate jdbcTemplate;
	
	@Override
	public int addEnrollment(Enrollment e) {
		// TODO Auto-generated method stub
		String sql = "insert into enrollment (enrollmentId,studentId,courseId,enrollmentDate,paid,courseamount,balence)values(?,?,?,?,?,?,?)"; 
		int i=jdbcTemplate.update(sql,e.getEnrollmentId(),e.getStudentId(),e.getCourseId(),e.getEnrollmentDate(),e.getPaid(),e.getCourseamount(),e.getBalence());    
		return i;
	}

	@Override
	public int updateEnrollment(Enrollment e) {
		// TODO Auto-generated method stub
		String sql = "update enrollment set studentId = ?,courseId=?,enrollmentDate = ? ,paid = ? ,courseamount ? ,balence = ? where enrollmentId = ?"; 
		int i=jdbcTemplate.update(sql,e.getStudentId(),e.getCourseId(),e.getEnrollmentDate(),e.getPaid(),e.getCourseamount(),e.getBalence(),e.getEnrollmentId());    
		return i;
	}

	@Override
	public int deleteEnrollment(int enrollmentId) {
		// TODO Auto-generated method stub
		String sql = "delete from enrollment where enrollmentId = "+enrollmentId;
		int i = jdbcTemplate.update(sql);
		return i;
	}

	@Override
	public Enrollment getbyenrollmentId(int enrollmentId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from student where enrollmentId="+enrollmentId, 
				new ResultSetExtractor<Enrollment>() {

					@Override
					public Enrollment extractData(ResultSet rs) throws SQLException, DataAccessException {
						System.out.println("Retrieving account");
						Enrollment ob=new Enrollment();
						if(rs.next())
						{
						ob.setEnrollmentId(rs.getInt("enrollmentId"));
						ob.setStudentId(rs.getInt("studentId"));
						ob.setCourseId(rs.getInt("courseId"));
						ob.setEnrollmentDate(rs.getString("enrollmentDate"));
						ob.setPaid(rs.getDouble("paid"));
						ob.setCourseamount(rs.getDouble("courseamount"));
						ob.setBalence(rs.getDouble("balence"));
						
						
						}
						System.out.println("Retrieved account "+ob);
						return ob;
					}	
		});
	}

	@Override
	public Enrollment showallenrollment() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
