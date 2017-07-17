package com.excelit.estudyhub.student.request;

import java.util.List;

import com.excelit.estudyhub.student.bean.BasicStudentInformationBean;
import com.excelit.estudyhub.student.bean.PreviousSchoolingInfoBean;

public class StudentRegistrationRequest {
private BasicStudentInformationBean basicStudentInformationBean;
private List<PreviousSchoolingInfoBean> previousSchoolingInfoBean;
/**
 * @return the basicStudentInformationBean
 */
public BasicStudentInformationBean getBasicStudentInformationBean() {
	return basicStudentInformationBean;
}
/**
 * @param basicStudentInformationBean the basicStudentInformationBean to set
 */
public void setBasicStudentInformationBean(BasicStudentInformationBean basicStudentInformationBean) {
	this.basicStudentInformationBean = basicStudentInformationBean;
}
/**
 * @return the previousSchoolingInfoBean
 */
public List<PreviousSchoolingInfoBean> getPreviousSchoolingInfoBean() {
	return previousSchoolingInfoBean;
}
/**
 * @param previousSchoolingInfoBean the previousSchoolingInfoBean to set
 */
public void setPreviousSchoolingInfoBean(List<PreviousSchoolingInfoBean> previousSchoolingInfoBean) {
	this.previousSchoolingInfoBean = previousSchoolingInfoBean;
}


}
