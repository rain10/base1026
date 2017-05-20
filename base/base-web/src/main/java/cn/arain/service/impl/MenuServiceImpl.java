package cn.arain.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.arain.common.util.ArainResult;
import cn.arain.common.util.JsonUtils;
import cn.arain.mapper.SysResourceMapper;
import cn.arain.mapper.SysRoleMapper;
import cn.arain.mapper.SysRoleResourceMapper;
import cn.arain.mapper.SysUserMapper;
import cn.arain.mapper.SysUserRoleMapper;
import cn.arain.pojo.SysResource;
import cn.arain.pojo.SysResourceExample;
import cn.arain.pojo.SysRole;
import cn.arain.pojo.SysRoleResource;
import cn.arain.pojo.SysRoleResourceExample;
import cn.arain.pojo.SysRoleResourceExample.Criteria;
import cn.arain.pojo.SysUser;
import cn.arain.pojo.SysUserRoleExample;
import cn.arain.pojo.SysUserRoleKey;
import cn.arain.service.MenuService;
/**
 * 
* <p>Title:MenuServiceImpl </p>
* @author Arain
* @date2017年5月18日
 */
@Service
public class MenuServiceImpl implements MenuService{
	@Autowired
	private SysResourceMapper sysResourceMapper;
	@Autowired
	private SysUserMapper sysUserMapper;
	@Autowired
	private SysRoleMapper sysRoleMapper;
	@Autowired
	private SysUserRoleMapper sysUserRoleMapper;
	@Autowired
	private SysRoleResourceMapper sysRoleResourceMapper;
	@Override
	public ArainResult load_menu(SysUser user) {
		List<SysResource> resList = new ArrayList<>();
		SysUser sysUser = sysUserMapper.selectByPrimaryKey((long) 1166);
		SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
		cn.arain.pojo.SysUserRoleExample.Criteria criteria = sysUserRoleExample.createCriteria();
		criteria.andUserIdEqualTo(sysUser.getId());
		List<SysUserRoleKey> sysUserRoleKeys = sysUserRoleMapper.selectByExample(sysUserRoleExample);
		
		for (SysUserRoleKey sysUserRoleKey : sysUserRoleKeys) {
			Long roleId = sysUserRoleKey.getRoleId();
			SysRoleResourceExample example = new SysRoleResourceExample();
			Criteria createCriteria = example.createCriteria();
			createCriteria.andRoleIdEqualTo(roleId);
			List<SysRoleResource> list = sysRoleResourceMapper.selectByExample(example);
			
			for (SysRoleResource sysRoleResource : list) {
				Long resourceId = sysRoleResource.getResourceId();
				SysResourceExample resourceExample = new SysResourceExample();
				resourceExample.setDistinct(true);
				resourceExample.setOrderByClause("sort_");
				cn.arain.pojo.SysResourceExample.Criteria createCriteria2 = resourceExample.createCriteria();
				createCriteria2.andEnabledEqualTo((short) 1);
				createCriteria2.andPidEqualTo((long) 0);
				createCriteria2.andIdEqualTo(resourceId);
				
				List<SysResource> list2 = sysResourceMapper.selectByExample(resourceExample);
				for (SysResource sysResource : list2) {
					resList.add(sysResource);
				}
			}
		}
		return ArainResult.ok(resList);
	}
	@Override
	public ArainResult load_child(long pid) {
		SysResourceExample resourceExample2 = new SysResourceExample();
		resourceExample2.setDistinct(true);
		resourceExample2.setOrderByClause("sort_");
		cn.arain.pojo.SysResourceExample.Criteria createCriteria3 = resourceExample2.createCriteria();
		createCriteria3.andPidEqualTo(pid);
		createCriteria3.andEnabledEqualTo((short) 1);
		List<SysResource> list3 = sysResourceMapper.selectByExample(resourceExample2);
		return ArainResult.ok(list3);
	}

}
