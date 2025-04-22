package com.Elc.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Elc.Entity.Elc;
import com.Elc.Exception.PriceException;
import com.Elc.Service.ElcService;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ElcController {
			
	
	@Autowired
	ElcService s;
	
	@PostMapping(value="/single")
	public List<Elc> post(@RequestBody List<Elc> e)
	{
	return s.post(e);		
	}

	@GetMapping(value="/getSingle/{a}")
	public Elc getSingle(@PathVariable int a)
	{
		return s.getSingle(a);
	}

	@GetMapping(value="/get")
	public List<Elc> get()
	{
		return s.get();
	}

	@PutMapping(value="/update/{n}")
	public String getUp(@PathVariable int n,@RequestBody Elc e)
	{
		return s.getUp(n,e);
	}
	@DeleteMapping(value="/delete/{n}")
	public String deleteData(@RequestBody Elc e,@PathVariable  int n)
	{
		return s.deleteData(e,n);
	}
	@GetMapping(value="/getbyid/{n}")
	public Elc updateNa(@PathVariable int n,@RequestBody Elc name)
	{
		return s.getById(n,name);
	}
	@GetMapping(value="getByYear/{n}")
	public List<Elc> getByYear(@PathVariable int n,@RequestBody List<Elc> e)
	{
		return s.getYear(n,e);
	}
	


	@PostMapping(value="/putExp")
	public String handleExp(@RequestBody Elc e) throws PriceException
	{
		return s.handleExp(e);
	}


}
