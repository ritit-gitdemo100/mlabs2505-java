package com.mvc.d4mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

	@RequestMapping("/add")
	public String add(Model model)
	{
		Product product = new Product();
		model.addAttribute("product",product);
		return "product/add";
	}
	
	@RequestMapping("/save")
	public String save(@ModelAttribute("product") Product product)
	{
		return "product/response";
	}

	
}
