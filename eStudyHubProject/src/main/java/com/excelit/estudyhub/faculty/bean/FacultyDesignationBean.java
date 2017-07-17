package com.excelit.estudyhub.faculty.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.excelit.estudyhub.constants.DBconstants;

@Entity
@Table(name = "esh_facultydesignation", schema = DBconstants.FACULTY)
public class FacultyDesignationBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "facultydesignation_slno", length = 11)
	private Integer serialNumber;
	@Column(name = "facultydesignation_roles", length = 30)
	private String roles;
	@Column(name = "facultydesignation_grade", length = 30)
	private String grade;
	@Column(name = "facultydesignation_responsibilities", length = 30)
	private String responsibilities;
	@Column(name = "facultydesignation_year", length = 30)
	private String year;
	@Column(name = "facultydesignation_lastpromoted", length = 30)
	private String lastPromoted;
	/**
	 * @return the serialNumber
	 */
	public Integer getSerialNumber() {
		return serialNumber;
	}
	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	/**
	 * @return the roles
	 */
	public String getRoles() {
		return roles;
	}

	/**
	 * @param roles
	 *            the roles to set
	 */
	public void setRoles(String roles) {
		this.roles = roles;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the responsibilities
	 */
	public String getResponsibilities() {
		return responsibilities;
	}

	/**
	 * @param responsibilities
	 *            the responsibilities to set
	 */
	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @return the lastPromoted
	 */
	public String getLastPromoted() {
		return lastPromoted;
	}

	/**
	 * @param lastPromoted
	 *            the lastPromoted to set
	 */
	public void setLastPromoted(String lastPromoted) {
		this.lastPromoted = lastPromoted;
	}

}
