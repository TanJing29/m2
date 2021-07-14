package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.vo.SupplierVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SupplierDao {
    int deleteByPrimaryKey(Integer suppId);

    int insert(SupplierVo record);

    int insertSelective(SupplierVo record);

    SupplierVo selectByPrimaryKey(Integer suppId);

    int updateByPrimaryKeySelective(SupplierVo record);

    int updateByPrimaryKey(SupplierVo record);

    List<SupplierVo> selSupplier(); //查询

    List<SupplierVo> selmhSupplier(String suppliername);//模糊查询

}