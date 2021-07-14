package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * deliveryid
 * @author 
 */
@Data
public class Deliveryid implements Serializable {
    /**
     * 出库登记主键
     */
    private Integer did;

    /**
     * 商品主键
     */
    private Integer sid;

    /**
     * 客户主键
     */
    private Integer conId;

    /**
     * 销售表主键
     */
    private Integer said;

    /**
     * 出库单号
     */
    private String deliveryOrderNo;

    /**
     * 单价
     */
    private Long price;

    /**
     * 数量
     */
    private Integer quantity;

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

    /**
     * 出库状态
     */
    private Integer state;

    /**
     * 出库时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ddate;

    /**
     * 备注
     */
    private String remarks;

    private int said2;

    private Shop shop;
    private Sale sale;
    private Connection connection;

    private static final long serialVersionUID = 1L;
}