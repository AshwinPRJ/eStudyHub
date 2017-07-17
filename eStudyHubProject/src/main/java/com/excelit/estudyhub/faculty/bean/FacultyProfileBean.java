package com.excelit.estudyhub.faculty.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.excelit.estudyhub.constants.DBconstants;

@Entity
@Table(name = "esh_facultyprofile", schema = DBconstants.FACULTY)
public class FacultyProfileBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "facultyprofile_slno", length = 11)
	private Integer serialNumber;
	@Column(name = "facultyprofile_firstname", length = 11)
	private String firstName;
	@Column(name = "facultyprofile_middlename", length = 11)
	private String middleName;
	@Column(name = "facultyprofile_lastname", length = 11)
	private String lastName;
	@Column(name = "facultyprofile_gender", length = 11)
	private String gender;
	@Column(name = "facultyprofile_addressline1", length = 30)
	private String addressLine1;
	@Column(name = "facultyprofile_addressline2", length = 30)
	private String addressLine2;
	@Column(name = "facultyprofile_addressline3", length = 30)
	private String addressLine3;
	@Column(name = "facultyprofile_city", length = 11)
	private String city;
	@Column(name = "facultyprofile_state", length = 11)
	private String state;
	@Column(name = "facultyprofile_country", length = 11)
	private String country;
	@Column(name = "facultyprofile_postalcode", length = 11)
	private Integer postalCode;
	@Column(name = "facultyprofile_homephone", length = 11)
	private Integer homePhone;
	@Column(name = "facultyprofile_cellphone", length = 11)
	private Integer cellPhone;
	@Column(name = "facultyprofile_dateofbirth", length = 11)
	private Date dateOfBirth;
	@Lob
	@Column(name = "facultyprofile_uploadphoto1")
	private byte[] uploadPhoto1;
	@Lob
	@Column(name = "facultyprofile_uploadphoto2")
	private byte[] uploadPhoto2;
	@Column(name = "facultyprofile_referredby", length = 20)
	private String referredBy;
	@Column(name = "facultyprofile_department", length = 11)
	private String department;
	@Column(name = "facultyprofile_subjectteacher", length = 11)
	private String subjectTeacher;
	@Column(name = "facultyprofile_classteacher", length = 11)
	private String classTeacher;
	
	
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	/**
	 * @return the addressLine3
	 */
	public String getAddressLine3() {
		return addressLine3;
	}
	/**
	 * @param addressLine3 the addressLine3 to set
	 */
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the postalCode
	 */
	public Integer getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return the homePhone
	 */
	public Integer getHomePhone() {
		return homePhone;
	}
	/**
	 * @param homePhone the homePhone to set
	 */
	public void setHomePhone(Integer homePhone) {
		this.homePhone = homePhone;
	}
	/**
	 * @return the cellPhone
	 */
	public Integer getCellPhone() {
		return cellPhone;
	}
	/**
	 * @param cellPhone the cellPhone to set
	 */
	public void setCellPhone(Integer cellPhone) {
		this.cellPhone = cellPhone;
	}
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the uploadPhoto1
	 */
	public byte[] getUploadPhoto1() {
		return uploadPhoto1;
	}
	/**
	 * @param uploadPhoto1 the uploadPhoto1 to set
	 */
	public void setUploadPhoto1(byte[] uploadPhoto1) {
		this.uploadPhoto1 = uploadPhoto1;
	}
	/**
	 * @return the uploadPhoto2
	 */
	public byte[] getUploadPhoto2() {
		return uploadPhoto2;
	}
	/**
	 * @param uploadPhoto2 the uploadPhoto2 to set
	 */
	public void setUploadPhoto2(byte[] uploadPhoto2) {
		this.uploadPhoto2 = uploadPhoto2;
	}
	/**
	 * @return the referredBy
	 */
	public String getReferredBy() {
		return referredBy;
	}
	/**
	 * @param referredBy the referredBy to set
	 */
	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the subjectTeacher
	 */
	public String getSubjectTeacher() {
		return subjectTeacher;
	}
	/**
	 * @param subjectTeacher the subjectTeacher to set
	 */
	public void setSubjectTeacher(String subjectTeacher) {
		this.subjectTeacher = subjectTeacher;
	}
	/**
	 * @return the classTeacher
	 */
	public String getClassTeacher() {
		return classTeacher;
	}
	/**
	 * @param classTeacher the classTeacher to set
	 */
	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}
	

}
