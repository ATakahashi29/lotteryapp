package com.lottery.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class LotteryController {
	
//	@Autowired
//	lottery lotteryMapper;
	
	@RequestMapping(value="/login" )
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping(value="/")
    public  String index(Model model){	    	
		
        
        //str型を返す。　index.html　へ返す
		return "redirect:/login";
//		return "index";
	}
	@RequestMapping(value="/add")
    public  String add(Model model){	    	
		
        
        //str型を返す。　index.html　へ返す
		return "redirect:/";
//		return "index";
	}
}
