package com.excelit.estudyhub.student.response;

import java.util.List;

import com.excelit.estudyhub.student.bean.BasicStudentInformationBean;
import com.excelit.estudyhub.student.bean.PreviousSchoolingInfoBean;
import com.excelit.estudyhub.utils.EStudyHubResponse;

public class BasicStudentRegistrationResponse extends EStudyHubResponse{
	private List<BasicStudentInformationBean> basicStudentInformationList;
	private BasicStudentInformationBean basicStudentInformation;
	private List<PreviousSchoolingInfoBean> previousSchoolingInfoList;
	/**
	 * @return the basicStudentInformationList
	 */
	public List<BasicStudentInformationBean> getBasicStudentInformationList() {
		return basicStudentInformationList;
	}
	/**
	 * @param basicStudentInformationList the basicStudentInformationList to set
	 */
	public void setBasicStudentInformationList(List<BasicStudentInformationBean> basicStudentInformationList) {
		this.basicStudentInformationList = basicStudentInformationList;
	}
	/**
	 * @return the basicStudentInformation
	 */
	public BasicStudentInformationBean getBasicStudentInformation() {
		return basicStudentInformation;
	}
	/**
	 * @param basicStudentInformation the basicStudentInformation to set
	 */
	public void setBasicStudentInformation(BasicStudentInformationBean basicStudentInformation) {
		this.basicStudentInformation = basicStudentInformation;
	}
	/**
	 * @return the previousSchoolingInfoList
	 */
	public List<PreviousSchoolingInfoBean> getPreviousSchoolingInfoList() {
		return previousSchoolingInfoList;
	}
	/**
	 * @param previousSchoolingInfoList the previousSchoolingInfoList to set
	 */
	public void setPreviousSchoolingInfoList(List<PreviousSchoolingInfoBean> previousSchoolingInfoList) {
		this.previousSchoolingInfoList = previousSchoolingInfoList;
	}
	
	

}
