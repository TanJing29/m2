package com.trkj.medical_care_after.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.medical_care_after.service.SupplierService;
import com.trkj.medical_care_after.vo.AjaxResponse;
import com.trkj.medical_care_after.vo.SupplierVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-11 16:17
 * @Version 1.0
 */
@RestController
@Slf4j
public class SupplierController {
    @Autowired/*按byType自动注入，*/
    private SupplierService supplierService;

    //外键调用此方法
    @GetMapping("/selSupplier")
    public List<SupplierVo> selSupplier(){
        return supplierService.selSupplier();
    }


    //分页查询供货商信息
    @GetMapping("/selmhSupplier")
    public PageInfo<SupplierVo> selmhSupplier(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize,@RequestParam("suppliername") String suppliername){
        log.debug("分页查询");
        PageHelper.startPage(currentPage, pagesize);//分页查出结果和条数
        List<SupplierVo> supplierVoList=supplierService.selmhSupplier(suppliername);
        PageInfo<SupplierVo> pageInfo=new PageInfo<>(supplierVoList);
        return pageInfo;

    }

    /*自定义参数校验*/
    @PostMapping("/addSupplier")
    public AjaxResponse addSupplier(@RequestBody @Valid SupplierVo supplierVo){
        supplierService.addSupplier(supplierVo);
        return AjaxResponse.success("新增成功");
    }

    @PutMapping("/updSupplier")
    public AjaxResponse updSupplier(@RequestBody @Valid SupplierVo supplierVo){
        supplierService.updSupplier(supplierVo);
        return AjaxResponse.success("修改成功");

    }

    @PutMapping("/delSupplier")
    public AjaxResponse delSupplier(@RequestBody @Valid SupplierVo supplierVo){
        supplierService.delSupplier(supplierVo.getSuppId());
        return AjaxResponse.success("删除成功");
    }


}
