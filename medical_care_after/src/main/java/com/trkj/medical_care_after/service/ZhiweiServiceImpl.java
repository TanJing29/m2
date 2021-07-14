package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.ZhiweiDao;
import com.trkj.medical_care_after.vo.ZhiweiVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-13 10:54
 * @Version 1.0
 */
@Service
public class ZhiweiServiceImpl implements ZhiweiService {
    @Resource
    private ZhiweiDao zhiweiDao;

    @Override
    public List<ZhiweiVo> selZhiwei() {
        return zhiweiDao.selZhiwei();
    }
}
