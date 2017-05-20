package cn.arain.mapper;

import cn.arain.pojo.SysOrganization;
import cn.arain.pojo.SysOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOrganizationMapper {
    int countByExample(SysOrganizationExample example);

    int deleteByExample(SysOrganizationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysOrganization record);

    int insertSelective(SysOrganization record);

    List<SysOrganization> selectByExampleWithBLOBs(SysOrganizationExample example);

    List<SysOrganization> selectByExample(SysOrganizationExample example);

    SysOrganization selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysOrganization record, @Param("example") SysOrganizationExample example);

    int updateByExampleWithBLOBs(@Param("record") SysOrganization record, @Param("example") SysOrganizationExample example);

    int updateByExample(@Param("record") SysOrganization record, @Param("example") SysOrganizationExample example);

    int updateByPrimaryKeySelective(SysOrganization record);

    int updateByPrimaryKeyWithBLOBs(SysOrganization record);

    int updateByPrimaryKey(SysOrganization record);
}