package com.gp.dao;

import com.gp.bean.Enrollment;

public interface EnrollmentDAO {
	public int addEnrollment(Enrollment e);
	public int updateEnrollment(Enrollment e);
	public int deleteEnrollment(int enrollmentId);
	public Enrollment getbyenrollmentId(int enrollmentId);
	public Enrollment showallenrollment();
	

}
