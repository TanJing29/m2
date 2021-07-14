package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.entity.ReturnFrmloss;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReturnService {
    List<ReturnFrmloss> findPageRet(String index , String value);

    int AddReturn(ReturnFrmloss returnFrmloss);

    int updateReturn(ReturnFrmloss returnFrmloss);

    int DelReturn(int id);
}
