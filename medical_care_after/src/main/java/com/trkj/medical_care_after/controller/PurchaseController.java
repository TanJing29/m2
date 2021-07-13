package com.trkj.medical_care_after.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.medical_care_after.entity.Purchase;
import com.trkj.medical_care_after.entity.Shop;
import com.trkj.medical_care_after.result.AjaxResponse;
import com.trkj.medical_care_after.service.PurchaseService;
import com.trkj.medical_care_after.service.ShopService;
import com.trkj.medical_care_after.service.SupplierService;
import com.trkj.medical_care_after.vo.SupplierVo;
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
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @Autowired
    private ShopService shopService;

    @Autowired
    private SupplierService supplierService;

    /**
     * 添加进货记录数据
     * 7-11 中午 测试通过
     * @param purchase
     */
    @PostMapping("/addRecords")
    public AjaxResponse addPurchaseRecords(@RequestBody Purchase purchase){
        purchase.setPuTime(new Date());
        purchaseService.insert(purchase);
        return AjaxResponse.success();
    }

    /**
     * 查询进货信息（分页显示）
     * 7-11 中午 测试通过
     * @param page
     * @param size
     * @return
     *
     */
    @GetMapping("/check")
    public AjaxResponse findPurchaseRecords(@RequestParam("page") int page, @RequestParam("size") int size){
        PageHelper.startPage(page,size);
        List<Object> purchaseList = purchaseService.select();
        PageInfo<Object> purchasePageInfo = new PageInfo<>(purchaseList);
        return AjaxResponse.success(purchasePageInfo);
    }
    @GetMapping("/check22")
    public AjaxResponse findPurchaseRecords22(){
        List<Object> purchaseList = purchaseService.select();
        return AjaxResponse.success(purchaseList);
    }

    /**
     *  根据进货单号删除
     *  7/11 下午 通过
     * @param puOrderId
     */
    @DeleteMapping("/delete/{puOrderId}")
    public AjaxResponse deleteByOrderId(@PathVariable("puOrderId") String puOrderId){
        purchaseService.deleteByOrderId(puOrderId);
        return AjaxResponse.success();
    }

    /**
     * 修改进货记录 （动态sql修改）
     * @param purchase
     * @return
     */
    @PutMapping("/update")
    public AjaxResponse updatePurchase(@RequestBody Purchase purchase){
        purchaseService.updateByPrimaryKeySelective(purchase);
        return AjaxResponse.success();
    }

    /**
     * 多条件查询
     * @param
     * @return
     */
    @GetMapping("/query")
    public AjaxResponse conditionQuery(@RequestParam ("sname") String sname,@RequestParam("suppliername")String suppliername){

        List<Purchase> purchaseList = purchaseService.conditionQuery(sname,suppliername);
        return AjaxResponse.success(purchaseList);
    }

    @GetMapping("/pufind")
    public AjaxResponse findPurchse(){
        List<Object> statisticsfind = purchaseService.statisticsfind();
        return AjaxResponse.success(statisticsfind);
    }

    /**
     * 查询商品名称
     * @return
     */
    @GetMapping("/puShopName")
    public AjaxResponse shopName(){
        List<Shop> list = shopService.findAllShop();
        return AjaxResponse.success(list);
    }
    /**
     * 查询供应商名称
     * @return
     */
    @GetMapping("/puSupplicerName")
    public AjaxResponse supplicerName(){
        List<SupplierVo> list = supplierService.selSupplier();
        return AjaxResponse.success(list);
    }
}
