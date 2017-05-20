package cn.arain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.arain.common.util.ArainResult;
import cn.arain.common.util.JsonUtils;
import cn.arain.mapper.SysResourceMapper;
import cn.arain.pojo.SysResource;
import cn.arain.pojo.SysResourceExample;
import cn.arain.pojo.SysResourceExample.Criteria;
import cn.arain.service.SysResourceService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * 
* <p>Title:SysResourceServiceImpl </p>
* @author Arain
* @date2017年5月18日
 */
@Service
public class SysResourceServiceImpl implements SysResourceService{
	@Autowired
	private SysResourceMapper sysResourceMapper;
	@Override
	public ArainResult save_01(SysResource resource) {
		
		return null;
	}

	@Override
	public ArainResult load_01(SysResource resource) {
		
		return null;
	}

	@Override
	public ArainResult loadResource(String roleId) {
		
		return null;
	}

	@Override
	public ArainResult loadResource(String roleId, String userType, String userId) {
		
		return null;
	}

	@Override
	public ArainResult loadOrgTree(String orgid) {
		
		return null;
	}

	@Override
	public ArainResult load_list() {
		JSONArray array = new JSONArray();
		JSONObject object = new JSONObject();
		SysResourceExample example = new SysResourceExample();
		Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo((long) 0);
		List<SysResource> list = sysResourceMapper.selectByExample(example);
		for (SysResource sysResource : list) {
			object.accumulate("ID_", sysResource.getId());
			object.accumulate("NAME_", sysResource.getName());
			object.accumulate("ENABLE_", sysResource.getEnabled()==1?"YES":"NO");
			object.accumulate("SORT_", sysResource.getSort());
			object.accumulate("TARGET_", sysResource.getTarget());
			object.accumulate("TYPE_", sysResource.getType());
			
			array.add(object);
		}
		
		
		return ArainResult.ok(array);
	}

	@Override
	public ArainResult load_list(long pid) {
		JSONArray array = new JSONArray();
		JSONObject object = new JSONObject();
		SysResourceExample example = new SysResourceExample();
		Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo(pid);
		List<SysResource> list = sysResourceMapper.selectByExample(example);
		for (SysResource sysResource : list) {
			object.accumulate("ID_", sysResource.getId());
			object.accumulate("NAME_", sysResource.getName());
			object.accumulate("ENABLE_", sysResource.getEnabled()==1?"YES":"NO");
			object.accumulate("SORT_", sysResource.getSort());
			object.accumulate("TARGET_", sysResource.getTarget());
			object.accumulate("TYPE_", sysResource.getType());
			
			array.add(object);
		}
		
		
		return ArainResult.ok(array);
	}

	@Override
	public ArainResult load_tree() {
		//父
		JSONArray array = new JSONArray();
		SysResourceExample example = new SysResourceExample();
		Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo((long) 0);
		List<SysResource> list = sysResourceMapper.selectByExample(example);
		for (SysResource sysResource : list) {
			JSONObject object = new JSONObject();
			object.accumulate("id", sysResource.getId());
			object.accumulate("text", sysResource.getName());
			object.accumulate("state", "closed");
			//子
			JSONArray array1 = new JSONArray();
			SysResourceExample example1 = new SysResourceExample();
			Criteria criteria1 = example1.createCriteria();
			criteria1.andPidEqualTo(sysResource.getId());
			List<SysResource> list1 = sysResourceMapper.selectByExample(example1);
			for (SysResource sysResource1 : list1) {
				JSONObject object1 = new JSONObject();
				object1.accumulate("id", sysResource1.getId());
				object1.accumulate("text", sysResource1.getName());
				
				array1.add(object1);
				
			}
			object.accumulate("children", array1);
			array.add(object);
		}
		
		return ArainResult.ok(array.toString());
	}

}
