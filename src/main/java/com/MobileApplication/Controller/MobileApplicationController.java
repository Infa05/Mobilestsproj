package com.MobileApplication.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MobileApplication.Entity.MobileApplication;
import com.MobileApplication.Exception.IdNotFoundException;
import com.MobileApplication.Exception.NameNotFoundException;
import com.MobileApplication.Exception.StringIndexOutOfBoundException;
import com.MobileApplication.Service.MobileApplicationService;

@RestController

public class MobileApplicationController {
	@Autowired
	MobileApplicationService mp;


	@PostMapping(value="/postListObj")
	public String postListObj(@RequestBody List<MobileApplication> i1) {
		return mp.postListObj(i1);
	}

	@GetMapping (value="/getallNames")
	public List<String> getAllName()
	{
		 return mp.getAllName();
	}
	@GetMapping (value="/getInvalue")
	public List<MobileApplication> getIn()
	{
		 return (List<MobileApplication>) mp.getIn();
	}
	@GetMapping (value="/name/{a}")
	public List<MobileApplication> getNames(@PathVariable String a)
	{
		 return (List<MobileApplication>) mp.getNames(a);
	}
	@GetMapping(value="/fees/{a}/{b}")
	public List<MobileApplication> getFee(@PathVariable int a,@PathVariable int b)
	{
		 return (List<MobileApplication>) mp.getFee(a,b);
	}

	@GetMapping(value="/getMax")
	public Integer getMax()
	{
		return mp.getMax();
	}
	@GetMapping(value="/getSec")
	public List<MobileApplication> getSec()
	{
		return (List<MobileApplication>) mp.getSec();
	}
	@GetMapping(value="/getSecM")
	public List<MobileApplication> getSecM()
	{
		return (List<MobileApplication>) mp.getSecM();
	}
	@GetMapping(value="/getSumm")
	public Integer getSumm()
	{
		return mp.getSumm();
	}
	@GetMapping(value="/getOrd")
	public List<MobileApplication> getOrd() {
		return mp.getOrd();
	}
//	@GetMapping(value="/getThree")
//	public List<MobileApplication> getThree()
//	{
//		return mp.getThree();
//	}
	
	@GetMapping(value="/getNameNotFoundExp/{name}")
	public List<MobileApplication> getNameExp(@PathVariable String name) throws NameNotFoundException {
		return mp.getNameExp(name);
	}
	
	@GetMapping(value="/getIdNotFoundExp/{a}")
	public Integer getidExp(@PathVariable int a) throws IdNotFoundException {
		return mp.getidExp(a);
	}
	
	@GetMapping(value="/getStringIndexOutOfBoundExp/{b}")
	public List<MobileApplication> getStringOutOfBoundExp(@PathVariable int b) throws StringIndexOutOfBoundException, IdNotFoundException {
	    return mp.getStringOutOfBoundExp(b);
	}
	}
