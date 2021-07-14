package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.ConnectionDao;
import com.trkj.medical_care_after.entity.Connection;
import com.trkj.medical_care_after.util.BeanCopyUtil;
import com.trkj.medical_care_after.vo.ConnectionVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-11 19:45
 * @Version 1.0
 */
@Service
@Slf4j
public class ConnectionServiceImpl implements ConnectionService {
    @Resource
    private ConnectionDao connectionDao;

    @Override
    public List<ConnectionVo> selConnection() {
        return connectionDao.selConnection();
    }

    @Override
    public List<ConnectionVo> selmhConnection(String connectionName) {
        return connectionDao.selmhConnection(connectionName);
    }

    @Override
    public ConnectionVo addConnection(ConnectionVo connectionVo) {
        ConnectionVo connection=new ConnectionVo();
        BeanCopyUtil.copyProperties(connectionVo,connection);
        String con="KH";
        DateFormat dateFormat=new SimpleDateFormat("hhmmss");//时间的精确值
        String connectionId=con+dateFormat.format(new Date())+connection.toString().length();
        connection.setConnectionId(connectionId);
        connectionDao.insertSelective(connection);
        return connection;
    }

    @Override
    public int updConnection(ConnectionVo connectionVo) {
        ConnectionVo con=new ConnectionVo();
        BeanCopyUtil.copyProperties(connectionVo,con);
        con.setUpdatetime(new Date());
        return connectionDao.updateByPrimaryKeySelective(con);
    }

    @Override
    public int delConnection(Integer conId) {
        ConnectionVo con=new ConnectionVo();
        con.setConId(conId);
        con.setDeletetime(new Date());
        con.setTimeliness(1);
        return connectionDao.updateByPrimaryKeySelective(con);
    }
}
