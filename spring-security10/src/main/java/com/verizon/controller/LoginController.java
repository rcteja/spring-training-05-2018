/**
 * 
 */
package com.verizon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author verizon
 *
 */
@Controller
public class LoginController {
	

	@RequestMapping( path ="/login" , method= RequestMethod.GET)
	public String getLoginPage(){
		System.out.println("login");
		return "login";
	}
	@RequestMapping( path ="/login" , method=RequestMethod.POST)
	public ModelAndView processLogin( @RequestParam("userName")String userName, @RequestParam("password")String password){
		
		ModelAndView mav = new ModelAndView();
		if(userName.equals(password)){
			mav.setViewName("success");
			mav.addObject("name",userName);
		}else{
			mav.setViewName("failed");
		}
		return mav;
		
	}

}
