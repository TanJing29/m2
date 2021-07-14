package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.OtherIncomeAndExpenditure;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OtherIncomeAndExpenditureDao {
    int deleteByPrimaryKey(Integer otrId);

    int insert(OtherIncomeAndExpenditure record);

    int insertSelective(OtherIncomeAndExpenditure record);

    OtherIncomeAndExpenditure selectByPrimaryKey(Integer otrId);

    int updateByPrimaryKeySelective(OtherIncomeAndExpenditure record);

    int updateByPrimaryKey(OtherIncomeAndExpenditure record);
    List<OtherIncomeAndExpenditure> findAll();
}