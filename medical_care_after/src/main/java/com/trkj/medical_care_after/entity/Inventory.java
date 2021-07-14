package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * inventory
 * @author 胡诗情
 */
@Data
public class Inventory implements Serializable {
    /**
     * 库存信息id
     */
    private Integer inId;

    /**
     * 供货商名称
     */
    private String inSupplier;

    /**
     * 库存上限
     */
    private Integer inUpperlimit;

    /**
     * 库存下限
     */
    private Integer inLowerlimit;

    /**
     * 备注
     */
    private String inDescribe;

    /**
     * 原始数量
     */
    private Integer inOriginal;

    /**
     * 出库数量
     */
    private Integer inStock;

    /**
     * 报损数量
     */
    private Integer inReportedloss;

    /**
     * 销售数量
     */
    private Integer inSales;

    /**
     * 入库退货
     */
    private Integer inReceiptReturn;

    /**
     * 入库数量
     */
    private Integer inQuantity;

    /**
     * 状态（超储/正常/缺货）
     */
    private String inState;

    /**
     * 商品id
     */
    private Integer inProid;

    private Shop shop;

    private ReturnFrmloss returnFrmloss;

    private Deliveryid deliveryid;

    private Sale sale;

    private Purchase purchase;

    private Supplier supplier;

    private SalesReturn salesReturn;

    private static final long serialVersionUID = 1L;
}