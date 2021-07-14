package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.entity.AccountsPayable;
import com.trkj.medical_care_after.entity.AccountsReceivable;

import java.util.List;

public interface AccoutsReceivable {
    List<AccountsReceivable> findAll();

    AccountsReceivable findId( int id);

    void update(AccountsReceivable AccountsReceivable);

    void insertAll(AccountsReceivable AccountsReceivable);

    void deletById(int id);

}
