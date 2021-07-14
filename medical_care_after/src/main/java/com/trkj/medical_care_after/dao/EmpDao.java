package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.vo.EmpVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpDao {
    int deleteByPrimaryKey(Integer empid);

    int insert(EmpVo record);

    int insertSelective(EmpVo record);

    EmpVo selectByPrimaryKey(Integer empid);

    int updateByPrimaryKeySelective(EmpVo record);

    int updateByPrimaryKey(EmpVo record);

    List<EmpVo> selEmp();
}