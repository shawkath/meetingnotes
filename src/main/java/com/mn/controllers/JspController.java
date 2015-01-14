package com.mn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Shaw
 *
 */

@Controller
public class JspController {

	@RequestMapping("/")
	public String StartHomePage(ModelAndView modelAndView){
		return "homepage";	
		
	}
	
}
