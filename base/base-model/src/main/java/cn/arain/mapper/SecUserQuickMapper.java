package cn.arain.mapper;

import cn.arain.pojo.SecUserQuick;
import cn.arain.pojo.SecUserQuickExample;
import cn.arain.pojo.SecUserQuickKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecUserQuickMapper {
    int countByExample(SecUserQuickExample example);

    int deleteByExample(SecUserQuickExample example);

    int deleteByPrimaryKey(SecUserQuickKey key);

    int insert(SecUserQuick record);

    int insertSelective(SecUserQuick record);

    List<SecUserQuick> selectByExample(SecUserQuickExample example);

    SecUserQuick selectByPrimaryKey(SecUserQuickKey key);

    int updateByExampleSelective(@Param("record") SecUserQuick record, @Param("example") SecUserQuickExample example);

    int updateByExample(@Param("record") SecUserQuick record, @Param("example") SecUserQuickExample example);

    int updateByPrimaryKeySelective(SecUserQuick record);

    int updateByPrimaryKey(SecUserQuick record);
}