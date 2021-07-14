package com.trkj.medical_care_after.dao;

import com.trkj.medical_care_after.entity.Deliveryid;
import com.trkj.medical_care_after.vo.DeliverVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
@Mapper
public interface DeliveryidDao {
    //删除
    int deleteByPrimaryKey(Integer did);

    int insert(Deliveryid record);
    //新增出库记录
    int insertSelective(Deliveryid record);

    List<Deliveryid> selectByPrimaryKey();
    //修改出库登记
    int updateByPrimaryKeySelective(Deliveryid record);

    int updateByPrimaryKey(@Param("did") int id,@Param("state") int state);
    //查询所有的或条件查询
    List<Deliveryid> findAllDeliver(@Param("index") String index , @Param("value") String value);

    List<DeliverVo>findtj(@Param("date1") Date date1 , @Param("date2") Date date2);

}