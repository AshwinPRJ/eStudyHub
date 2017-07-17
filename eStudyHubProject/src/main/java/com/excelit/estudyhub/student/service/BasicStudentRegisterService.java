package com.excelit.estudyhub.student.service;

import java.util.List;

import com.excelit.estudyhub.student.bean.BasicStudentInformationBean;
import com.excelit.estudyhub.student.bean.PreviousSchoolingInfoBean;
import com.excelit.estudyhub.student.request.StudentRegistrationRequest;

public interface BasicStudentRegisterService {
	public BasicStudentInformationBean saveBasicStudentInformationService(StudentRegistrationRequest studentRegistrationRequest);
	public PreviousSchoolingInfoBean savePreviousSchoolingService(StudentRegistrationRequest studentRegistrationRequest,String registrationId);
public List<PreviousSchoolingInfoBean> getBasicStudentInformationListService();
}
