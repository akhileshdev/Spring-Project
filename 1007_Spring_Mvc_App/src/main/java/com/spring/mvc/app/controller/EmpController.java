package com.spring.mvc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.app.bean.Emp;
import com.spring.mvc.app.dao.EmpDao;

@Controller
public class EmpController 
{   
	@Autowired
    EmpDao dao;
	
	@RequestMapping("/addemp")
	public String addEmployeeProcess(Model model)
	{
		Emp emp = new Emp();
		model.addAttribute("empobj",emp);
				
		return "empform.jsp";
	}

	
	@RequestMapping("/viewemp")
	public String viewEmployeeProcess(Model model)
	{
		List<Emp> list = dao.getEmployees();
		model.addAttribute("list",list);
		
		return "viewform.jsp";
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("emp")Emp emp)
	{
		dao.save(emp);
		
		return "redirect:/viewemp";
	}
	
	@RequestMapping("/editemp{id}")
	public String edit(@PathVariable int id,Model model)
	{
		Emp emp = dao.getEmpById(id);
		model.addAttribute("empobj",emp);
		
		return "empeditform.jsp";		
	}
	
	@RequestMapping(value = "/editsave",method = RequestMethod.POST)
	public String editsave(@ModelAttribute("emp")Emp emp)
	{
		dao.update(emp);
		
		return "redirect:/viewemap";
	}
	
	@RequestMapping(value = "/deleteemp/{id}",method = RequestMethod.POST)
	public String delete(@PathVariable int id)
	{
		dao.delete(id);
		
		return "redirect:/viewemap";
	}
	
	
	
	
}
