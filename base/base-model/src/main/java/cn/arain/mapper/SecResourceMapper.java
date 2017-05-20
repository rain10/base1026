package cn.arain.mapper;

import cn.arain.pojo.SecResource;
import cn.arain.pojo.SecResourceExample;
import cn.arain.pojo.SecResourceWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecResourceMapper {
    int countByExample(SecResourceExample example);

    int deleteByExample(SecResourceExample example);

    int insert(SecResourceWithBLOBs record);

    int insertSelective(SecResourceWithBLOBs record);

    List<SecResourceWithBLOBs> selectByExampleWithBLOBs(SecResourceExample example);

    List<SecResource> selectByExample(SecResourceExample example);

    int updateByExampleSelective(@Param("record") SecResourceWithBLOBs record, @Param("example") SecResourceExample example);

    int updateByExampleWithBLOBs(@Param("record") SecResourceWithBLOBs record, @Param("example") SecResourceExample example);

    int updateByExample(@Param("record") SecResource record, @Param("example") SecResourceExample example);
}