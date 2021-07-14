package com.trkj.medical_care_after.controller;

import com.trkj.medical_care_after.entity.Inventory;
import com.trkj.medical_care_after.service.InventoryService;
import com.trkj.medical_care_after.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    //删除
    @DeleteMapping("/delFormation")
    public AjaxResponse delFormation(int inId){
        log.debug("开始删除数据");
        int num=inventoryService.deleteByPrimaryKey(inId);
        return AjaxResponse.success(num);
    }

    //查询详细信息
    @GetMapping("/selectDetail")
    public AjaxResponse selectDetail(){
        log.debug("开始查询详细信息");
        List<Map<String,Object>> list=inventoryService.detail();
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return AjaxResponse.success(map);
    }

    //修改数据
    @PutMapping("/updateFormation")
    public AjaxResponse updateFormation(@RequestBody int id){
        log.debug("更新数据");
        Inventory inventory=inventoryService.updateFormation(id);
        return AjaxResponse.success(inventory);
    }

    //查询超储提醒的信息
    @GetMapping("/selectUpper")
    public AjaxResponse selectUpper(){
        log.debug("开始查询超储信息");
        List<Map<String,Object>> list=inventoryService.Upper();
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return AjaxResponse.success(map);
    }

    //查询缺货提醒的信息
    @GetMapping("/selectLower")
    public AjaxResponse selectLower(){
        log.debug("开始查询缺货信息");
        List<Map<String,Object>> list=inventoryService.Lower();
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return AjaxResponse.success(map);
    }
}
