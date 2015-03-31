package com.anand.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
		
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView model=new ModelAndView("home");
		model.addObject("msg","Welcome to varisis!");
		return model;
		
	}
	
	@RequestMapping(value="/Login.html", method=RequestMethod.GET)
	public ModelAndView Login(){
		ModelAndView model=new ModelAndView("Login");
		model.addObject("msg","Enter the User Name and Password:");
		return model;
		
	}
	
	@RequestMapping(value="/Submitaction.html", method=RequestMethod.POST)
	public ModelAndView Submitaction(@RequestParam("uname") String name,@RequestParam("pass")String pas){
		ModelAndView model=new ModelAndView("Success");
		//model.addObject("msg","Welcome "+name+"<br>"+" And your password is "+pas+" Thankyou!");
		Login log=new Login();
		log.setName(name);
		log.setPassword(pas);
		model.addObject("log1",log);		
		return model;
		
	}
}
