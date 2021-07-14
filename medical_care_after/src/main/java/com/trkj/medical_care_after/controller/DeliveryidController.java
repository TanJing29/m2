package com.trkj.medical_care_after.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.medical_care_after.entity.Deliveryid;
import com.trkj.medical_care_after.entity.Shop;

import com.trkj.medical_care_after.service.ConnectionService;
import com.trkj.medical_care_after.service.DeliveryidService;
import com.trkj.medical_care_after.service.SaleService;
import com.trkj.medical_care_after.service.ShopService;
import com.trkj.medical_care_after.vo.AjaxResponse;
import com.trkj.medical_care_after.vo.ConnectionVo;
import com.trkj.medical_care_after.vo.DeliverVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class DeliveryidController {
    @Autowired
    private DeliveryidService deliveryidService;
    @Autowired
    private ShopService shopService;
    @Autowired
    private ConnectionService connectionService;
    @Autowired
    private SaleService saleService;
    @GetMapping("/findAllDelverid")
    public PageInfo<Deliveryid> findAllDelverid(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pagesize, @RequestParam("index")String index, @RequestParam("value")String value){
        log.debug("开始分页查询");
        PageHelper.startPage(currentPage,pagesize);
        List<Deliveryid> deliveryids= deliveryidService.findAllDeliver(index,value);
        PageInfo<Deliveryid> deliveryidPageInfo=new PageInfo<>(deliveryids);
        return deliveryidPageInfo;
    }
    @GetMapping("/findtj")
    public PageInfo<DeliverVo> findtj( @RequestParam("pagesize")int pagesize, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("date1") Date date1,@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("date2")Date date2){
        log.debug("开始分统计页查询");

        PageHelper.startPage(1,pagesize);
//        log.debug(date1+":::"+date2+"::"+currentPage);
        List<DeliverVo> deliveryids= deliveryidService.findtj(date1,date2);
        PageInfo<DeliverVo> deliveryidPageInfo=new PageInfo<>(deliveryids);
        return deliveryidPageInfo;
    }
    @PostMapping("/AddDelverid")
    public AjaxResponse AddDelverid(@RequestBody Deliveryid deliveryid){
        log.debug("开始添加");
        return AjaxResponse.success(deliveryidService.AddDeliveryid(deliveryid));
    }
    @DeleteMapping("/delDelverid/{id}/{state}/{said}")
    public AjaxResponse delDelverid(@PathVariable("id")int id,@PathVariable("state")int state,@PathVariable("said")int said){
        log.debug("删除");
        if(state==0){
            saleService.uapdateSale2(said,0);
            return AjaxResponse.success(deliveryidService.delDeliveryid(id));
        }else{
            return AjaxResponse.success(0);
        }

    }
    @PutMapping("/updateDelverid")
    public AjaxResponse updateDelverid(@RequestBody Deliveryid deliveryid){
        log.debug("开始修改");
        return AjaxResponse.success(deliveryidService.UpdateDeliveryid(deliveryid));
    }
    @GetMapping("/findShopAll")
    public List<Shop> findShopAll(){
        log.debug("开始查询商品");
        return shopService.findAllShop();
    }

    @GetMapping("/findConnAll")
    public List<ConnectionVo> findConnAll(){
        log.debug("开始客户商品");
        return connectionService.selConnection();
    }
    @GetMapping("/findDelieryAll")
    public List<Deliveryid> findDelieryAll(){
        log.debug("开始");
        return deliveryidService.selectID();
    }
    @PutMapping("/chuku/{id}/{state}")
    public AjaxResponse chuku(@PathVariable("id")int id,@PathVariable("state")int state ){
        if(state==0){
            return AjaxResponse.success(deliveryidService.UpdateDeliveryid2(id,1));
        }else{
            return AjaxResponse.success(0);
        }
    }

}
