package com.trkj.medical_care_after.controller;

import com.trkj.medical_care_after.entity.AccountsReceivable;
import com.trkj.medical_care_after.service.AccoutsReceivable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 白杨
 */
@RestController
public class AccountsReceivableController {
    @Autowired
    private AccoutsReceivable accoutsReceivable;

    /**
     * 查询应收账款登记列表
     * @return
     */
    @GetMapping("/findAllaccr")
    public List<AccountsReceivable> findAllaccr(){
        return accoutsReceivable.findAll();
    }
    /**
     * 根据id、查询列表
     * */
    @PostMapping("/selectByAidr/{aid}")
    public AccountsReceivable findByid(@PathVariable("aid") int aid){
        return accoutsReceivable.findId(aid);
    }

    /**
     * 编辑列表
     * @param accountsReceivable
     */
    @PutMapping("/updateByAidr")
    public void updateById(@RequestBody AccountsReceivable accountsReceivable){
        accoutsReceivable.update(accountsReceivable);
    }
    /**
     * 增加列表
     * */
    @PostMapping("/insertAllar")
    public void insertAll(@RequestBody AccountsReceivable accountsReceivable){
        accoutsReceivable.insertAll(accountsReceivable);
    }

    /**
     * 删除列表
     * @param id
     */
    @DeleteMapping("/deletByAidr/{id}")
    public void deletById(@PathVariable(value="id")int id){
        accoutsReceivable.deletById(id);
    }

}
