package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.DeliveryidDao;
import com.trkj.medical_care_after.dao.SaleDao;
import com.trkj.medical_care_after.dao.ShopDao;
import com.trkj.medical_care_after.entity.Deliveryid;
import com.trkj.medical_care_after.entity.Sale;
import com.trkj.medical_care_after.entity.Shop;
import com.trkj.medical_care_after.vo.DeliverVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.util.Date;
import java.util.List;
@Service
@Slf4j
public class DeliveryidServiceImpl implements DeliveryidService {
    @Autowired
    private DeliveryidDao dao;
    @Autowired
    private SaleDao saleDao;
    @Override
    public List<Deliveryid> findAllDeliver(String index, String value) {
        return dao.findAllDeliver(index,value);
    }

    @Override
    @Transactional
    public int AddDeliveryid(Deliveryid deliveryid) {
        Sale sa=new Sale();
        sa.setSaid(deliveryid.getSaid());
        sa.setState(1);
        saleDao.updateByPrimaryKeySelective(sa);
        log.debug(sa.toString());
        return dao.insertSelective(deliveryid);
    }

    @Override
    @Transactional
    public int UpdateDeliveryid(Deliveryid deliveryid) {
        Sale sa=new Sale();
        sa.setSaid(deliveryid.getSaid());
        log.info(deliveryid.getSaid()+"---------------");
        sa.setState(1);
        saleDao.updateByPrimaryKeySelective(sa);
        sa.setSaid(deliveryid.getSaid2());
        log.info(deliveryid.getSaid2()+"---------------");
        sa.setState(0);
        saleDao.updateByPrimaryKeySelective(sa);
        return dao.updateByPrimaryKeySelective(deliveryid);
    }

    @Override
    public int UpdateDeliveryid2(int id, int state) {
        return dao.updateByPrimaryKey(id,state);
    }

    @Override
    @Transactional
    public int delDeliveryid(int id) {
        return dao.deleteByPrimaryKey(id);

    }

    @Override
    public List<Deliveryid> selectID() {
        return dao.selectByPrimaryKey();
    }
    @Override
    public List<DeliverVo> findtj(Date date1,Date date2) {
        return dao.findtj(date1,date2);
    }
}
