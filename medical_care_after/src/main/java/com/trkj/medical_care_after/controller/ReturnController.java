package com.trkj.medical_care_after.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.medical_care_after.entity.ReturnFrmloss;
import com.trkj.medical_care_after.service.ReturnService;
import com.trkj.medical_care_after.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class ReturnController {
    @Autowired
    private ReturnService returnService;
    @GetMapping("/findPageAll")
    public PageInfo<ReturnFrmloss>findPageAll(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pagesize, @RequestParam("index")String index, @RequestParam("value")String value){
        log.debug("开始分页查询");
        PageHelper.startPage(currentPage,pagesize);
        List<ReturnFrmloss> deliveryids= returnService.findPageRet(index,value);
        PageInfo<ReturnFrmloss> returnFrmlossPageInfo=new PageInfo<>(deliveryids);
        log.debug(returnFrmlossPageInfo.toString());
        return returnFrmlossPageInfo;
    }
    @PostMapping("/AddRet")
    public int AddRet(@RequestBody ReturnFrmloss returnFrmloss){
        return returnService.AddReturn(returnFrmloss);
    }
    @PutMapping("/updateRet")
    public int updateRet(@RequestBody ReturnFrmloss returnFrmloss){
        return returnService.updateReturn(returnFrmloss);
    }
    @DeleteMapping("/delRet/{rtid}")
    public AjaxResponse delRet(int id){
        return AjaxResponse.success(returnService.DelReturn(id));
    }
}
