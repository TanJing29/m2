package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.SaleDao;
import com.trkj.medical_care_after.entity.Sale;
import com.trkj.medical_care_after.vo.SaleVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleDao saleDao;
    @Override
    public List<Sale> findALlSale() {
        return saleDao.findAllSale();
    }

    @Override
    public List<Sale> findPageSale(String index ,String value) {
        return saleDao.findPageSale(index,value);
    }

    @Override
    public int uapdateSale(Sale sale) {
        return saleDao.updateByPrimaryKeySelective(sale);
    }

    @Override
    public int uapdateSale2(int id, int state) {
        return saleDao.updateByPrimaryKey(id,state);
    }

    @Override
    public int AddSale(Sale sale) {
        return saleDao.insertSelective(sale);
    }

    @Override
    public int delSale(int said) {
        return saleDao.deleteByPrimaryKey(said);
    }

    @Override
    public List<SaleVo> Saletj(String index) {
        return saleDao.findSaletj(index);
    }
}
