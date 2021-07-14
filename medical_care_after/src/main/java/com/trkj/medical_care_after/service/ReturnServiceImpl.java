package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.ReturnFrmlossDao;
import com.trkj.medical_care_after.entity.ReturnFrmloss;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.util.List;
@Service
@Slf4j
public class ReturnServiceImpl implements ReturnService {
    @Autowired
    private ReturnFrmlossDao dao;
    @Override
    public List<ReturnFrmloss> findPageRet(String index, String value) {
        return dao.findPageRet(index,value);
    }

    @Override
    @Transactional
    public int AddReturn(ReturnFrmloss returnFrmloss) {
        return dao.insertSelective(returnFrmloss);
    }

    @Override
    @Transactional
    public int updateReturn(ReturnFrmloss returnFrmloss) {
        return dao.updateByPrimaryKeySelective(returnFrmloss);
    }

    @Override
    @Transactional
    public int DelReturn(int id) {
        return dao.deleteByPrimaryKey(id);
    }
}
