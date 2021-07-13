package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.Inventory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface InventoryDao {
    int deleteByPrimaryKey(int inId);

    List<Map<String,Object>> selectByPrimaryKey(int inId);

    List<Map<String,Object>> selectDetail();

    int insertFormation();

    Inventory updateById(int id);

    List<Map<String,Object>> selectUpper();

    List<Map<String,Object>> selectLower();
}