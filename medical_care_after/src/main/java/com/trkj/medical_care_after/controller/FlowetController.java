package com.trkj.medical_care_after.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.medical_care_after.service.FlowetService;
import com.trkj.medical_care_after.vo.AjaxResponse;
import com.trkj.medical_care_after.vo.FlowetVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-12 21:16
 * @Version 1.0
 */
@RestController
@Slf4j
public class FlowetController {
    @Autowired
    private FlowetService flowetService;

    @GetMapping("/selAllFlowet")
    public PageInfo<FlowetVo> selAllFlowet(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<FlowetVo> flowetVoList=flowetService.selAllFlowet();
        PageInfo<FlowetVo> flowetVoPageInfo=new PageInfo<>(flowetVoList);
        return flowetVoPageInfo;
    }



    @GetMapping("/selstatus")
    public List<FlowetVo> selstatus(){
        return flowetService.selstatus();
    }
    @GetMapping("/selstatus1")
    public List<FlowetVo> selstatus1(){
        return flowetService.selstatus1();
    }
    @PostMapping("/addFlowet")
    public AjaxResponse addFlowet(@RequestBody @Valid FlowetVo flowetVo){
        flowetService.addFlowet(flowetVo);
        return AjaxResponse.success("新增成功");
    }

    @PutMapping("/updstatus")
    public AjaxResponse updstatus(@RequestBody @Valid FlowetVo flowetVo){
        flowetService.updstatus(flowetVo);
        return AjaxResponse.success("修改成功");
    }

    @PutMapping("/updstatus1")
    public AjaxResponse updstatus1(@RequestBody @Valid FlowetVo flowetVo){
        flowetService.updstatus1(flowetVo);
        return AjaxResponse.success("修改成功");
    }



}
