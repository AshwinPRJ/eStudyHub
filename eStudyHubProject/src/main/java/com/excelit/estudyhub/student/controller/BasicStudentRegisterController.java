package com.excelit.estudyhub.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.excelit.estudyhub.student.bean.BasicStudentInformationBean;
import com.excelit.estudyhub.student.bean.PreviousSchoolingInfoBean;
import com.excelit.estudyhub.student.request.StudentRegistrationRequest;
import com.excelit.estudyhub.student.response.BasicStudentRegistrationResponse;
import com.excelit.estudyhub.student.service.BasicStudentRegisterService;
import com.excelit.estudyhub.utils.EStudyHubConstant;

@Controller
@RequestMapping("/student_register")
public class BasicStudentRegisterController {
	@Autowired
	private BasicStudentRegisterService basicStudentRegisterService;
	 
	@RequestMapping(value = "/save__basic_studentInformation", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public BasicStudentRegistrationResponse saveBasicStudentInformationController(@RequestBody StudentRegistrationRequest studentRegistrationRequest) {
		BasicStudentRegistrationResponse basicStudentRegistrationResponse=new BasicStudentRegistrationResponse();
		BasicStudentInformationBean basicStudentInformationBean = new BasicStudentInformationBean();
		basicStudentInformationBean = basicStudentRegisterService.saveBasicStudentInformationService(studentRegistrationRequest);
		if(basicStudentInformationBean!=null){
			basicStudentRegistrationResponse.setBasicStudentInformation(basicStudentInformationBean);
			basicStudentRegistrationResponse.setResponseCode(EStudyHubConstant.SUCCESS);
			basicStudentRegistrationResponse.setResponseMessage(EStudyHubConstant.SUCCESSMSGFORDATASAVING);
		}
		return basicStudentRegistrationResponse;
	}

	@RequestMapping(value = "/get__basic_studentInformation", method = RequestMethod.POST)
	@ResponseBody
	public BasicStudentRegistrationResponse getBasicStudentRegistrationInfo(){
		BasicStudentRegistrationResponse basicStudentRegistrationResponse=new BasicStudentRegistrationResponse();
		List<PreviousSchoolingInfoBean> basicStudentInformationList=basicStudentRegisterService.getBasicStudentInformationListService();
		if(basicStudentInformationList!=null){
			basicStudentRegistrationResponse.setResponseCode(EStudyHubConstant.SUCCESS);
			basicStudentRegistrationResponse.setResponseMessage(EStudyHubConstant.NO_DATA);
			basicStudentRegistrationResponse.setPreviousSchoolingInfoList(basicStudentInformationList);
		}
		return basicStudentRegistrationResponse;
	}
	
	
}
