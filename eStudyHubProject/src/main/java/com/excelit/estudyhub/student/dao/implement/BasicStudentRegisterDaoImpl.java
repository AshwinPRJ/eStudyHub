package com.excelit.estudyhub.student.dao.implement;

import java.io.Serializable;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.excelit.estudyhub.student.bean.BasicStudentInformationBean;
import com.excelit.estudyhub.student.bean.PreviousSchoolingInfoBean;
import com.excelit.estudyhub.student.dao.BasicStudentRegisterDao;

@Repository
public class BasicStudentRegisterDaoImpl implements BasicStudentRegisterDao {
	@Autowired
	private SessionFactory sessionFactory;
	private Serializable save = null;

	@Transactional
	public BasicStudentInformationBean saveBasicStudentInformationDao(
			BasicStudentInformationBean basicStudentInformation) {
		save = sessionFactory.getCurrentSession().save(basicStudentInformation);
		if (save != null) {
			return basicStudentInformation;
		} else {

			return null;
		}

	}

	@SuppressWarnings("unchecked")
	public List<PreviousSchoolingInfoBean> getBasicStudentInformationDao() {
		return sessionFactory.getCurrentSession().createCriteria(PreviousSchoolingInfoBean.class).list();
	}

	@Transactional
	public PreviousSchoolingInfoBean savePreviousSchoolingDao(PreviousSchoolingInfoBean previousSchoolingInfo) {
		save = sessionFactory.getCurrentSession().save(previousSchoolingInfo);
		if (save != null) {
			return previousSchoolingInfo;
		} else {

			return null;
		}
	}

}
