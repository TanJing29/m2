package com.trkj.medical_care_after.controller;

import com.trkj.medical_care_after.service.EmpService;
import com.trkj.medical_care_after.vo.EmpVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-13 1:50
 * @Version 1.0
 */
@RestController
@Slf4j
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/selEmp")
    public List<EmpVo> selEmp(){
      return empService.selEmp();
    }


}
