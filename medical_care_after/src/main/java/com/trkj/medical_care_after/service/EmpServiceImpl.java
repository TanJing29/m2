package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.EmpDao;
import com.trkj.medical_care_after.vo.EmpVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-13 1:49
 * @Version 1.0
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDao empDao;

    @Override
    public List<EmpVo> selEmp() {
        return empDao.selEmp();
    }
}
