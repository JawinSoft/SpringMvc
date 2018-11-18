package com.elearntez.springmvc;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello(ModelMap map){
		map.addAttribute("Message", "Welcome to Spring MVC");
		return "hello";
	}
	

}
