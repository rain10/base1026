package cn.arain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	
	@RequestMapping("demo")
	public String dome() {
		return "system/demo";
	}
}
