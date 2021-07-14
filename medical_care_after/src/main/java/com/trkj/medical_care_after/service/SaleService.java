package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.entity.Sale;
import com.trkj.medical_care_after.vo.SaleVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleService {
   //查询单表所有销售信息
   List<Sale> findALlSale();
   //用于分页查询
   List<Sale>findPageSale(String index , String value);
   //修改销售信息
   int uapdateSale(Sale sale);
   //修改状态
   int uapdateSale2(int id,int state);
   //增加销售信息
   int AddSale(Sale sale);
   //删除销售信息
   int delSale(int said);
   //统计
   List<SaleVo>Saletj( String index);
}
