package com.excelit.estudyhub.faculty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.excelit.estudyhub.faculty.bean.FacultyProfileBean;
import com.excelit.estudyhub.faculty.service.FacultyProfileServiceInterface;
import com.excelit.estudyhub.faculty.to.request.FacultyRequest;
import com.excelit.estudyhub.faculty.to.response.FacultyResponse;
import com.excelit.estudyhub.utils.EStudyHubConstant;


@Controller
@RequestMapping("/faculty")
public class FacultyProfileController {
	@Autowired
	private FacultyProfileServiceInterface facultyProfileServiceInterface;
	
	@RequestMapping(value = "/facultyProfiling", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public FacultyResponse setFacultyProfilingController(@RequestBody FacultyRequest facultyRequest) {
		FacultyResponse facultyResponse = new FacultyResponse();
		FacultyProfileBean facultyProfileBean = new FacultyProfileBean();
		facultyProfileBean =	facultyProfileServiceInterface.setFacultyProfilingService(facultyRequest);
		if(facultyProfileBean != null){
			facultyResponse.setFacultyProfileBean(facultyProfileBean);
			facultyResponse.setResponseCode(EStudyHubConstant.OK);
			facultyResponse.setResponseMessage("Faculty Profile Saved Sucessfully");
		} else {
			facultyResponse.setResponseCode(EStudyHubConstant.NO_CONTENT);
			facultyResponse.setResponseMessage("No Data Found");
		}
		return facultyResponse;
	}
}
