package cn.arain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * 
* <p>Title:MenuController </p>
* @author Arain
* @date2017年5月18日
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.arain.common.util.ArainResult;
import cn.arain.service.MenuService;
@Controller
@RequestMapping("system")
public class MenuController {
	@Autowired
	private MenuService menuService;
	
	@RequestMapping("menu/load_child.do")
	@ResponseBody
	public ArainResult load_menu(long pid){
		ArainResult result = menuService.load_child(pid);
		
		System.out.println(result.getData());
		return result;
	}
}
