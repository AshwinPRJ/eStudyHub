package com.excelit.estudyhub.faculty.dao;

import org.hibernate.SessionFactory;

import com.excelit.estudyhub.faculty.bean.FacultyDesignationBean;
import com.excelit.estudyhub.faculty.bean.FacultyProfileBean;
import com.excelit.estudyhub.faculty.bean.FacultyQualificationBean;
import com.excelit.estudyhub.faculty.bean.FacultySalaryBean;
import com.excelit.estudyhub.faculty.bean.FacultySkillSetsBean;

public interface FacultyProfileDaoInterface {

	public FacultyProfileBean setFacultyProfilingDao(FacultyProfileBean facultyProfileBean);

	public FacultyQualificationBean setFacultyQualificationDao(FacultyQualificationBean facultyQualificationBean);

	public FacultyDesignationBean setFacultyDesignationDao(FacultyDesignationBean facultyDesignationBean);

	public FacultySkillSetsBean setFacultySkillSetsDao(FacultySkillSetsBean facultySkillSetsBean);

	public FacultySalaryBean setFacultySalaryDao(FacultySalaryBean facultySalaryBean);
}
