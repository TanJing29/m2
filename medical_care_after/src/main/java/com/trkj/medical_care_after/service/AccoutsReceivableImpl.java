package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.AccountsReceivableDao;
import com.trkj.medical_care_after.dao.ConnectionDao;
import com.trkj.medical_care_after.entity.AccountsReceivable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 白杨
 */
@Service
@Slf4j
public class AccoutsReceivableImpl implements AccoutsReceivable {
    @Autowired(required = false)
    private AccountsReceivableDao accountsReceivableDao;
    @Autowired(required = false)
    private ConnectionDao connectionDao;

    /**
     * 查询全部列表
     * @return
     */
    @Override
    public List<AccountsReceivable> findAll() {
        return accountsReceivableDao.findAllccr();
    }

    /**
     * 根据id查询信息
     * @param id
     * @return
     */
    @Override
    public AccountsReceivable findId(int id) {
        return accountsReceivableDao.selectByPrimaryKey(id);
    }

    /**
     * 根据id修改列表
     * @param accountsReceivable
     */
    @Override
    public void update(AccountsReceivable accountsReceivable) {
        accountsReceivableDao.updateByPrimaryKeySelective(accountsReceivable);

    }

    /**
     * 增加付款列表
     * @param accountsReceivable
     */
    @Override
    public void insertAll(AccountsReceivable accountsReceivable) {
        accountsReceivableDao.insert(accountsReceivable);
    }

    /**
     * 根据id删除
     * @param id
     */
    @Override
    public void deletById(int id) {
        accountsReceivableDao.deleteByPrimaryKey(id);

    }


}
