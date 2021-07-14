package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.ReturnFrmloss;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ReturnFrmlossDao {
//    删除
    int deleteByPrimaryKey(Integer rfid);

    int insert(ReturnFrmloss record);
//    添加
    int insertSelective(ReturnFrmloss record);

    ReturnFrmloss selectByPrimaryKey(Integer rfid);
    //修改
    int updateByPrimaryKeySelective(ReturnFrmloss record);

    int updateByPrimaryKey(ReturnFrmloss record);
    //分页显示
    List<ReturnFrmloss> findPageRet(@Param("index") String index , @Param("value") String value);
}