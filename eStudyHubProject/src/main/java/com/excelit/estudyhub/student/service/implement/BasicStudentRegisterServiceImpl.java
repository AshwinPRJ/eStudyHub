package com.excelit.estudyhub.student.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.excelit.estudyhub.student.bean.BasicStudentInformationBean;
import com.excelit.estudyhub.student.bean.PreviousSchoolingInfoBean;
import com.excelit.estudyhub.student.dao.BasicStudentRegisterDao;
import com.excelit.estudyhub.student.request.StudentRegistrationRequest;
import com.excelit.estudyhub.student.service.BasicStudentRegisterService;
import com.excelit.estudyhub.utils.EStudyHubUtill;

@Service
public class BasicStudentRegisterServiceImpl implements BasicStudentRegisterService {
	@Autowired
	private BasicStudentRegisterDao basicStudentRegisterDao;

	@Transactional
	public BasicStudentInformationBean saveBasicStudentInformationService(
			StudentRegistrationRequest studentRegistrationRequest) {
		BasicStudentInformationBean basicStudentInformation=studentRegistrationRequest.getBasicStudentInformationBean();
		BasicStudentInformationBean basicStudentInformationBean = new BasicStudentInformationBean();
		String registerId ="";
		Integer studentRegisterId=0;
		for (PreviousSchoolingInfoBean basicStudentInfo : basicStudentRegisterDao.getBasicStudentInformationDao()) {
			registerId = basicStudentInfo.getStudentRegistrationId().getStudentRegistrationId();
		}
		if (EStudyHubUtill.isNullString(registerId)) {
			registerId = "0";
		}
		studentRegisterId=Integer.parseInt(registerId);
		studentRegisterId ++;
		basicStudentInformation.setStudentRegistrationId(studentRegisterId.toString());
		basicStudentInformationBean = basicStudentRegisterDao.saveBasicStudentInformationDao(basicStudentInformation);
		savePreviousSchoolingService(studentRegistrationRequest,basicStudentInformationBean.getStudentRegistrationId());
		return basicStudentInformationBean;

	}

	@Transactional
	public PreviousSchoolingInfoBean savePreviousSchoolingService(
			StudentRegistrationRequest studentRegistrationRequest,String registrationId) {
		PreviousSchoolingInfoBean previousSchoolingInfoBean = new PreviousSchoolingInfoBean();
		for (PreviousSchoolingInfoBean previousSchoolingInformation : studentRegistrationRequest
				.getPreviousSchoolingInfoBean()) {
			previousSchoolingInformation.setStudentRegistrationId(studentRegistrationRequest.getBasicStudentInformationBean());
			previousSchoolingInfoBean = basicStudentRegisterDao.savePreviousSchoolingDao(previousSchoolingInformation);
		}
		return previousSchoolingInfoBean;
	}
@Transactional
	public List<PreviousSchoolingInfoBean> getBasicStudentInformationListService() {
		return basicStudentRegisterDao.getBasicStudentInformationDao();
	}

}
