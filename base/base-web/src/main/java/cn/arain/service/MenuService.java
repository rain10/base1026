package cn.arain.service;

import cn.arain.common.util.ArainResult;
import cn.arain.pojo.SysUser;

public interface MenuService {
	ArainResult load_menu(SysUser user);
	ArainResult load_child(long pid);
}
