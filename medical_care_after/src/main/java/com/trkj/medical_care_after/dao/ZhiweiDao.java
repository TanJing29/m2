package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.vo.ZhiweiVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZhiweiDao {
    int deleteByPrimaryKey(Integer zwid);

    int insert(ZhiweiVo record);

    int insertSelective(ZhiweiVo record);

    ZhiweiVo selectByPrimaryKey(Integer zwid);

    int updateByPrimaryKeySelective(ZhiweiVo record);

    int updateByPrimaryKey(ZhiweiVo record);

    List<ZhiweiVo> selZhiwei();

}