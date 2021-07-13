package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.entity.Purchase;

import java.util.List;

/**
 * @author TinkerBell
 */
public interface PurchaseService {
    /**
     * 添加进货信息
     * @param record
     * @return
     */
    void insert(Purchase record);

    /**
     * 查询进货登记信息（分页）
     * @return
     */
    List<Object> select();

    /**
     * 根据进货单号删除，进货记录数
     * @param puOrderId
     * @return
     */
    void deleteByOrderId(String puOrderId);

    /**
     * 进货登记修改
     * @param record
     * @return
     */
    void updateByPrimaryKeySelective(Purchase record);
    /**
     * 多条件查询
     * @param
     * @return
     */
    List<Purchase> conditionQuery(String sname,String suppliername);

    /**
     * 采购统计
     * @return
     */
    List<Object> statisticsfind();
}
