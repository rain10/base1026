package cn.arain.service;

import cn.arain.common.util.ArainResult;
import cn.arain.pojo.SysRole;

public interface SysRoleService {
	/**
	 *  保存功能
	 * @param dto
	 * @return
	 */
	public ArainResult save_01(SysRole sysRole);
	
	/**
	 * 修改页面加载回显数据
	 * @param sysResourceDto
	 */
	public ArainResult load_01(SysRole sysRole);
	
	/**
	 * 加载tree
	 * @return
	 */
	public ArainResult loadResource(String roleId);
	
	public ArainResult loadResource(String roleId, String userType, String userId);
	
	/**
	 * 加载机构树，当前及以下
	 * @param orgid 为空时加载所有机构
	 * @return
	 */
	public ArainResult loadOrgTree(String orgid);
	
	/**
	 * 
	 * @return
	 */
	public ArainResult load_list(int page,int rows, String sort,String order,String name,String enable);
	
}
