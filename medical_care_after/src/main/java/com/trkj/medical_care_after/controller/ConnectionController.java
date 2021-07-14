package com.trkj.medical_care_after.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.medical_care_after.service.ConnectionService;
import com.trkj.medical_care_after.vo.AjaxResponse;
import com.trkj.medical_care_after.vo.ConnectionVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-11 19:47
 * @Version 1.0
 */
@RestController
@Slf4j
public class ConnectionController {
    @Autowired
    private ConnectionService connectionService;

    /*外键调用此方法*/
    @GetMapping("/selConnection")
    public List<ConnectionVo> selConnection(){
      return connectionService.selConnection();
    }

    /*分页模糊查询*/
    @GetMapping("/selmhConnection")
    public PageInfo<ConnectionVo> selmhConnection(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize,@RequestParam("connectionName") String connectionName){
        PageHelper.startPage(currentPage,pagesize);
        List<ConnectionVo> connectionVoList=connectionService.selmhConnection(connectionName);
        PageInfo<ConnectionVo> connectionVoPageInfo=new PageInfo<>(connectionVoList);
        return connectionVoPageInfo;

    }


    @PostMapping("/addConnection")
    public AjaxResponse addConnection(@RequestBody @Valid ConnectionVo connectionVo){
        connectionService.addConnection(connectionVo);
        return AjaxResponse.success("新增成功");
    }

    @PutMapping("/updConnection")
    public AjaxResponse updConnection(@RequestBody @Valid ConnectionVo connectionVo){
        connectionService.updConnection(connectionVo);
        return AjaxResponse.success("修改成功");
    }

    @PutMapping("/delConnection")
    public AjaxResponse delConnection(@RequestBody @Valid ConnectionVo connectionVo){
        connectionService.delConnection(connectionVo.getConId());
        return AjaxResponse.success("删除成功");
    }



}
