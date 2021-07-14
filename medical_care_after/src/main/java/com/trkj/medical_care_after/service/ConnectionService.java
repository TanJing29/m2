package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.vo.ConnectionVo;

import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-11 19:44
 * @Version 1.0
 */
public interface ConnectionService {
    List<ConnectionVo> selConnection();
    List<ConnectionVo> selmhConnection(String connectionName);
    ConnectionVo addConnection(ConnectionVo connectionVo);
    int updConnection(ConnectionVo connectionVo);
    int delConnection(Integer conId);
}
