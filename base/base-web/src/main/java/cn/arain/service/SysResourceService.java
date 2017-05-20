package cn.arain.service;

import cn.arain.common.util.ArainResult;
import cn.arain.pojo.SysResource;

public interface SysResourceService {
	/**
	 *  保存功能
	 * @param dto
	 * @return
	 */
	public ArainResult save_01(SysResource resource);
	
	/**
	 * 修改页面加载回显数据
	 * @param sysResourceDto
	 */
	public ArainResult load_01(SysResource resource);
	
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
	public ArainResult load_list();
	public ArainResult load_list(long pid);
	
	public ArainResult load_tree();
}
