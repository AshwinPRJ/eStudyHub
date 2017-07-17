package com.excelit.estudyhub.faculty.to.response;

import com.excelit.estudyhub.faculty.bean.FacultyProfileBean;
import com.excelit.estudyhub.utils.EStudyHubResponse;

public class FacultyResponse extends EStudyHubResponse {
	private FacultyProfileBean facultyProfileBean;

	/**
	 * @return the facultyProfileBean
	 */
	public FacultyProfileBean getFacultyProfileBean() {
		return facultyProfileBean;
	}

	/**
	 * @param facultyProfileBean
	 *            the facultyProfileBean to set
	 */
	public void setFacultyProfileBean(FacultyProfileBean facultyProfileBean) {
		this.facultyProfileBean = facultyProfileBean;
	}
}
