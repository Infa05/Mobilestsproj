package com.Elc.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Elc.Dao.ElcDao;
import com.Elc.Entity.Elc;
import com.Elc.Exception.PriceException;


@Repository
public class ElcService {
	
	

	@Autowired
	ElcDao d;

	public List<Elc> post(List<Elc> e) {
		
		return d.post(e);
	}
	public Elc getSingle(int a)
	{
		return d.getSingle(a);
	}
	public List<Elc> get()
	{
		return d.get();
	}
	public String getUp(int n,Elc e)
	{
		return d.getUp(n,e);
	}

	public String deleteData(Elc e,int a)
	{
		return d.deleteData(e,a);
	}
	public Elc getById(int n,Elc name)
	{
		return d.getById(n,name);
	}
	public List<Elc> getYear(int a,List<Elc> e)
	{
		return d.getYear(a,e);
	}
	public String handleExp(Elc e ) throws PriceException
	{
		if(e.getPrice()>400000)
		{
			throw new PriceException(" Invalid ");
		}
		else
		{
			return d.handleExp(e);
		}
		
	}
	
	


}
