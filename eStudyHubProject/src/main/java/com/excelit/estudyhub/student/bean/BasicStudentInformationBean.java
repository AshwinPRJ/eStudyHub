package com.excelit.estudyhub.student.bean;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import com.excelit.estudyhub.constants.DBconstants;

@Entity
@Table(name = "esh_basic_student_info", schema = DBconstants.SDTUDENT_SCHEMA)
public class BasicStudentInformationBean implements Serializable {

	@Id
/*	@GeneratedValue(strategy = GenerationType.IDENTITY)*/
	@Column(name = "student_registration_id", length = 11)
	private String studentRegistrationId;

	@Column(name = "acedamicyear", length = 10)
	private String acedamicYear;

	@Column(name = "class_or_grade", length = 3)
	private String classORGrade;

	@Column(name = "student_first_name", length = 30)
	private String studentFirstName;

	@Column(name = "student_middle_name", length = 20)
	private String studentMiddleName;

	@Column(name = "student_last_name", length = 20)
	private String studentLastName;

	@Column(name = "student_preferred_name", length = 30)
	private String studentPreferredName;

	@Column(name = "student_Gender", length = 1)
	private String studentGender;

	@Column(name = "student_dateofBirth")
	private Date studentDateofBirth;

	@Column(name = "student_place_of_birth", length = 50)
	private String studentPlaceOfBirth;

	@Column(name = "student_race", length = 3)
	private String studentRace;

	@Column(name = "student_live_with", length = 3)
	private Integer studentLiveWith;

	@Column(name = "student_aadhar_card", length = 20)
	private String studentAadharCard;

	@Column(name = "student_religion", length = 3)
	private Integer studentReligion;

	@Column(name = "student_caste", length = 3)
	private Integer studentCaste;

	@Column(name = "student_category", length = 3)
	private Integer studentCategory;

	@Column(name = "annual_Income", length = 15, precision = 0)
	private BigInteger annualIncome;

	@Column(name = "student_rte_candidate", length = 1)
	private String studentRTECandidate;

	@Column(name = "student_siblings_studying_same_school", length = 1)
	private String studentSiblingsStudyingInSameSchool;

	@Column(name = "student_address_line_1", length = 50)
	private String studentAddressLine1;

	@Column(name = "student_address_line_2", length = 50)
	private String studentAddressLine2;

	@Column(name = "student_address_line_3", length = 11)
	private String studentAddressLine3;

	@Column(name = "student_town_or_city_name", length = 50)
	private String studentTownORCityName;

	@Column(name = "student_district_or_county", length = 50)
	private String studentDistrictORCounty;

	@Column(name = "student_state", length = 50)
	private String studentState;

	@Column(name = "student_country", length = 50)
	private String studentCountry;

	@Column(name = "student_zipcode_or_postal_code", length = 11)
	private String studentZipCodeORPostalCode;

	@Column(name = "student_home_phone_number", length = 20)
	private Integer studentHomePhoneNumber;

	@Column(name = "student_mobile_number", length = 20)
	private Integer studentMobileNumber;

	@Column(name = "student_status", length = 10)
	@ColumnDefault("'submitted'")
	private String registrationStatus;
	

	/**
	 * @return the registrationStatus
	 */
	public String getRegistrationStatus() {
		return registrationStatus;
	}

	/**
	 * @param registrationStatus
	 *            the registrationStatus to set
	 */
	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	/**
	 * @return the studentRegistrationId
	 */
	public String getStudentRegistrationId() {
		return studentRegistrationId;
	}

	/**
	 * @param studentRegistrationId
	 *            the studentRegistrationId to set
	 */
	public void setStudentRegistrationId(String studentRegistrationId) {
		this.studentRegistrationId = studentRegistrationId;
	}

	/**
	 * @return the acedamicYear
	 */
	public String getAcedamicYear() {
		return acedamicYear;
	}

	/**
	 * @param acedamicYear
	 *            the acedamicYear to set
	 */
	public void setAcedamicYear(String acedamicYear) {
		this.acedamicYear = acedamicYear;
	}

	/**
	 * @return the classORGrade
	 */
	public String getClassORGrade() {
		return classORGrade;
	}

	/**
	 * @param classORGrade
	 *            the classORGrade to set
	 */
	public void setClassORGrade(String classORGrade) {
		this.classORGrade = classORGrade;
	}

	/**
	 * @return the studentFirstName
	 */
	public String getStudentFirstName() {
		return studentFirstName;
	}

	/**
	 * @param studentFirstName
	 *            the studentFirstName to set
	 */
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	/**
	 * @return the studentMiddleName
	 */
	public String getStudentMiddleName() {
		return studentMiddleName;
	}

	/**
	 * @param studentMiddleName
	 *            the studentMiddleName to set
	 */
	public void setStudentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
	}

	/**
	 * @return the studentLastName
	 */
	public String getStudentLastName() {
		return studentLastName;
	}

	/**
	 * @param studentLastName
	 *            the studentLastName to set
	 */
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	/**
	 * @return the studentPreferredName
	 */
	public String getStudentPreferredName() {
		return studentPreferredName;
	}

	/**
	 * @param studentPreferredName
	 *            the studentPreferredName to set
	 */
	public void setStudentPreferredName(String studentPreferredName) {
		this.studentPreferredName = studentPreferredName;
	}

	/**
	 * @return the studentGender
	 */
	public String getStudentGender() {
		return studentGender;
	}

	/**
	 * @param studentGender
	 *            the studentGender to set
	 */
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	/**
	 * @return the studentDateofBirth
	 */
	public Date getStudentDateofBirth() {
		return studentDateofBirth;
	}

	/**
	 * @param studentDateofBirth
	 *            the studentDateofBirth to set
	 */
	public void setStudentDateofBirth(Date studentDateofBirth) {
		this.studentDateofBirth = studentDateofBirth;
	}

	/**
	 * @return the studentPlaceOfBirth
	 */
	public String getStudentPlaceOfBirth() {
		return studentPlaceOfBirth;
	}

	/**
	 * @param studentPlaceOfBirth
	 *            the studentPlaceOfBirth to set
	 */
	public void setStudentPlaceOfBirth(String studentPlaceOfBirth) {
		this.studentPlaceOfBirth = studentPlaceOfBirth;
	}

	/**
	 * @return the studentRace
	 */
	public String getStudentRace() {
		return studentRace;
	}

	/**
	 * @param studentRace
	 *            the studentRace to set
	 */
	public void setStudentRace(String studentRace) {
		this.studentRace = studentRace;
	}

	/**
	 * @return the studentLiveWith
	 */
	public Integer getStudentLiveWith() {
		return studentLiveWith;
	}

	/**
	 * @param studentLiveWith
	 *            the studentLiveWith to set
	 */
	public void setStudentLiveWith(Integer studentLiveWith) {
		this.studentLiveWith = studentLiveWith;
	}

	/**
	 * @return the studentAadharCard
	 */
	public String getStudentAadharCard() {
		return studentAadharCard;
	}

	/**
	 * @param studentAadharCard
	 *            the studentAadharCard to set
	 */
	public void setStudentAadharCard(String studentAadharCard) {
		this.studentAadharCard = studentAadharCard;
	}

	/**
	 * @return the studentReligion
	 */
	public Integer getStudentReligion() {
		return studentReligion;
	}

	/**
	 * @param studentReligion
	 *            the studentReligion to set
	 */
	public void setStudentReligion(Integer studentReligion) {
		this.studentReligion = studentReligion;
	}

	/**
	 * @return the studentCaste
	 */
	public Integer getStudentCaste() {
		return studentCaste;
	}

	/**
	 * @param studentCaste
	 *            the studentCaste to set
	 */
	public void setStudentCaste(Integer studentCaste) {
		this.studentCaste = studentCaste;
	}

	/**
	 * @return the studentCategory
	 */
	public Integer getStudentCategory() {
		return studentCategory;
	}

	/**
	 * @param studentCategory
	 *            the studentCategory to set
	 */
	public void setStudentCategory(Integer studentCategory) {
		this.studentCategory = studentCategory;
	}

	 
	/**
	 * @return the annualIncome
	 */
	public BigInteger getAnnualIncome() {
		return annualIncome;
	}

	/**
	 * @param annualIncome the annualIncome to set
	 */
	public void setAnnualIncome(BigInteger annualIncome) {
		this.annualIncome = annualIncome;
	}

	/**
	 * @return the studentRTECandidate
	 */
	public String getStudentRTECandidate() {
		return studentRTECandidate;
	}

	/**
	 * @param studentRTECandidate
	 *            the studentRTECandidate to set
	 */
	public void setStudentRTECandidate(String studentRTECandidate) {
		this.studentRTECandidate = studentRTECandidate;
	}

	/**
	 * @return the studentSiblingsStudyingInSameSchool
	 */
	public String getStudentSiblingsStudyingInSameSchool() {
		return studentSiblingsStudyingInSameSchool;
	}

	/**
	 * @param studentSiblingsStudyingInSameSchool
	 *            the studentSiblingsStudyingInSameSchool to set
	 */
	public void setStudentSiblingsStudyingInSameSchool(String studentSiblingsStudyingInSameSchool) {
		this.studentSiblingsStudyingInSameSchool = studentSiblingsStudyingInSameSchool;
	}

	/**
	 * @return the studentAddressLine1
	 */
	public String getStudentAddressLine1() {
		return studentAddressLine1;
	}

	/**
	 * @param studentAddressLine1
	 *            the studentAddressLine1 to set
	 */
	public void setStudentAddressLine1(String studentAddressLine1) {
		this.studentAddressLine1 = studentAddressLine1;
	}

	/**
	 * @return the studentAddressLine2
	 */
	public String getStudentAddressLine2() {
		return studentAddressLine2;
	}

	/**
	 * @param studentAddressLine2
	 *            the studentAddressLine2 to set
	 */
	public void setStudentAddressLine2(String studentAddressLine2) {
		this.studentAddressLine2 = studentAddressLine2;
	}

	/**
	 * @return the studentAddressLine3
	 */
	public String getStudentAddressLine3() {
		return studentAddressLine3;
	}

	/**
	 * @param studentAddressLine3
	 *            the studentAddressLine3 to set
	 */
	public void setStudentAddressLine3(String studentAddressLine3) {
		this.studentAddressLine3 = studentAddressLine3;
	}

	/**
	 * @return the studentTownORCityName
	 */
	public String getStudentTownORCityName() {
		return studentTownORCityName;
	}

	/**
	 * @param studentTownORCityName
	 *            the studentTownORCityName to set
	 */
	public void setStudentTownORCityName(String studentTownORCityName) {
		this.studentTownORCityName = studentTownORCityName;
	}

	/**
	 * @return the studentDistrictORCounty
	 */
	public String getStudentDistrictORCounty() {
		return studentDistrictORCounty;
	}

	/**
	 * @param studentDistrictORCounty
	 *            the studentDistrictORCounty to set
	 */
	public void setStudentDistrictORCounty(String studentDistrictORCounty) {
		this.studentDistrictORCounty = studentDistrictORCounty;
	}

	/**
	 * @return the studentState
	 */
	public String getStudentState() {
		return studentState;
	}

	/**
	 * @param studentState
	 *            the studentState to set
	 */
	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}

	/**
	 * @return the studentCountry
	 */
	public String getStudentCountry() {
		return studentCountry;
	}

	/**
	 * @param studentCountry
	 *            the studentCountry to set
	 */
	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}

	/**
	 * @return the studentZipCodeORPostalCode
	 */
	public String getStudentZipCodeORPostalCode() {
		return studentZipCodeORPostalCode;
	}

	/**
	 * @param studentZipCodeORPostalCode
	 *            the studentZipCodeORPostalCode to set
	 */
	public void setStudentZipCodeORPostalCode(String studentZipCodeORPostalCode) {
		this.studentZipCodeORPostalCode = studentZipCodeORPostalCode;
	}

	/**
	 * @return the studentHomePhoneNumber
	 */
	public Integer getStudentHomePhoneNumber() {
		return studentHomePhoneNumber;
	}

	/**
	 * @param studentHomePhoneNumber
	 *            the studentHomePhoneNumber to set
	 */
	public void setStudentHomePhoneNumber(Integer studentHomePhoneNumber) {
		this.studentHomePhoneNumber = studentHomePhoneNumber;
	}

	/**
	 * @return the studentMobileNumber
	 */
	public Integer getStudentMobileNumber() {
		return studentMobileNumber;
	}

	/**
	 * @param studentMobileNumber
	 *            the studentMobileNumber to set
	 */
	public void setStudentMobileNumber(Integer studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}

}
