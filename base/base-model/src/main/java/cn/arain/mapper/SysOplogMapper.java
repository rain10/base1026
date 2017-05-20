package cn.arain.mapper;

import cn.arain.pojo.SysOplog;
import cn.arain.pojo.SysOplogExample;
import cn.arain.pojo.SysOplogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOplogMapper {
    int countByExample(SysOplogExample example);

    int deleteByExample(SysOplogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysOplogWithBLOBs record);

    int insertSelective(SysOplogWithBLOBs record);

    List<SysOplogWithBLOBs> selectByExampleWithBLOBs(SysOplogExample example);

    List<SysOplog> selectByExample(SysOplogExample example);

    SysOplogWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysOplogWithBLOBs record, @Param("example") SysOplogExample example);

    int updateByExampleWithBLOBs(@Param("record") SysOplogWithBLOBs record, @Param("example") SysOplogExample example);

    int updateByExample(@Param("record") SysOplog record, @Param("example") SysOplogExample example);

    int updateByPrimaryKeySelective(SysOplogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysOplogWithBLOBs record);

    int updateByPrimaryKey(SysOplog record);
}