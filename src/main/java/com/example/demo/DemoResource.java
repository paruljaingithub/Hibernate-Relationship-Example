package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoResource {

	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value="/demo", method=RequestMethod.POST)
	public String createDemo(@RequestBody DemoDTO demoDTO) {
		demoService.addDemo(demoDTO);
		return "success";
	}
	
	@RequestMapping(value="/demo", method=RequestMethod.GET)
	public List<DemoDTO> getAllDemo() {
		
		return demoService.getAllDemo();
	}
}
