package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.vo.FlowetVo;

import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-12 21:08
 * @Version 1.0
 */
public interface FlowetService {
    List<FlowetVo> selAllFlowet();//查询所有
    FlowetVo addFlowet(FlowetVo flowetVo);//新增
    int updstatus(FlowetVo flowetVo);//通过
    int updstatus1(FlowetVo flowetVo);//驳回
    List<FlowetVo> selstatus();//待审核
    List<FlowetVo> selstatus1();//已审核
}
