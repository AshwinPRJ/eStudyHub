package com.excelit.estudyhub.faculty.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.excelit.estudyhub.constants.DBconstants;

@Entity
@Table(name = "esh_facultyskillset", schema = DBconstants.FACULTY)
public class FacultySkillSetsBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "facultyskillset_slno", length = 11)
	private Integer serialNumber;
	@Column(name = "facultyskillset_skillset", length = 60)
	private String skillSets;
	@Column(name = "facultyskillset_experience", length = 11)
	private String experience;
	@Column(name = "facultyskillset_level", length = 11)
	private String level;
	@Column(name = "facultyskillset_certified", length = 60)
	private String certified;
	@Column(name = "facultyskillset_uploadcertificate")
	private String uploadCertificate;
	@Column(name = "facultyskillset_patens", length = 60)
	private String patens;
	@Column(name = "facultyskillset_blogs", length = 60)
	private String blogs;
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
	 * @return the skillSets
	 */
	public String getSkillSets() {
		return skillSets;
	}

	/**
	 * @param skillSets
	 *            the skillSets to set
	 */
	public void setSkillSets(String skillSets) {
		this.skillSets = skillSets;
	}

	/**
	 * @return the experience
	 */
	public String getExperience() {
		return experience;
	}

	/**
	 * @param experience
	 *            the experience to set
	 */
	public void setExperience(String experience) {
		this.experience = experience;
	}

	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * @return the certified
	 */
	public String getCertified() {
		return certified;
	}

	/**
	 * @param certified
	 *            the certified to set
	 */
	public void setCertified(String certified) {
		this.certified = certified;
	}

	/**
	 * @return the uploadCertificate
	 */
	public String getUploadCertificate() {
		return uploadCertificate;
	}

	/**
	 * @param uploadCertificate
	 *            the uploadCertificate to set
	 */
	public void setUploadCertificate(String uploadCertificate) {
		this.uploadCertificate = uploadCertificate;
	}

	/**
	 * @return the patens
	 */
	public String getPatens() {
		return patens;
	}

	/**
	 * @param patens
	 *            the patens to set
	 */
	public void setPatens(String patens) {
		this.patens = patens;
	}

	/**
	 * @return the blogs
	 */
	public String getBlogs() {
		return blogs;
	}

	/**
	 * @param blogs
	 *            the blogs to set
	 */
	public void setBlogs(String blogs) {
		this.blogs = blogs;
	}

}
