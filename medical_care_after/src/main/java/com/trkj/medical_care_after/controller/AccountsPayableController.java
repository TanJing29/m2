package com.trkj.medical_care_after.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.medical_care_after.entity.AccountsPayable;
import com.trkj.medical_care_after.service.AccoutsPayableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 白杨
 */
@RestController
public class AccountsPayableController {
    @Autowired
    private AccoutsPayableService accoutsPayableService;

    /**
     * 查询应收账款登记列表
     */
    @GetMapping("/findAllaccp")
    public List<AccountsPayable> findAllaccp(){
        return accoutsPayableService.findAll();
    }

    /**
     * 根据id、查询列表
     * */
    @PostMapping("/selectByAid/{aid}")
    public AccountsPayable findByid(@PathVariable("aid") int aid){
        return accoutsPayableService.findId(aid);
    }

    /**
     * 编辑列表
     * @param accountsPayable
     */
    @PutMapping("/updateByAid")
    public void updateById(@RequestBody AccountsPayable accountsPayable){
        accoutsPayableService.update(accountsPayable);
    }
    /**
     * 增加列表
     * */
    @PostMapping("/insertAlla")
    public void insertAll(@RequestBody AccountsPayable accountsPayable){
        accoutsPayableService.insertAll(accountsPayable);
    }

    /**
     * 删除列表
     * @param id
     */
    @DeleteMapping("/deletByAid/{id}")
    public void deletById(@PathVariable(value="id")int id){
        accoutsPayableService.deletById(id);
    }
    /**
     * 模糊查询
     */
    @PostMapping("/findLikeAccp/{suppliername}")
    public PageInfo<AccountsPayable> selmhConnection(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam("connectionName") String suppliername){
        PageHelper.startPage(currentPage,pagesize);
        List<AccountsPayable> connectionVoList=accoutsPayableService.findAllLike(suppliername);
        PageInfo<AccountsPayable> connectionVoPageInfo=new PageInfo<>(connectionVoList);
        return connectionVoPageInfo;

    }
    @PostMapping("/findLikeAccps/{suppliername}")
    public List<AccountsPayable> findLike(@PathVariable("suppliername") String suppliername){
        System.out.println(suppliername);
        return accoutsPayableService.findAllLikes(suppliername);
    }

    /**
     * 分页查询
     * @return
     */
    @GetMapping("/findPgeAllaccp")
    public PageInfo<AccountsPayable> findPgeAllaccp(@RequestParam("page")int page, @RequestParam("size")int size){
        PageHelper.startPage(page,size);
        List<AccountsPayable> listap = accoutsPayableService.findAll();
        PageInfo<AccountsPayable> pageInfo =new PageInfo<>(listap);
        return pageInfo;
    }

}
