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
import com.gp.bean.Enrollment;
import com.gp.bean.Feedback;
import com.gp.bean.Request;
import com.gp.bean.Student;
import com.gp.bean.Trainer;
import com.gp.bean.Training;

@Repository("admindao")
public class AdminDAOImpl implements AdminDAO{
	
	@Autowired
	  //@Resource  // equivalent  to @Autowired // @Inject
	  private JdbcTemplate jdbcTemplate;
		
	
/// Student process
	
	@Override
	public int addStudent(Student s) {
		// TODO Auto-generated method stub
		
		String sql = "insert into student (studentid,name,age,dob,batchno,courseid,place,qualification,cgpa,phno,mailid,password)values(?,?,?,?,?,?,?,?,?,?,?,?)"; 
		int i=jdbcTemplate.update(sql,s.getStudentid(),s.getName(),s.getAge(),s.getDob(), s.getBatchno(), s.getCourseid(), s.getPlace(), s.getQualification(),s.getCgpa(),s.getPhno(),s.getMailid(),s.getPassword());    
		return i;
	}
	@Override
	public int updateStudent(Student s) {
		
		String sql = "update student set name =?, age =?, dob =?, batchno =?, courseid =?, place =?, qualification = ?, cgpa =?, phno =?, mailid =?, password=? where studentid =? ";
		int i =  jdbcTemplate.update(sql,s.getName(),s.getAge(),s.getDob(), s.getBatchno(), s.getCourseid(), s.getPlace(), s.getQualification(),s.getCgpa(),s.getPhno(),s.getMailid(),s.getPassword(),s.getStudentid());
		return i;
		// TODO Auto-generated method stub
		
	}
	@Override
	public int deleteStudent(int studentid) {
		// TODO Auto-generated method stub
		String sql = "delete from student where studentid="+studentid;
		int i = jdbcTemplate.update(sql);
		return i;
	}
	public Student getStudentId(int studentid) {
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
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from student", 
				new ResultSetExtractor<List<Student>>()
				{
				//	@Override
					public List<Student> extractData(ResultSet rs) 
					throws SQLException, DataAccessException {
						// TODO Auto-generated method stub
						List<Student> slist=new ArrayList<Student>();
						while(rs.next())
						{
							Student ob = new Student();
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
							slist.add(ob);
						}
						System.out.println(slist);
						return slist;
					}	
				});

	}

	
	// Trainer process
	
	
	@Override
	public int addTrainer(Trainer t) {
		// TODO Auto-generated method stub
		String sql = "insert into trainer (idtrainer,trainername,trainerqualification,trainerexperience,trainerdescription,email,phno,password) values (?,?,?,?,?,?,?,?)";
		int i=jdbcTemplate.update(sql,t.getIdtrainer(),t.getTrainername(),t.getTrainerQualification(),t.getExperience(),t.getDescription(),t.getEmail(),t.getPhno(),t.getPassword());
		return i;
	
	}
	
	@Override
	public int updateTrainer(Trainer t) {
		// TODO Auto-generated method stub
		String query="update trainer set trainername = ?,trainerqualification = ?,trainerexperience = ?,trainerdescription = ?, email=?, phno=?,password = ? where idtrainer = ?";
		int i = jdbcTemplate.update(query,t.getTrainername(),t.getTrainerQualification(),t.getExperience(),t.getDescription(),t.getEmail(),t.getPhno(),t.getPassword(),t.getIdtrainer());
		return i;
	}


	@Override
	public int removeTrainer(int idtrainer) {
		// TODO Auto-generated method stub
		String sql = "delete from trainer where idtrainer = "+ idtrainer;
		int i= jdbcTemplate.update(sql);
		return i;
	}
	public Trainer getTrainerbyId(int idtrainer) {
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
	public List<Trainer> getTrainerList() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from trainer", 
				new ResultSetExtractor<List<Trainer>>()
				{
				//	@Override
					public List<Trainer> extractData(ResultSet rs) 
					throws SQLException, DataAccessException {
						// TODO Auto-generated method stub
						List<Trainer> tlist=new ArrayList<Trainer>();
						while(rs.next())
						{
							Trainer ob=new Trainer();
							ob.setIdtrainer(rs.getInt("idtrainer"));
							ob.setTrainername(rs.getString("trainername"));
							ob.setTrainerQualification(rs.getString("trainerQualification"));
							ob.setExperience(rs.getString("trainerexperience"));
							ob.setDescription(rs.getString("trainerdescription"));
							ob.setEmail(rs.getString("email"));
							ob.setPhno(rs.getString("phno"));
							ob.setPassword(rs.getString("password"));
							tlist.add(ob);
						}
						System.out.println(tlist);
						return tlist;
					}	
				});

	}

	public List<Trainer> getallTrainerid(){
		String sql = "select * from trainer";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Trainer.class));
	
	}
	//Course process ***********************************
	
	
	@Override
	public int  addCourse(Course c) {
		// TODO Auto-generated method stub
		String sql = "insert into course (courseid,coursename,coursedescription,coursebenefits,courseduration) values (?,?,?,?,?)";
		int i = jdbcTemplate.update(sql,c.getCourseid(),c.getCoursename(),c.getCoursedescription(),c.getCoursebenefits(),c.getCourseduration());
		return i;
	}

	@Override
	public int updateCourse(Course c) {
		// TODO Auto-generated method stub
		String sql = "update course set coursename = ?,coursedescription = ?,coursebenefits = ?,courseduration = ? where courseid = ?";
		int i = jdbcTemplate.update(sql,c.getCoursename(),c.getCoursedescription(),c.getCoursebenefits(),c.getCourseduration(),c.getCourseid());
		return i;
	}

	@Override
	public int deleteCourse(int courseid) {
		// TODO Auto-generated method stub
		String sql = "delete from course where courseid = "+courseid;
		int i = jdbcTemplate.update(sql);
		return 0;
	}
	@Override
	public Course getCoursebyId(int courseid) {
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
	public List<Course> getallCourseid(){
		String sql = "select * from course";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Course.class));
	}


	
// Training******************************************
	

	@Override
	public int addTraining(Training tr) {
		// TODO Auto-generated method stub
		String sql = "insert into training (trainingid,trainingstartdate,trainingenddate,studentid,courseid,idtrainer) values (?,?,?,?,?,?)";
		int i = jdbcTemplate.update(sql,tr.getTrainingid(),tr.getTrainingstartdate(),tr.getTrainingenddate(),tr.getStudentid(),tr.getCourseid(),tr.getIdtrainer());
		return i;
	}
	@Override
	public int updateTraining(Training tr) {
		// TODO Auto-generated method stub
		String sql =  "update training set trainingstartdate = ?, trainingenddate = ?,  studentid= ?, courseid = ?, idtrainer = ? where trainingid = ?";
		int i = jdbcTemplate.update(sql,tr.getTrainingstartdate(),tr.getTrainingenddate(),tr.getStudentid(),tr.getCourseid(),tr.getIdtrainer(),tr.getTrainingid());
		return i;
	}
	
	@Override
	public int deleteTraining(int trainingid) {
		// TODO Auto-generated method stub
		String sql = "delete from training where trainingid = "+trainingid;
		int i = jdbcTemplate.update(sql);
		return i;
	}


	
	@Override
	public Training getTrainingbyId(int trainingid) {
		return jdbcTemplate.query("select * from training where trainingid="+trainingid, 
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
	public List<Training> getTrainingList() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from training", 
				new ResultSetExtractor<List<Training>>()
				{
				//	@Override
					public List<Training> extractData(ResultSet rs) 
					throws SQLException, DataAccessException {
						// TODO Auto-generated method stub
						List<Training> tlist=new ArrayList<Training>();
						while(rs.next())
						{
							Training ob=new Training();
							ob.setTrainingid(rs.getInt("trainingid"));
							ob.setTrainingstartdate(rs.getString("trainingstartdate"));
							ob.setTrainingenddate(rs.getString("trainingenddate"));
							ob.setStudentid(rs.getInt("studentid"));
							ob.setCourseid(rs.getInt("courseid"));
							ob.setIdtrainer(rs.getInt("idtrainer"));
							tlist.add(ob);
						}
						return tlist;
					}	
				});

	}
	
	// Login *****************************
	
	
	public boolean trainerlogin(String email,String password) {
		String sql = "select count(*) from trainer where idtrainer= ? and password = ?";
		int count = jdbcTemplate.queryForObject(sql, Integer.class,email,password);
		return count>0;
	}
	public boolean studentlogin(String studentid,String password) {
		String sql = "select count(*) from student where studentid = ?  and password = ?";
		int count = jdbcTemplate.queryForObject(sql, Integer.class,studentid,password);
		return count>0;
	}
	public Student getstudentname(String studentid) {
		String sql = "SELECT * FROM student WHERE studentid = ?";
		 return jdbcTemplate.queryForObject(sql, new Object[]{studentid}, new BeanPropertyRowMapper<>(Student.class));

	}
	public Trainer gettrainername(String idtrainer) {
		String sql = "Select * from trainer where idtrainer =?";
		 return jdbcTemplate.queryForObject(sql, new Object[]{idtrainer}, new BeanPropertyRowMapper<>(Trainer.class));
	}
	public int deleteFeedback(int feedbackid) {
		String sql = "delete from feedback where feedbackid = "+feedbackid;
		int i = jdbcTemplate.update(sql);
		return i;
	}
	public Feedback getbyFeedbackId(int feedbackid) {
		return jdbcTemplate.query("select * from feedback where feedbackid="+feedbackid, 
				new ResultSetExtractor<Feedback>() {

					@Override
					public Feedback extractData(ResultSet rs) throws SQLException, DataAccessException {
						System.out.println("Retrieving account");
						Feedback ob=new Feedback();
						if(rs.next())
						{
							ob.setFeedbackid(rs.getInt("feedbackid"));
							ob.setStudentid(rs.getInt("studentid"));
							ob.setTrainingcontent(rs.getString("trainingcontent"));
							ob.setTrainerevaluation(rs.getString("trainerevaluation"));
							ob.setLogisticssupport(rs.getString("logisticssupport"));
							ob.setOverallsatisfication(rs.getString("overallsatisfaction"));
							ob.setDate(rs.getString("date"));
							ob.setIdtrainer(rs.getInt("idtrainer"));
						}
						System.out.println("Retrieved account "+ob);
						return ob;
					}	
		});
	}
	
	@Override
	public List<Feedback> getFeedbackList() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from feedback", 
				new ResultSetExtractor<List<Feedback>>()
				{
				//	@Override
					public List<Feedback> extractData(ResultSet rs) 
					throws SQLException, DataAccessException {
						// TODO Auto-generated method stub
						List<Feedback> flist=new ArrayList<Feedback>();
						while(rs.next())
						{
							Feedback ob=new Feedback();
							ob.setFeedbackid(rs.getInt("feedbackid"));
							ob.setStudentid(rs.getInt("studentid"));
							ob.setTrainingcontent(rs.getString("trainingcontent"));
							ob.setTrainerevaluation(rs.getString("trainerevaluation"));
							ob.setLogisticssupport(rs.getString("logisticssupport"));
							ob.setOverallsatisfication(rs.getString("overallsatisfaction"));
							ob.setDate(rs.getString("date"));
							ob.setIdtrainer(rs.getInt("idtrainer"));
							flist.add(ob);
						}
						return flist;
					}	
				});

	}
	public Request getbyRequestId(int requestid) {
		
		return jdbcTemplate.query("select * from request where requestid="+requestid, 
				new ResultSetExtractor<Request>() {

					@Override
					public Request extractData(ResultSet rs) throws SQLException, DataAccessException {
						System.out.println("Retrieving account");
						Request ob=new Request();
						if(rs.next())
						{
							ob.setRequestid(rs.getInt("requestid"));
							ob.setStudentid(rs.getInt("studentid"));
							ob.setCoursename(rs.getString("coursename"));
							ob.setPhno(rs.getString("phno"));
							ob.setDate(rs.getString("date"));
						}
						System.out.println("Retrieved account "+ob);
						return ob;
					}	
		});
	}
	public List<Request> getrequestList(){
		return jdbcTemplate.query("select * from request", 
				new ResultSetExtractor<List<Request>>()
				{
				//	@Override
					public List<Request> extractData(ResultSet rs) 
					throws SQLException, DataAccessException {
						// TODO Auto-generated method stub
						List<Request> flist=new ArrayList<Request>();
						while(rs.next())
						{
							Request ob=new Request();
							ob.setRequestid(rs.getInt("requestid"));
							ob.setStudentid(rs.getInt("studentid"));
							ob.setCoursename(rs.getString("coursename"));
							ob.setPhno(rs.getString("phno"));
							ob.setDate(rs.getString("date"));				
							flist.add(ob);
						}
						return flist;
					}	
				});
	}
	public int deleteRequest(int requestid) {
		String sql = "delete from request where requestid = ?";
		int i = jdbcTemplate.update(sql,requestid);
		return i;
	}
	
	//Enrollment process *********************************************
	
	
	@Override
	public int addEnrollment(Enrollment e) {
		// TODO Auto-generated method stub
		String sql = "insert into enrollment (enrollmentId,studentId,courseId,enrollmentDate,paid,courseamount,balance,amountpaid)values(?,?,?,?,?,?,courseamount-paid,amountpaid+paid)"; 
		int i=jdbcTemplate.update(sql,e.getEnrollmentId(),e.getStudentId(),e.getCourseId(),e.getEnrollmentDate(),e.getPaid(),e.getCourseamount());    
		return i;
	}

	@Override
	public int updateEnrollment(Enrollment e) {
		// TODO Auto-generated method stub
		String sql = "UPDATE enrollment SET studentId = ?, courseId = ?, enrollmentDate = ? , paid = ?, courseamount = ?,amountpaid = amountpaid+paid, balance = courseamount-amountpaid  WHERE enrollmentId = ?"; 
		int i=jdbcTemplate.update(sql,e.getStudentId(),e.getCourseId(),e.getEnrollmentDate(),e.getPaid(),e.getCourseamount(),e.getEnrollmentId());    
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
		return jdbcTemplate.query("select * from enrollment where enrollmentId="+enrollmentId, 
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
						ob.setBalence(rs.getDouble("balance"));
						ob.setAmountpaid(rs.getDouble("amountpaid"));
						}
						System.out.println("Retrieved account "+ob);
						return ob;
					}	
		});
	}

	public List<Enrollment> getEnrollmentList() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from enrollment", 
				new ResultSetExtractor<List<Enrollment>>()
				{
				//	@Override
					public List<Enrollment> extractData(ResultSet rs) 
					throws SQLException, DataAccessException {
						// TODO Auto-generated method stub
						List<Enrollment> elist=new ArrayList<Enrollment>();
						while(rs.next())
						{
							Enrollment ob=new Enrollment();
							ob.setEnrollmentId(rs.getInt("enrollmentId"));
							ob.setStudentId(rs.getInt("studentId"));
							ob.setCourseId(rs.getInt("courseId"));
							ob.setEnrollmentDate(rs.getString("enrollmentDate"));
							ob.setPaid(rs.getDouble("paid"));
							ob.setCourseamount(rs.getDouble("courseamount"));
							ob.setBalence(rs.getDouble("balance"));
							ob.setAmountpaid(rs.getDouble("amountpaid"));
							elist.add(ob);
						}
						return elist;
					}	
				});

	}
	
	
	
	
}
