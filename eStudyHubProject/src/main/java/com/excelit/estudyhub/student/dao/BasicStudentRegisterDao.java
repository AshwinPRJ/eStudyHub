package com.excelit.estudyhub.student.dao;
/**
 * @author Pooja
 * this interface is for basic student registration 
 */
import java.util.List;

import com.excelit.estudyhub.student.bean.BasicStudentInformationBean;
import com.excelit.estudyhub.student.bean.PreviousSchoolingInfoBean;

public interface BasicStudentRegisterDao {

public List<PreviousSchoolingInfoBean> getBasicStudentInformationDao();
public BasicStudentInformationBean saveBasicStudentInformationDao(BasicStudentInformationBean basicStudentInformation);
public PreviousSchoolingInfoBean savePreviousSchoolingDao(PreviousSchoolingInfoBean previousSchoolingInfo);

}
