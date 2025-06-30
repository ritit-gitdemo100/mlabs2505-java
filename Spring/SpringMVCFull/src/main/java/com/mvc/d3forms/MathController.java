package com.mvc.d3forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/math")
public class MathController {

	@RequestMapping("/add")
	public String addForm()
	{
		return "math/inputform";
	}
	
	@RequestMapping("/addprocess")
	public String addProcess(HttpServletRequest req, Model model)
	{
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int res = a+b;
		
		model.addAttribute("res",res);
			
		return "math/outputform";
	}

	@RequestMapping("/sub")
	public String sumForm()
	{
		return "math/subform";
	}
	
	
	@RequestMapping("/subprocess")
	public String subProcess(@RequestParam("num1") int a, @RequestParam("num2") int b, Model model)
	{
//		int a = Integer.parseInt(req.getParameter("num1"));
//		int b = Integer.parseInt(req.getParameter("num2"));
		int res = a-b;
		
		model.addAttribute("res",res);
			
		return "math/outputform";
	}

	@RequestMapping("/mul")
	public String mulForm()
	{
		return "math/mulform";
	}
	
	
	@RequestMapping("/mulprocess")
	public String mulProcess(
			@RequestParam("num1") int a, 
			@RequestParam(name="num2", required=false, defaultValue="0") int b, 
			Model model)
	{
		int res = a*b;
		
		model.addAttribute("res",res);
			
		return "math/outputform";
	}

	
}
