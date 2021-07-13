package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.entity.SalesReturn;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author TinkerBell
 */
public interface SalesReturnService {
    /**
     * 采购退货登记
     * @param salesReturn
     * @return
     */
    void insert(SalesReturn salesReturn);

    /**
     * 查询全部
     * @return
     */
    List<Object> select();

    /**
     * 根据退货单号删除
     * @param reOrderId
     * @return
     */
    void deleteByPrimaryKey(String reOrderId);

    /**
     * 修改退货数据
     * @param salesReturn
     * @return
     */
    void updateByPrimaryKeySelective(SalesReturn salesReturn);
    /**
     * 采购退货统计
     */
    List<Object> statisticsfind2();
}
