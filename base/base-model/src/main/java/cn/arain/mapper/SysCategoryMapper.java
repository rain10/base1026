package cn.arain.mapper;

import cn.arain.pojo.SysCategory;
import cn.arain.pojo.SysCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCategoryMapper {
    int countByExample(SysCategoryExample example);

    int deleteByExample(SysCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysCategory record);

    int insertSelective(SysCategory record);

    List<SysCategory> selectByExample(SysCategoryExample example);

    SysCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysCategory record, @Param("example") SysCategoryExample example);

    int updateByExample(@Param("record") SysCategory record, @Param("example") SysCategoryExample example);

    int updateByPrimaryKeySelective(SysCategory record);

    int updateByPrimaryKey(SysCategory record);
}