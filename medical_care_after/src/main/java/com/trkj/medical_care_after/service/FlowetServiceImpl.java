package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.FlowetDao;
import com.trkj.medical_care_after.util.BeanCopyUtil;
import com.trkj.medical_care_after.vo.FlowetVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-12 21:08
 * @Version 1.0
 */
@Service
@Slf4j
public class FlowetServiceImpl implements FlowetService {
    @Resource
    private FlowetDao flowetDao;


    @Override
    public List<FlowetVo> selAllFlowet() {
        return flowetDao.selAllFlowet();
    }

    @Override
    public FlowetVo addFlowet(FlowetVo flowetVo) {
        FlowetVo flowetVo1=new FlowetVo();
        BeanCopyUtil.copyProperties(flowetVo,flowetVo1);
        flowetDao.insertSelective(flowetVo1);
        return flowetVo1;
    }

    @Override
    public int updstatus(FlowetVo flowetVo) {
        return flowetDao.updstatus(flowetVo);
    }

    @Override
    public int updstatus1(FlowetVo flowetVo) {
        return flowetDao.updstatus1(flowetVo);
    }

    @Override
    public List<FlowetVo> selstatus() {
        return flowetDao.selstatus();
    }

    @Override
    public List<FlowetVo> selstatus1() {
        return flowetDao.selstatus1();
    }
}
