package com.org.mgws.schedue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.mgws.controller.BaseController;

@Controller
@RequestMapping("/CycleTest")
public class CycleTestController extends BaseController {

	
	@RequestMapping(value = "/Test")
	public String test() {
		logger.info("hello world,this is a cycle test");
		return "/showPerson";
	}
	
}
