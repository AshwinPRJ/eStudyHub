package com.excelit.estudyhub.faculty.to.request;

import com.excelit.estudyhub.faculty.bean.FacultyDesignationBean;
import com.excelit.estudyhub.faculty.bean.FacultyProfileBean;
import com.excelit.estudyhub.faculty.bean.FacultyQualificationBean;
import com.excelit.estudyhub.faculty.bean.FacultySalaryBean;
import com.excelit.estudyhub.faculty.bean.FacultySkillSetsBean;

public class FacultyRequest {
	private FacultyProfileBean facultyProfileBean;
	private FacultyQualificationBean facultyQualificationBean;
	private FacultySkillSetsBean facultySkillSetsBean;
	private FacultySalaryBean facultySalaryBean;
	private FacultyDesignationBean facultyDesignationBean;

	/**
	 * @return the facultyProfileBean
	 */
	public FacultyProfileBean getFacultyProfileBean() {
		return facultyProfileBean;
	}

	/**
	 * @param facultyProfileBean
	 *            the facultyProfileBean to set
	 */
	public void setFacultyProfileBean(FacultyProfileBean facultyProfileBean) {
		this.facultyProfileBean = facultyProfileBean;
	}

	/**
	 * @return the facultyQualificationBean
	 */
	public FacultyQualificationBean getFacultyQualificationBean() {
		return facultyQualificationBean;
	}

	/**
	 * @param facultyQualificationBean
	 *            the facultyQualificationBean to set
	 */
	public void setFacultyQualificationBean(FacultyQualificationBean facultyQualificationBean) {
		this.facultyQualificationBean = facultyQualificationBean;
	}

	/**
	 * @return the facultySkillSetsBean
	 */
	public FacultySkillSetsBean getFacultySkillSetsBean() {
		return facultySkillSetsBean;
	}

	/**
	 * @param facultySkillSetsBean
	 *            the facultySkillSetsBean to set
	 */
	public void setFacultySkillSetsBean(FacultySkillSetsBean facultySkillSetsBean) {
		this.facultySkillSetsBean = facultySkillSetsBean;
	}

	/**
	 * @return the facultySalaryBean
	 */
	public FacultySalaryBean getFacultySalaryBean() {
		return facultySalaryBean;
	}

	/**
	 * @param facultySalaryBean
	 *            the facultySalaryBean to set
	 */
	public void setFacultySalaryBean(FacultySalaryBean facultySalaryBean) {
		this.facultySalaryBean = facultySalaryBean;
	}

	/**
	 * @return the facultyDesignationBean
	 */
	public FacultyDesignationBean getFacultyDesignationBean() {
		return facultyDesignationBean;
	}

	/**
	 * @param facultyDesignationBean
	 *            the facultyDesignationBean to set
	 */
	public void setFacultyDesignationBean(FacultyDesignationBean facultyDesignationBean) {
		this.facultyDesignationBean = facultyDesignationBean;
	}

}
