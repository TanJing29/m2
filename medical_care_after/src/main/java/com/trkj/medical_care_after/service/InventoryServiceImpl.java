package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.InventoryDao;
import com.trkj.medical_care_after.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private InventoryDao inventoryDao;


    @Override
    public int deleteByPrimaryKey(int inId) {
        int count= inventoryDao.deleteByPrimaryKey(inId);
        return count;
    }

    @Override
    public List<Map<String, Object>> detail() {
        List<Map<String,Object>> list=inventoryDao.selectDetail();
        return list;
    }

    @Override
    public Inventory updateFormation(int id) {
        return inventoryDao.updateById(id);
    }

    @Override
    public List<Map<String, Object>> Upper() {
        List<Map<String,Object>> list=inventoryDao.selectUpper();
        return list;
    }

    @Override
    public List<Map<String, Object>> Lower() {
        List<Map<String,Object>> list=inventoryDao.selectLower();
        return list;
    }
}
