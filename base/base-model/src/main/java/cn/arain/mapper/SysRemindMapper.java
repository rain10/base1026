package cn.arain.mapper;

import cn.arain.pojo.SysRemind;
import cn.arain.pojo.SysRemindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRemindMapper {
    int countByExample(SysRemindExample example);

    int deleteByExample(SysRemindExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRemind record);

    int insertSelective(SysRemind record);

    List<SysRemind> selectByExample(SysRemindExample example);

    SysRemind selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysRemind record, @Param("example") SysRemindExample example);

    int updateByExample(@Param("record") SysRemind record, @Param("example") SysRemindExample example);

    int updateByPrimaryKeySelective(SysRemind record);

    int updateByPrimaryKey(SysRemind record);
}