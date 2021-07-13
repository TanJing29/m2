package com.trkj.medical_care_after.dao;


import com.trkj.medical_care_after.entity.Purchase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
@Mapper
@Repository
public interface PurchaseDao {
    /**
     * 添加进货信息
     *
     * @param record
     * @return
     */
    void insert(Purchase record);

    /**
     * 查询进货登记信息（分页）
     *
     * @return
     */
    List<Object> select();

    /**
     * 根据进货单号删除，进货记录数
     *
     * @param puOrderId
     * @return
     */
    void deleteByOrderId(String puOrderId);

    /**
     * 进货登记修改
     *
     * @param purchase
     * @return
     */
    void updateByPrimaryKeySelective(Purchase purchase);


    /**
     * 多条件查询
     *
     * @param sname
     * @param suppliername
     * @return
     */
    List<Purchase> conditionQuery(@Param("snames") String sname, @Param("suppliername") String suppliername);

    /**
     * 采购统计
     */
    List<Object> statisticsfind();
}
