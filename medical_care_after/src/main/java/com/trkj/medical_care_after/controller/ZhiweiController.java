package com.trkj.medical_care_after.controller;

import com.trkj.medical_care_after.service.ZhiweiService;
import com.trkj.medical_care_after.vo.ZhiweiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-13 10:55
 * @Version 1.0
 */
@RestController
public class ZhiweiController {
    @Autowired
    private ZhiweiService zhiweiService;

    @GetMapping("/selZhiwei")
    public List<ZhiweiVo> selZhiwei(){
        return zhiweiService.selZhiwei();
    }

}
