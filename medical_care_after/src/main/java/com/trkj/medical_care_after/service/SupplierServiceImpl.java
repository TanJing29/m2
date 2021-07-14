package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.SupplierDao;
import com.trkj.medical_care_after.util.BeanCopyUtil;
import com.trkj.medical_care_after.vo.SupplierVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-11 16:16
 * @Version 1.0
 */
@Service
@Slf4j
public class SupplierServiceImpl implements SupplierService {
    @Resource
    private SupplierDao supplierDao;

    @Override
    public List<SupplierVo> selSupplier() {
        return supplierDao.selSupplier();
    }

    @Override
    public List<SupplierVo> selmhSupplier(String suppliername) {
        return supplierDao.selmhSupplier(suppliername);
    }

    @Override
    public SupplierVo addSupplier(SupplierVo supplierVo) {
        SupplierVo supplierVo1=new SupplierVo();
        BeanCopyUtil.copyProperties(supplierVo,supplierVo1);
        String suppli="GHS";
        DateFormat dateFormat=new SimpleDateFormat("hhmmss");//时间的精确值
        String supp=suppli+dateFormat.format(new Date())+supplierVo1.toString().length();
        supplierVo1.setSupplierId(supp);
        supplierDao.insertSelective(supplierVo1);
        return supplierVo1;

    }


    @Override
    public int updSupplier(SupplierVo supplierVo) {
        SupplierVo sup=new SupplierVo();
        BeanCopyUtil.copyProperties(supplierVo,sup);//赋值
        sup.setUpdatetime(new Date());
        return  supplierDao.updateByPrimaryKeySelective(sup);
    }

    @Override
    public int delSupplier(Integer suppId) {
        SupplierVo supplierVo1=new SupplierVo();
        supplierVo1.setSuppId(suppId);
        supplierVo1.setDeletetime(new Date());
        supplierVo1.setTimeliness(1);//时效性修改为1
        return supplierDao.updateByPrimaryKeySelective(supplierVo1);
    }
}
