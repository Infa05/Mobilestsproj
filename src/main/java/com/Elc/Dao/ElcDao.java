package com.Elc.Dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Elc.Entity.Elc;
import com.Elc.Repository.ElcRepository;


@Repository
public class ElcDao {
	
	
	@Autowired
	ElcRepository r;
	public List<Elc> post(List<Elc> e) 
	{
		r.saveAll(e);
		return e;
	}
	public Elc getSingle(int a)
	{
		return r.findById(a).get();
	}

	public List<Elc> get()
	{
		return r.findAll();
	}
	public String getUp(int n,Elc e)
	{
		Elc x=r.findById(n).get();
	
		x.setPrice(e.getPrice()+1700);
		r.save(x);
		return "Update Success";
		
		
	}
	public String deleteData(Elc e,int a)
	{
		
		r.deleteById(a);
		
		return "Delete Successfully";
	}
	public Elc getById(int n,Elc name)
	{
		Elc x=r.findById(n).get();
		return x;
	}
	public List<Elc> getYear(int a,List<Elc> e)
	{
		List<Elc> list=e.stream().filter(x->x.getModelYear()==2023).collect(Collectors.toList());
	return list;
	}

	public String handleExp(Elc e)
	{
	r.save(e);
	return "SucessFully Save";
	}
	

}
