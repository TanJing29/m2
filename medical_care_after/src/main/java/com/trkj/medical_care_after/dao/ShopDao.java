package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.Shop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ShopDao {
    int deleteByPrimaryKey(Integer sid);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
    //查询所有商品
    List<Shop>findAllShop();
}