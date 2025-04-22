package com.MobileApplication.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.MobileApplication.Entity.MobileApplication;
import com.MobileApplication.Exception.IdNotFoundException;
import com.MobileApplication.Exception.NameNotFoundException;
import com.MobileApplication.Dao.MobileApplicationDao;

@Service
public class MobileApplicationService {

	@Autowired
	MobileApplicationDao md;

	
	public String postListObj(List<MobileApplication> i1) {
		return md.postListObj(i1);
	}
	
	public List<String> getAllName() {
		return md.getAllName();
	}

	public List<MobileApplication> getIn() {
		return md.getIn();
	}

	public List<MobileApplication> getNames(String a) {
		return md.getNames(a);
	}

	public List<MobileApplication> getFee(int a, int b) {
		return md.getFee(a, b);
	}

	public Integer getMax() {
		return md.getMax();
	}

	public List<MobileApplication> getSec() {
		return md.getSec();
	}

	public List<MobileApplication> getSecM() {
		return md.getSecM();
	}

	public Integer getSumm() {
		return md.getSumm();
	}

	public List<MobileApplication> getOrd() {
		return md.getOrd();
	}

//	public List<MobileApplication> getThree() {
//		return md.getThree();
//	}

	
	public List<MobileApplication> getNameExp(String name) throws NameNotFoundException {
		if(md.getNameExp(name).isEmpty()) {
			  throw new NameNotFoundException("The name is not found in DB");
		}
	
	else {
		return md.getNameExp(name);
		
	}
}
	
	public Integer getidExp(int a) throws IdNotFoundException {
		if(md.getidExp(a)==null) {
			  throw new IdNotFoundException("The name is not found in DB");
		}
	
	else {
		return md.getidExp(a);
		
	}
}
	public List<MobileApplication> getStringOutOfBoundExp(int b) throws IdNotFoundException {
		List<MobileApplication> c = md.getStringOutOfBoundExp(b);
		if(c.isEmpty()) {
			  throw new StringIndexOutOfBoundsException("The name is not found in DB");
		}
	
	else {
		return c;
		
	}
}
	
	
}