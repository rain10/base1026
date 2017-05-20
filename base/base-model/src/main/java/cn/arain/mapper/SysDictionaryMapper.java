package cn.arain.mapper;

import cn.arain.pojo.SysDictionary;
import cn.arain.pojo.SysDictionaryExample;
import cn.arain.pojo.SysDictionaryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictionaryMapper {
    int countByExample(SysDictionaryExample example);

    int deleteByExample(SysDictionaryExample example);

    int deleteByPrimaryKey(SysDictionaryKey key);

    int insert(SysDictionary record);

    int insertSelective(SysDictionary record);

    List<SysDictionary> selectByExample(SysDictionaryExample example);

    SysDictionary selectByPrimaryKey(SysDictionaryKey key);

    int updateByExampleSelective(@Param("record") SysDictionary record, @Param("example") SysDictionaryExample example);

    int updateByExample(@Param("record") SysDictionary record, @Param("example") SysDictionaryExample example);

    int updateByPrimaryKeySelective(SysDictionary record);

    int updateByPrimaryKey(SysDictionary record);
}