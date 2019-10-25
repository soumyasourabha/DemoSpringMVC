package com.soumyasourabha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class addController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j) {
		
		int result = i + j;
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", result);
		mv.setViewName("display");
		
		return mv;
	}

}
