package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.OtherIncomeAndExpenditureDao;
import com.trkj.medical_care_after.entity.OtherIncomeAndExpenditure;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 白杨
 */
@Service
@Slf4j
public class OtherIncomeAndExpenditureServiceImpl implements OtherIncomeAndExpenditureService {
    @Autowired(required = false)
    private OtherIncomeAndExpenditureDao otherIncomeAndExpenditureDao;

    /**
     * 查询全部列表
     * @return
     */
    @Override
    public List<OtherIncomeAndExpenditure> findAll() {
        return otherIncomeAndExpenditureDao.findAll();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */

    @Override
    public OtherIncomeAndExpenditure findId(int id) {
        return otherIncomeAndExpenditureDao.selectByPrimaryKey(id);
    }

    /**
     * 修改列表
     * @param otherIncomeAndExpenditure
     */

    @Override
    public void update(OtherIncomeAndExpenditure otherIncomeAndExpenditure) {
        otherIncomeAndExpenditureDao.updateByPrimaryKeySelective(otherIncomeAndExpenditure);
    }

    /**
     * 增加列表
     * @param otherIncomeAndExpenditure
     */

    @Override
    public void insertAll(OtherIncomeAndExpenditure otherIncomeAndExpenditure) {
        otherIncomeAndExpenditureDao.insert(otherIncomeAndExpenditure);

    }

    /**
     * 根据id删除
     * @param id
     */
    @Override
    public void deletById(int id) {
        otherIncomeAndExpenditureDao.deleteByPrimaryKey(id);

    }
}
