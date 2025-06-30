package com.mvc.d1intro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping
	public String homePage()
	{
		return "home";
	}

	@RequestMapping("/utkarsh")
	public String firstPage()
	{
		return "first";
	}
	

	@RequestMapping("/second")
	public ModelAndView secondPage()
	{
		ModelAndView mv= new ModelAndView("abc");
		mv.addObject("msg", "Wipro Tech");
		
		return mv;
	}
	

}
