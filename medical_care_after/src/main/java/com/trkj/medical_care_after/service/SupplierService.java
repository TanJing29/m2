package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.vo.SupplierVo;

import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-11 16:16
 * @Version 1.0
 */
public interface SupplierService {
    List<SupplierVo> selSupplier(); //查询
    List<SupplierVo> selmhSupplier(String suppliername);//模糊分页查询
    SupplierVo addSupplier(SupplierVo supplierVo);//新增
    int updSupplier(SupplierVo supplierVo);//修改
    int delSupplier(Integer suppId);//删除
}
