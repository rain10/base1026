package cn.arain.controller;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.arain.common.pojo.MenuPojo;
import cn.arain.common.util.ArainResult;
import cn.arain.pojo.SysResource;
import cn.arain.service.MenuService;

@Controller
public class ContainerController {
	@Autowired
	private MenuService menuSerice;
	@RequestMapping("container")
	public String container(Model model) {
		List<MenuPojo> reMenuPojos = new ArrayList<>();
		ArainResult result = menuSerice.load_menu(null);
		List<SysResource> data = (List<SysResource>) result.getData();
		for (SysResource sysResource : data) {
			MenuPojo menuPojo = new MenuPojo();
			menuPojo.setId(sysResource.getId());
			menuPojo.setName(sysResource.getName());
			menuPojo.setPid(sysResource.getPid());
			menuPojo.setIcon(sysResource.getIcon());
			menuPojo.setTarget(sysResource.getTarget());
			ArainResult child = menuSerice.load_child(sysResource.getId());
			List<SysResource> data2 = (List<SysResource>) child.getData();
			menuPojo.setChildren(data2);
			reMenuPojos.add(menuPojo);
		}
		model.addAttribute("menu",reMenuPojos);
		return "system/container";
	}
}
