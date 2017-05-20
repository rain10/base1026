package cn.arain.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.arain.common.util.ArainResult;
import cn.arain.service.SysRoleService;

@Controller
@RequestMapping("system/role")
public class SysRoleController {
	@Autowired
	private SysRoleService sysRoleService;
	
	@RequestMapping("list_01")
	public String load_list(HttpServletRequest request,Model model) {
		return "system/role/list_01";
	}
	
	
	@RequestMapping(value="load_datagrid.do", produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String load_grid(HttpServletRequest request,HttpServletResponse response,int page,
			 int rows, String sort,String order,String name,String enable) {
		ArainResult arainResult = sysRoleService.load_list(page, rows, sort, order,name,enable);
		String array = (String) arainResult.getData();
		return array;
	}
	
	@RequestMapping("add_01")
	public String load_add() {
		return "system/role/add_01";
	}
}
