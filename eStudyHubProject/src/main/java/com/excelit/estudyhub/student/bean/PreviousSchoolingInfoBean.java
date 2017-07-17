package com.excelit.estudyhub.student.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.excelit.estudyhub.constants.DBconstants;

@Entity
@Table(name = "esh_sudent_previous_schooling", schema = DBconstants.SDTUDENT_SCHEMA)
public class PreviousSchoolingInfoBean implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prv_serial_number")
	private Integer serialNumber;
	
	 @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "prv_student_registration_id",referencedColumnName="student_registration_id")
       private BasicStudentInformationBean studentRegistrationId;
	 
		@Column(name = "prv_school_name", length = 50)
		private String previousSchoolName;
		
		@Column(name = "prv_city", length = 50)
		private String previousSchoolCity;
		
		@Column(name = "prv_school_category", length = 50)
		private String previousSchoolCategory;
		
		
		@Column(name = "prv_school_class_or_grade", length = 20)
		private String previousSchoolClassOrGrade;
		
		@Column(name = "prv_school_Grade", length =3)
		private String previousSchoolGrade;
		
		@Column(name = "prv_school_Percentile", length = 50)
		private String previousSchoolPercentile;
		
		@Column(name = "std_prv_school_Marks", length =15,precision=2)
		private BigDecimal previousSchoolMarks;

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
		 * @return the studentRegistrationId
		 */
		public BasicStudentInformationBean getStudentRegistrationId() {
			return studentRegistrationId;
		}

		/**
		 * @param studentRegistrationId the studentRegistrationId to set
		 */
		public void setStudentRegistrationId(BasicStudentInformationBean studentRegistrationId) {
			this.studentRegistrationId = studentRegistrationId;
		}

		/**
		 * @return the previousSchoolName
		 */
		public String getPreviousSchoolName() {
			return previousSchoolName;
		}

		/**
		 * @param previousSchoolName the previousSchoolName to set
		 */
		public void setPreviousSchoolName(String previousSchoolName) {
			this.previousSchoolName = previousSchoolName;
		}

		/**
		 * @return the previousSchoolCity
		 */
		public String getPreviousSchoolCity() {
			return previousSchoolCity;
		}

		/**
		 * @param previousSchoolCity the previousSchoolCity to set
		 */
		public void setPreviousSchoolCity(String previousSchoolCity) {
			this.previousSchoolCity = previousSchoolCity;
		}

		/**
		 * @return the previousSchoolCategory
		 */
		public String getPreviousSchoolCategory() {
			return previousSchoolCategory;
		}

		/**
		 * @param previousSchoolCategory the previousSchoolCategory to set
		 */
		public void setPreviousSchoolCategory(String previousSchoolCategory) {
			this.previousSchoolCategory = previousSchoolCategory;
		}

		/**
		 * @return the previousSchoolClassOrGrade
		 */
		public String getPreviousSchoolClassOrGrade() {
			return previousSchoolClassOrGrade;
		}

		/**
		 * @param previousSchoolClassOrGrade the previousSchoolClassOrGrade to set
		 */
		public void setPreviousSchoolClassOrGrade(String previousSchoolClassOrGrade) {
			this.previousSchoolClassOrGrade = previousSchoolClassOrGrade;
		}

		/**
		 * @return the previousSchoolGrade
		 */
		public String getPreviousSchoolGrade() {
			return previousSchoolGrade;
		}

		/**
		 * @param previousSchoolGrade the previousSchoolGrade to set
		 */
		public void setPreviousSchoolGrade(String previousSchoolGrade) {
			this.previousSchoolGrade = previousSchoolGrade;
		}

		/**
		 * @return the previousSchoolPercentile
		 */
		public String getPreviousSchoolPercentile() {
			return previousSchoolPercentile;
		}

		/**
		 * @param previousSchoolPercentile the previousSchoolPercentile to set
		 */
		public void setPreviousSchoolPercentile(String previousSchoolPercentile) {
			this.previousSchoolPercentile = previousSchoolPercentile;
		}

		/**
		 * @return the previousSchoolMarks
		 */
		public BigDecimal getPreviousSchoolMarks() {
			return previousSchoolMarks;
		}

		/**
		 * @param previousSchoolMarks the previousSchoolMarks to set
		 */
		public void setPreviousSchoolMarks(BigDecimal previousSchoolMarks) {
			this.previousSchoolMarks = previousSchoolMarks;
		}
		
		

}
