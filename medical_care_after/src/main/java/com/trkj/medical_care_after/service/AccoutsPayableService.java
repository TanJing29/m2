package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.entity.AccountsPayable;

import java.util.List;

/**
 * @author 白杨
 */
public interface AccoutsPayableService {
    List<AccountsPayable> findAll();

    AccountsPayable findId( int id);

    void update(AccountsPayable accountsPayable);

    void insertAll(AccountsPayable accountsPayable);

    void deletById(int id);

    List<AccountsPayable> findAllLike(String suppliername);
    List<AccountsPayable> findAllLikes(String suppliername);

}
