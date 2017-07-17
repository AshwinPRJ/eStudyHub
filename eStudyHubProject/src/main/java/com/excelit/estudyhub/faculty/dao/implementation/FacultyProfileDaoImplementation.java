package com.excelit.estudyhub.faculty.dao.implementation;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.excelit.estudyhub.faculty.bean.FacultyDesignationBean;
import com.excelit.estudyhub.faculty.bean.FacultyProfileBean;
import com.excelit.estudyhub.faculty.bean.FacultyQualificationBean;
import com.excelit.estudyhub.faculty.bean.FacultySalaryBean;
import com.excelit.estudyhub.faculty.bean.FacultySkillSetsBean;
import com.excelit.estudyhub.faculty.dao.FacultyProfileDaoInterface;

@Repository
public class FacultyProfileDaoImplementation implements FacultyProfileDaoInterface {
@Autowired
	private SessionFactory sessionFactory;
	//private Serializable save = "";
	@Transactional
	public FacultyProfileBean setFacultyProfilingDao(FacultyProfileBean facultyProfileBean) {
		
		System.out.println(">>>>>>>>>>>>>>>>>>"+facultyProfileBean.getFirstName());
		System.out.println("sessionFactory"+sessionFactory);
		Serializable save = sessionFactory.getCurrentSession().save(facultyProfileBean);
		if (save != null) {
			return facultyProfileBean;
		} else {
			facultyProfileBean = null;
			return facultyProfileBean;
		}
	}
	@Transactional
	public FacultyQualificationBean setFacultyQualificationDao(FacultyQualificationBean facultyQualificationBean) {
		Serializable save = sessionFactory.getCurrentSession().save(facultyQualificationBean);
		if (save != null) {
			return facultyQualificationBean;
		} else {
			facultyQualificationBean = null;
			return facultyQualificationBean;
		}
	}
	@Transactional
	public FacultyDesignationBean setFacultyDesignationDao(FacultyDesignationBean facultyDesignationBean) {
		Serializable	save = sessionFactory.getCurrentSession().save(facultyDesignationBean);
		if (save != null) {
			return facultyDesignationBean;
		} else {
			facultyDesignationBean = null;
			return facultyDesignationBean;
		}
	}
	@Transactional
	public FacultySkillSetsBean setFacultySkillSetsDao(FacultySkillSetsBean facultySkillSetsBean) {
		Serializable save = sessionFactory.getCurrentSession().save(facultySkillSetsBean);
		if (save != null) {
			return facultySkillSetsBean;
		} else {
			facultySkillSetsBean = null;
			return facultySkillSetsBean;
		}
	}
	@Transactional
	public FacultySalaryBean setFacultySalaryDao(FacultySalaryBean facultySalaryBean) {
		Serializable save = sessionFactory.getCurrentSession().save(facultySalaryBean);
		if (save != null) {
			return facultySalaryBean;
		} else {
			facultySalaryBean = null;
			return facultySalaryBean;
		}
	}
}
