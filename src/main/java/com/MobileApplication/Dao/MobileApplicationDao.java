package com.MobileApplication.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.MobileApplication.Entity.MobileApplication;
import com.MobileApplication.Repository.MobileApplicationRepository;

@Repository
public class MobileApplicationDao {
	@Autowired
	MobileApplicationRepository mr;
	
	public String postListObj(List<MobileApplication> i1) {
		mr.saveAll(i1);
		return "Posting single object sucess";
	}

	public List<String> getAllName() {
		return mr.getAllName();
	}

	public List<MobileApplication> getIn() {
		return mr.getIn();
	}

	public List<MobileApplication> getNames(String a) {
		return mr.getNames(a);
	}

	public List<MobileApplication> getFee(int a, int b) {
		return mr.getFee(a, b);
	}

	public Integer getMax() {
		return mr.getMax();
	}

	public List<MobileApplication> getSec() {
		return mr.getSec();
	}

	public List<MobileApplication> getSecM() {
		return mr.getSecM();
	}

	public Integer getSumm() {
		return mr.getSumm();
	}

	public List<MobileApplication> getOrd() {
		return mr.getOrd();
	}

//	public List<MobileApplication> getThree() {
//		return mr.getThree();
//	}
	
	public List<MobileApplication> getNameExp(String name) {
		return mr.getNameExp(name);
	}
	
	public Integer getidExp(int a) {
		return mr.getidExp(a);
	}
	public List<MobileApplication> getStringOutOfBoundExp(int b) {
		return mr.getStringOutOfBoundExp(b);
	}


}
