package br.edu.sistemaeventos.controller;

import java.util.Map;

import org.aspectj.bridge.ICommand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FrontController {
	
	//private Map<String, IViewHelper> viewHelpers;
    private Map<String, ICommand> commands;
	
	@RequestMapping("/helloworld")
	@ResponseBody
	public String home() {
		return "Hello World!";
	}
	
	
	
}
