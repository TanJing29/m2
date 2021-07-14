package com.trkj.medical_care_after.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.medical_care_after.entity.SalesReturn;
import com.trkj.medical_care_after.vo.AjaxResponse;
import com.trkj.medical_care_after.service.SalesReturnService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author TinkerBell
 */
@Slf4j
@CrossOrigin
@RestController
@Transactional
public class SalesReturnController {
    @Autowired
    private SalesReturnService salesReturnService;

    /**
     * 采购退货记录添加
     * @param salesReturn
     * @return
     */
    @PostMapping("/readd")
    public AjaxResponse addSalesReturn(@RequestBody SalesReturn salesReturn){
        salesReturn.setReTime(new Date());
        salesReturnService.insert(salesReturn);
        return AjaxResponse.success();
    }

    /**
     * 查询全部(分页)
     * @return
     */
    @GetMapping("/selects")
    public AjaxResponse selectSalesReturn(@RequestParam("page") int page, @RequestParam("size") int size){
        PageHelper.startPage(page,size);
        List<Object> list = salesReturnService.select();
        PageInfo<Object> salesReturnPageInfo = new PageInfo<>(list);
        return AjaxResponse.success(salesReturnPageInfo);
    }

    /**
     * 删除退货登记信息
     * @param reOrderId
     * @return
     */
    @DeleteMapping("/redelete/{reOrderId}")
    public AjaxResponse deleteById(@PathVariable("reOrderId") String reOrderId){
        salesReturnService.deleteByPrimaryKey(reOrderId);
        return AjaxResponse.success();
    }

    /**
     * 修改退货登记
     * @param salesReturn
     * @return
     */
    @PutMapping("/reupdate")
    public AjaxResponse updateSalesReturn(@RequestBody SalesReturn salesReturn){
        salesReturnService.updateByPrimaryKeySelective(salesReturn);
        return AjaxResponse.success();
    }

    @GetMapping("/refind")
    public AjaxResponse findPurchse2(){
        List<Object> statisticsfind2 = salesReturnService.statisticsfind2();
        return AjaxResponse.success(statisticsfind2);
    }
}

