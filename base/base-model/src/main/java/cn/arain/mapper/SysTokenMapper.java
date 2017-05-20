package cn.arain.mapper;

import cn.arain.pojo.SysToken;
import cn.arain.pojo.SysTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTokenMapper {
    int countByExample(SysTokenExample example);

    int deleteByExample(SysTokenExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(SysToken record);

    int insertSelective(SysToken record);

    List<SysToken> selectByExample(SysTokenExample example);

    SysToken selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") SysToken record, @Param("example") SysTokenExample example);

    int updateByExample(@Param("record") SysToken record, @Param("example") SysTokenExample example);

    int updateByPrimaryKeySelective(SysToken record);

    int updateByPrimaryKey(SysToken record);
}