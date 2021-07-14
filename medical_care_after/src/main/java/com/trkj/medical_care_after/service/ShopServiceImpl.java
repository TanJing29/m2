package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.ShopDao;
import com.trkj.medical_care_after.entity.Shop;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;
    @Override
    public List<Shop> findAllShop() {
        List<Shop> list=shopDao.findAllShop();
        log.debug(list.toString());
        return list;
    }
}
