package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.AccountsPayable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * @author 白杨
 */
@Mapper
public interface AccountsPayableDao {
    int deleteByPrimaryKey(Integer apId);

    int insert(AccountsPayable record);

    int insertSelective(AccountsPayable record);

    AccountsPayable selectByPrimaryKey(Integer apId);

    int updateByPrimaryKeySelective(AccountsPayable record);

    int updateByPrimaryKey(AccountsPayable record);
    List<AccountsPayable> finAllaccp();
    List<AccountsPayable> findAllLike(String suppliername);
    List<AccountsPayable> findAllLikes(String suppliername);
}