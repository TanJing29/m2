package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.SalesReturnDao;
import com.trkj.medical_care_after.entity.SalesReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author TinkerBell
 */
@Service
@Transactional
public class SalesReturnServiceImpl implements SalesReturnService {
    @Autowired
    private SalesReturnDao salesReturnDao;
    /**
     * 添加采购退货信息
     * @param salesReturn
     */
    @Override
    public void insert(SalesReturn salesReturn) {
        salesReturnDao.insert(salesReturn);
    }

    /**
     * 查询全部的采购退货信息
     * @return
     */
    @Override
    public List<Object> select() {
        return salesReturnDao.select();
    }

    /**
     * 根据退换单删除
     * @param reOrderId
     */
    @Override
    public void deleteByPrimaryKey(String reOrderId) {
        salesReturnDao.deleteByPrimaryKey(reOrderId);
    }

    /**
     * 修改退货登记信息
     * @param salesReturn
     */
    @Override
    public void updateByPrimaryKeySelective(SalesReturn salesReturn) {
        salesReturnDao.updateByPrimaryKeySelective(salesReturn);
    }

    @Override
    public List<Object> statisticsfind2() {
        return salesReturnDao.statisticsfind2();
    }
}
