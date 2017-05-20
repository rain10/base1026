package cn.arain.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.arain.common.pojo.DataGrid;
import cn.arain.common.util.ArainResult;
import cn.arain.common.util.JsonUtils;
import cn.arain.mapper.SysRoleMapper;
import cn.arain.pojo.SysRole;
import cn.arain.pojo.SysRoleExample;
import cn.arain.pojo.SysRoleExample.Criteria;
import cn.arain.service.SysRoleService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
@PropertySource(value = "classpath:resources.properties",encoding = "utf-8")
public class SysRoleServiceImpl implements SysRoleService{
	@Autowired
	private SysRoleMapper sysRoleMapper;
	@Value("${ENABlE}")
	private String enableCheck;
	@Value("${ARAIN}")
	private Long status;

	@Override
	public ArainResult save_01(SysRole sysRole) {
		
		return null;
	}

	@Override
	public ArainResult load_01(SysRole sysRole) {
		
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
	public ArainResult load_list(int page, int rows, String sort,String order,String name,String enable) {
		JSONObject out = new JSONObject();
		JSONArray array = new JSONArray();
		SysRoleExample example = new SysRoleExample();
		example.setOrderByClause(sort);
		Criteria criteria = example.createCriteria();
		
		criteria.andIdNotEqualTo(status);
		if(StringUtils.isNotBlank(name)) {
			criteria.andNameLike("%"+name+"%");
		}
		
		if(StringUtils.isNotBlank(enable)) {
			if (enableCheck.equals(enable)) {
				criteria.andEnabledEqualTo((short) 1);
			} else{
				criteria.andEnabledEqualTo((short) 0);
			}
		}
		PageHelper.startPage(page, rows);
		List<SysRole> list = sysRoleMapper.selectByExample(example);
		int count = sysRoleMapper.countByExample(example);
		for (SysRole sysRole : list) {
			JSONObject object = new JSONObject();
			object.accumulate("ID_", sysRole.getId());
			object.accumulate("NAME_", sysRole.getName());
			object.accumulate("SORT_", sysRole.getSort());
			object.accumulate("OPERATOR_", sysRole.getOperator());
			object.accumulate("OP_TIME_", sysRole.getOpTime().toString());
			object.accumulate("ENABLED_", sysRole.getEnabled()==1?"YES":"NO");
			array.add(object);
		}
		
		DataGrid grid = new DataGrid();
		
		out.accumulate("total",count);
		out.accumulate("rows",array);
		grid.setTotal(count);
		grid.setRows(array);
		
		return ArainResult.ok(JsonUtils.objectToJson(out));
	}

}
