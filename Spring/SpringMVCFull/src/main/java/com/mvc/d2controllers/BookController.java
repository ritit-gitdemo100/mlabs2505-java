package com.mvc.d2controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("book")
public class BookController {

	@RequestMapping
	public String bookHome()
	{
		return "book/home";
	}
	
	@RequestMapping("/new")
	public String bookAddNew()
	{
		return "book/addnew";
	}

	@RequestMapping("/edit")
	public String bookEdit()
	{
		return "book/edit";
	}

	@RequestMapping("/view")
	public String bookView()
	{
		return "book/view";
	}


	@RequestMapping("/list")
	public String bookList()
	{
		return "book/list";
	}


	@RequestMapping("/details")
	public String apple()
	{
		return "book/list";
	}

}
