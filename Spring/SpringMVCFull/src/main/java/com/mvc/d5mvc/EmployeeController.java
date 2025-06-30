package com.mvc.d5mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@RequestMapping("/add")
	public String add(Model model)
	{
		Employee emp = new Employee();
		model.addAttribute("emp",emp);
		return "emp/add";
	}
	
	@RequestMapping("/save")
	public String save(@ModelAttribute("emp") Employee emp)
	{
		return "emp/response";
	}
	
	
	

	
}
