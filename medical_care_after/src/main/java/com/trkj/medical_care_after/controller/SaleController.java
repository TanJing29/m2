package com.trkj.medical_care_after.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.medical_care_after.entity.Sale;
import com.trkj.medical_care_after.service.SaleService;
import com.trkj.medical_care_after.vo.AjaxResponse;
import com.trkj.medical_care_after.vo.SaleVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class SaleController {
    @Autowired
    private SaleService saleService;
    @GetMapping("/findPageSale")
    public AjaxResponse findPageSale(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pagesize, @RequestParam("index")String index, @RequestParam("value")String value){
        log.debug("分页");
        log.debug(currentPage+"::"+pagesize);
        PageHelper.startPage(currentPage,pagesize);
        List<Sale> deliveryids= saleService.findPageSale(index,value);
        PageInfo<Sale> salePageInfo=new PageInfo<>(deliveryids);
        return AjaxResponse.success(salePageInfo);
    }
    @GetMapping("/findSaletj")
    public AjaxResponse findSaletj(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pagesize, @RequestParam("index")String index){
        log.debug("统计分页");
        log.debug(currentPage+"::"+pagesize);
        PageHelper.startPage(currentPage,pagesize);
        List<SaleVo> saletj= saleService.Saletj(index);
        PageInfo<SaleVo> salePageInfo=new PageInfo<>(saletj);
        return AjaxResponse.success(salePageInfo);
    }

    @GetMapping("/findSaleAll")
    public List<Sale> findSaleAll(){
        log.debug("开始查询");
        return saleService.findALlSale();
    }

    @PostMapping("/AddSale")
    public AjaxResponse AddSale(@RequestBody Sale sale){
        log.debug("开始新增");
        sale.setSaleDate(new Date());
        return AjaxResponse.success(saleService.AddSale(sale));
    }
    @PutMapping("/updateSale")
    public AjaxResponse updateSale(Sale sale){
        log.debug("开始修改");
        return AjaxResponse.success(saleService.uapdateSale(sale));
    }
    @PutMapping("/xiaoshou/{id}/{state}")
    public AjaxResponse xiaoshou(@PathVariable("id") int id,@PathVariable("state") int state){
        if(state==0){
            return AjaxResponse.success(saleService.uapdateSale2(id,1));
        }else{
            return AjaxResponse.success(0);
        }
    }
    @DeleteMapping("/delSale/{id}/{state}")
    public AjaxResponse delSale(@PathVariable("id") int id,@PathVariable("state") int state){
        log.debug("开始删除");
        if(state==0){
            return AjaxResponse.success(saleService.delSale(id));
        }else{
            return AjaxResponse.success(0);
        }

    }
}
