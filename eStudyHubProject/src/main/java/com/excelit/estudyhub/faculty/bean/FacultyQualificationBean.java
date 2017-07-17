package com.excelit.estudyhub.faculty.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.excelit.estudyhub.constants.DBconstants;

@Entity
@Table(name = "esh_facultyqualification", schema = DBconstants.FACULTY)
public class FacultyQualificationBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "facultyqualification_slno", length = 11)
	private Integer serialNumber;
	@Column(name = "facultyqualification_course", length = 11)
	private String course;
	@Column(name = "facultyqualification_batch", length = 11)
	private String batch;
	@Column(name = "facultyqualification_university", length = 11)
	private String university;
	@Column(name = "facultyqualification_grade", length = 11)
	private String grade;
	@Lob
	@Column(name = "facultyqualification_uploadcertificate")
	private byte[] uploadCertificate;
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
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * @param course
	 *            the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}

	/**
	 * @return the batch
	 */
	public String getBatch() {
		return batch;
	}

	/**
	 * @param batch
	 *            the batch to set
	 */
	public void setBatch(String batch) {
		this.batch = batch;
	}

	/**
	 * @return the university
	 */
	public String getUniversity() {
		return university;
	}

	/**
	 * @param university
	 *            the university to set
	 */
	public void setUniversity(String university) {
		this.university = university;
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
	 * @return the uploadCertificate
	 */
	public byte[] getUploadCertificate() {
		return uploadCertificate;
	}

	/**
	 * @param uploadCertificate
	 *            the uploadCertificate to set
	 */
	public void setUploadCertificate(byte[] uploadCertificate) {
		this.uploadCertificate = uploadCertificate;
	}
}
