package com.trkj.medical_care_after.controller;

import com.trkj.medical_care_after.entity.AccountsReceivable;
import com.trkj.medical_care_after.entity.OtherIncomeAndExpenditure;
import com.trkj.medical_care_after.service.OtherIncomeAndExpenditureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OtherIncomeAndExpenditureController {
    @Autowired
    private OtherIncomeAndExpenditureService otherIncomeAndExpenditureService;
    /**
     * 查询其他支出列表
     * @return
     */
    @GetMapping("/findAllOther")
    public List<OtherIncomeAndExpenditure> findAllaccr(){
        return otherIncomeAndExpenditureService.findAll();
    }
    /**
     * 根据id、查询列表
     * */
    @PostMapping("/selectByAidOther/{aid}")
    public OtherIncomeAndExpenditure findByid(@PathVariable("aid") int aid){
        return otherIncomeAndExpenditureService.findId(aid);
    }

    /**
     * 编辑列表
     * @param otherIncomeAndExpenditure
     */
    @PutMapping("/updateByAidOther")
    public void updateById(@RequestBody OtherIncomeAndExpenditure otherIncomeAndExpenditure){
        otherIncomeAndExpenditureService.update(otherIncomeAndExpenditure);
    }
    /**
     * 增加列表
     * */
    @PostMapping("/insertAllaOther")
    public void insertAll(@RequestBody OtherIncomeAndExpenditure otherIncomeAndExpenditure){
        otherIncomeAndExpenditureService.insertAll(otherIncomeAndExpenditure);
    }

    /**
     * 删除列表
     * @param id
     */
    @DeleteMapping("/deletByAidOther/{id}")
    public void deletById(@PathVariable(value="id")int id){
        otherIncomeAndExpenditureService.deletById(id);
    }
}
