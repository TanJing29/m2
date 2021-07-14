package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * sale
 * @author 
 */
@Data
public class Sale implements Serializable {
    /**
     * 销售总表主键
     */
    private Integer said;

    /**
     * 客户主键
     */
    private Integer conId;

    /**
     * 商品主键
     */
    private Integer sid;

    /**
     * 销售单号
     */
    private String salesOrderNo;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 单价
     */
    private Long price;

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
     * 销售状态
     */
    private Integer state;

    /**
     * 销售日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date saleDate;

    /**
     * 备注
     */
    private String remarks;

    private  Shop shop;

    private Connection connection;

    private static final long serialVersionUID = 1L;
}