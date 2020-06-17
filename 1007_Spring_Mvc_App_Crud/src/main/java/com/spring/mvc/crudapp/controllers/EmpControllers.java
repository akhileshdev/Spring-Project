package com.spring.mvc.crudapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.crudapp.bean.Emp;
import com.spring.mvc.crudapp.edao.EmpDao;

@Controller
public class EmpControllers 
{
	@Autowired
    EmpDao dao;
	
	@RequestMapping("/addEmployeeRequest")
	public String addEmployee(Model m)
	{
		m.addAttribute("command",new Emp());
		
		return "empform.jsp";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("emp") Emp emp)
	{
		dao.save(emp);
		
		return "redirect:/viewemp.jsp";
	}
	
	
	@RequestMapping(value = "/editemp/{id}")
	public String editEmployee(@PathVariable int id,Model m)
	{
		Emp emp = dao.getEmpById(id);
		m.addAttribute("command",emp);
		
		return "empeditform.jsp";
	}
	
	
	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String editSave(@ModelAttribute("emp") Emp emp)
	{
		dao.update(emp);
		
		return "redirect:/viewemp.jsp";
	}
	
	
	@RequestMapping(value = "/viewEmployeeRequest", method = RequestMethod.GET)
	public String viewEmployee(Model m)
	{
		List<Emp> list  = dao.getEmployees();
		m.addAttribute("list",list);
		
		return "viewemp.jsp";
	}
	
	
	@RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable int id)
	{
		dao.delete(id);
		
		return "redirect:/viewemp.jsp";
	}
	
}
