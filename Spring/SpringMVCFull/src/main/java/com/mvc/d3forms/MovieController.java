package com.mvc.d3forms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movie")
public class MovieController {

	@RequestMapping("/add")
	public String add()
	{
		return "movie/add";
	}
	
	@RequestMapping("/save")
	public String save()
	{
		return "movie/response";
	}

	
}
