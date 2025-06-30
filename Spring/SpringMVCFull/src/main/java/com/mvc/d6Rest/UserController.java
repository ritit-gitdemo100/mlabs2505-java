package com.mvc.d6Rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	//@RequestMapping("/login")
//	
//	@RequestMapping(value="/login", method=RequestMethod.GET)
//	public String loginForm(Model model)
//	{
//		model.addAttribute("user",new User());
//		return "user/add";
//	}
//	
//	@RequestMapping(value="/login", method=RequestMethod.POST)
//	public String save(@ModelAttribute("user") User user)
//	{
//		return "user/response";
//	}
	
	
	@GetMapping("/login")
	public String loginForm(Model model)
	{
		model.addAttribute("user",new User());
		
		
		return "user/add";
	}
	
	@PostMapping("/login")
	public String save(@ModelAttribute("user") User user)
	{
		return "user/response";
	}
	

}
