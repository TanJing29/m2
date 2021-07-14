package com.trkj.medical_care_after.vo;

import lombok.Data;

@Data
public class SaleVo {
    /**
     * 客户名称
     */
    private String connectionName;

    /**
     * 商品名称
     */
    private String sname;

    /**
     * 商品编码
     */
    private String shopNumber;

    /**
     * 单价
     */
    private Long price;

    /**
     * 数量
     */
    private int quantity;

    /**
     * 单位
     */
    private String company;

    /**
     * 应收金额
     */
    private Long amountReceivable;

    /**
     * 实收金额
     */
    private Long actualMoney;

    /**
     * 欠收金额
     */
    private Long oweMoney;
}
