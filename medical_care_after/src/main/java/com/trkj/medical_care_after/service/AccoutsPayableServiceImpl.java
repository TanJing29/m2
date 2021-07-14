package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.AccountsPayableDao;
import com.trkj.medical_care_after.entity.AccountsPayable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;

/**
 * @author 白杨
 */
@Service
@Slf4j
public class AccoutsPayableServiceImpl implements AccoutsPayableService {
    @Autowired(required = false)
    private AccountsPayableDao accountsPayableDao;
    @Override
    /**
     * 查询应付账款登记列表
     */
    public List<AccountsPayable> findAll() {
        return accountsPayableDao.finAllaccp();
    }
    /**
     * 根据id查询付款列表
     * */
    @Override
    public AccountsPayable findId(int id) {
        return accountsPayableDao.selectByPrimaryKey(id);
    }
    /**
     * 修改付款列表
     * */
    @Transient
    @Override
    public void update(AccountsPayable accountsPayable) {
        accountsPayableDao.updateByPrimaryKeySelective(accountsPayable);

    }
    /**
     * 增加付款列表
     * */
    @Transient
    @Override
    public void insertAll(AccountsPayable accountsPayable) {
        accountsPayableDao.insert(accountsPayable);
    }

    /**
     * 删除付款列表
     * @param id
     */
    @Override
    public void deletById(int id) {
        accountsPayableDao.deleteByPrimaryKey(id);
    }

    /**
     * 模糊查询
     * @param suppliername
     * @param
     * @return
     */
    @Override
    public List<AccountsPayable> findAllLike(String suppliername) {
        return accountsPayableDao.findAllLike(suppliername);
    }

    @Override
    public List<AccountsPayable> findAllLikes(String suppliername) {
        return accountsPayableDao.findAllLikes(suppliername);
    }
}
