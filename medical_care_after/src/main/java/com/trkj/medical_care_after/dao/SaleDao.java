package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.Sale;
import com.trkj.medical_care_after.vo.SaleVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface SaleDao {
    int deleteByPrimaryKey(int said);

    int insert(Sale record);

    int insertSelective(Sale record);

    Sale selectByPrimaryKey(int said);
    //修改销售信息
    int updateByPrimaryKeySelective(Sale record);

    int updateByPrimaryKey( @Param("said")int id,@Param("state")int state);
    //查询单表所有销售信息
    List<Sale> findAllSale();

    //用于分页查询
    List<Sale>findPageSale(@Param("index") String index , @Param("value") String value);
    //统计
    List<SaleVo>findSaletj(@Param("index") String index );
}