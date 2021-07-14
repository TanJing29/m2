package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.PurchaseDao;
import com.trkj.medical_care_after.entity.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author TinkerBell
 */
@Service
@Transactional
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    private PurchaseDao purchaseDao;

    /**
     * 添加进货登记信息
     * @param record
     */
    @Override
    public void insert(Purchase record) {
        purchaseDao.insert(record);
    }

    /**
     * 查询进货记录列表
     * @return
     */
    @Override
    public List<Object> select() {
        return purchaseDao.select();
    }

    /**
     * 根据进货单号删除
     * @param puOrderId
     */
    @Override
    public void deleteByOrderId(String puOrderId) {
        purchaseDao.deleteByOrderId(puOrderId);
    }

    /**
     * 根据前端传回修改数据，
     * @param record
     * @return
     */
    @Override
    public void updateByPrimaryKeySelective(Purchase record) {
         purchaseDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Purchase> conditionQuery(String sname,String suppliername) {
        return purchaseDao.conditionQuery(sname,suppliername);
    }

    @Override
    public List<Object> statisticsfind() {
        return purchaseDao.statisticsfind();
    }


}
