package com.mjwise.bimmanger.controller.view;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class BaseController {
	@GetMapping("/")
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@GetMapping("/test01")
	public ModelAndView test1(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test01");
		return modelAndView;
	}

	@GetMapping("/test02")
	public ModelAndView test2(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test02");
		return modelAndView;
	}


	@GetMapping("/test03")
	public ModelAndView test3(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test03");
		return modelAndView;
	}

	@GetMapping("/test04")
	public ModelAndView test4(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test04");
		return modelAndView;
	}
	@GetMapping("/test05")
	public ModelAndView test5(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test05");
		return modelAndView;
	}

	@GetMapping("/test06")
	public ModelAndView test6(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test06");
		return modelAndView;
	}

}
