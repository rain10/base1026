package cn.arain.mapper;

import cn.arain.pojo.SysExpress;
import cn.arain.pojo.SysExpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysExpressMapper {
    int countByExample(SysExpressExample example);

    int deleteByExample(SysExpressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysExpress record);

    int insertSelective(SysExpress record);

    List<SysExpress> selectByExample(SysExpressExample example);

    SysExpress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysExpress record, @Param("example") SysExpressExample example);

    int updateByExample(@Param("record") SysExpress record, @Param("example") SysExpressExample example);

    int updateByPrimaryKeySelective(SysExpress record);

    int updateByPrimaryKey(SysExpress record);
}