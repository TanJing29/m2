package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.entity.Deliveryid;
import com.trkj.medical_care_after.vo.DeliverVo;

import java.util.Date;
import java.util.List;

public interface DeliveryidService {
    //查询所有的或条件查询
    List<Deliveryid> findAllDeliver(String index ,String value);
    //新增出库记录
    int AddDeliveryid(Deliveryid deliveryid);
    //修改出库记录
    int UpdateDeliveryid(Deliveryid deliveryid);

    //出库状态
    int UpdateDeliveryid2(int id,int state);
    //删除出库记录
    int delDeliveryid(int id);
    List<Deliveryid> selectID();

    List<DeliverVo>findtj(Date date1, Date date2);

}
