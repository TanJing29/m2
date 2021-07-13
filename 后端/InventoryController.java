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
@RequestMapping("/inventory")
@Slf4j
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @DeleteMapping("/delFormation")
    public AjaxResponse delFormation(int inId){
        log.debug("开始删除数据");
        int num=inventoryService.deleteByPrimaryKey(inId);
        return AjaxResponse.success(num);
    }

    @GetMapping("/selectFormation")
    public AjaxResponse selectFormation(@RequestBody int id){
        log.debug("开始查询数据");
        List<Map<String,Object>> list=inventoryService.selectFormation(id);
        return AjaxResponse.success(list);
    }

    @GetMapping("/selectDetail")
    public AjaxResponse selectDetail(){
        log.debug("开始查询数据");
        List<Map<String,Object>> list=inventoryService.detail();
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return AjaxResponse.success(map);
    }

    @PostMapping("/addFormation")
    public AjaxResponse addFormation(){
        log.debug("插入数据");
        int count=inventoryService.addFormation();
        return AjaxResponse.success(count);
    }

    @PutMapping("/updateFormation")
    public AjaxResponse updateFormation(@RequestBody int id){
        log.debug("更新数据");
        Inventory inventory=inventoryService.updateFormation(id);
        return AjaxResponse.success(inventory);
    }

    @GetMapping("/selectUpper")
    public AjaxResponse selectUpper(){
        log.debug("开始查询超储信息");
        List<Map<String,Object>> list=inventoryService.Upper();
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return AjaxResponse.success(map);
    }

    @GetMapping("/selectLower")
    public AjaxResponse selectLower(){
        log.debug("开始查询超储信息");
        List<Map<String,Object>> list=inventoryService.Lower();
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return AjaxResponse.success(map);
    }
}
