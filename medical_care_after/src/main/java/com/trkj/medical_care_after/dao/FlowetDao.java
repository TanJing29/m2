package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.vo.FlowetVo;
import org.apache.ibatis.annotations.Mapper;

import java.awt.*;
import java.util.List;

@Mapper
public interface FlowetDao {
    int deleteByPrimaryKey(Integer fid);

    int insert(FlowetVo record);

    int insertSelective(FlowetVo record);

    FlowetVo selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(FlowetVo record);

    int updateByPrimaryKey(FlowetVo record);

    List<FlowetVo> selAllFlowet();//查询所有
    List<FlowetVo> selstatus();//待审核
    List<FlowetVo> selstatus1();//已审核
    int updstatus(FlowetVo flowetVo);//通过
    int updstatus1(FlowetVo flowetVo);//驳回

}