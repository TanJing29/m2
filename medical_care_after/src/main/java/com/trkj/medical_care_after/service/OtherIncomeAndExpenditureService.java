package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.entity.AccountsPayable;
import com.trkj.medical_care_after.entity.OtherIncomeAndExpenditure;

import java.util.List;

public interface OtherIncomeAndExpenditureService {
    List<OtherIncomeAndExpenditure> findAll();

    OtherIncomeAndExpenditure findId( int id);

    void update(OtherIncomeAndExpenditure otherIncomeAndExpenditure);

    void insertAll(OtherIncomeAndExpenditure otherIncomeAndExpenditure);

    void deletById(int id);
}
