package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.vo.ConnectionVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper/*目的就是为了不再写mapper映射文件*/
public interface ConnectionDao {
    int deleteByPrimaryKey(Integer conId);

    int insert(ConnectionVo record);

    int insertSelective(ConnectionVo record);

    ConnectionVo selectByPrimaryKey(Integer conId);

    int updateByPrimaryKeySelective(ConnectionVo record);

    int updateByPrimaryKey(ConnectionVo record);

    List<ConnectionVo> selConnection();

    List<ConnectionVo> selmhConnection(String connectionName);

}