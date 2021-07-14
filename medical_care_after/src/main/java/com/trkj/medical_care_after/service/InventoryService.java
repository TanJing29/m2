package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.entity.Inventory;

import java.util.List;
import java.util.Map;

public interface InventoryService {
    int deleteByPrimaryKey(int inId);

    List<Map<String,Object>> detail();

    Inventory updateFormation(int id);

    List<Map<String,Object>> Upper();

    List<Map<String,Object>> Lower();
}
