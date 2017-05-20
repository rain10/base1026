package cn.arain.mapper;

import cn.arain.pojo.SysKeyword;
import cn.arain.pojo.SysKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysKeywordMapper {
    int countByExample(SysKeywordExample example);

    int deleteByExample(SysKeywordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysKeyword record);

    int insertSelective(SysKeyword record);

    List<SysKeyword> selectByExample(SysKeywordExample example);

    SysKeyword selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysKeyword record, @Param("example") SysKeywordExample example);

    int updateByExample(@Param("record") SysKeyword record, @Param("example") SysKeywordExample example);

    int updateByPrimaryKeySelective(SysKeyword record);

    int updateByPrimaryKey(SysKeyword record);
}