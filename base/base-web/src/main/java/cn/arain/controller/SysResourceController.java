package cn.arain.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.arain.common.pojo.MenuPojo;
import cn.arain.common.util.ArainResult;
import cn.arain.common.util.JsonUtils;
import cn.arain.pojo.SysResource;
import cn.arain.service.MenuService;
import cn.arain.service.SysResourceService;
/**
 * 
* <p>Title:SysResourceController </p>
* @author Arain
* @date2017年5月18日
 */
@Controller
@PropertySource(value = "classpath:resources.properties",encoding = "utf-8")
@RequestMapping("system/resource")
public class SysResourceController {
	@Autowired
	private SysResourceService SysResourceService;
	@Autowired
	private MenuService menuService;
	@Value("${MENU}")
	private String menu;
	@Value("${MODULE}")
	private String module;
	

	@RequestMapping("list_01")
	public String load_list(HttpServletRequest request,Model model) {
		return "system/resource/list_01";
	}
	
	
	@RequestMapping(value="load_datagrid.do", produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String load_grid(HttpServletRequest request,HttpServletResponse response) {
		List<MenuPojo> reMenuPojos = new ArrayList<>();
		ArainResult result = menuService.load_menu(null);
		List<SysResource> data = (List<SysResource>) result.getData();
		for (SysResource sysResource : data) {
			MenuPojo menuPojo = new MenuPojo();
			menuPojo.setId(sysResource.getId());
			menuPojo.setName(sysResource.getName());
			menuPojo.setPid(sysResource.getPid());
			menuPojo.setEnabled(sysResource.getEnabled() == 1?"YES":"NO");
			menuPojo.setSort(sysResource.getSort());
			menuPojo.setTarget(sysResource.getTarget());
			menuPojo.setType(menu);
			ArainResult arainResult = menuService.load_child(sysResource.getId());
			List<SysResource> data2 = (List<SysResource>) arainResult.getData();
			List<MenuPojo> child = new ArrayList<>();
			for (SysResource sysResource2 : data2) {
				MenuPojo menuPojo2 = new MenuPojo();
				menuPojo2.setId(sysResource2.getId());
				menuPojo2.setName(sysResource2.getName());
				menuPojo2.setPid(sysResource2.getPid());
				menuPojo2.setEnabled(sysResource2.getEnabled() == 1?"YES":"NO");
				menuPojo2.setSort(sysResource2.getSort());
				menuPojo2.setTarget(sysResource2.getTarget());
				menuPojo2.setType(module);
				child.add(menuPojo2);
			}
			menuPojo.setChildren(child);
			reMenuPojos.add(menuPojo);
		}
		String string = JsonUtils.objectToJson(reMenuPojos);
		return string;
	}
	
	@RequestMapping("add_01")
	public String load_add() {
		return "system/resource/add_01";
	}
	
	@RequestMapping(value="load_tree.do", produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String load_tree() {
		ArainResult result = SysResourceService.load_tree();
		String tree = (String) result.getData();
		return tree;
	}
	
	@RequestMapping(value="save.do")
	@ResponseBody
	public ArainResult save_01(SysResource resource) {
		
		return ArainResult.ok("ok");
	}
}
