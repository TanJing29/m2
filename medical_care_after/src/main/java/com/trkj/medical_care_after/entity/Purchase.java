package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 进货登记实体类
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Purchase implements Serializable {
    /**
     * ID
     */
    private Integer puId;

    /**
     * 进货单号
     */
    private String puOrderId;

    /**
     * 进价
     */
    private BigDecimal puPrice;

    /**
     * 计量单位
     */
    private String puUnit;

    /**
     * 数量
     */
    private Integer puNumber;

    /**
     * 应付金额
     */
    private BigDecimal puAmoutPayable;

    /**
     * 实付金额
     */
    private BigDecimal puAmountPaid;

    /**
     * 欠款金额
     */
    private BigDecimal puAmoutArear;

    /**
     * 进货时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date puTime;

    /**
     * 入库状态 0：未入库，1：入库
     */
    private Integer puInStatus;

    /**
     * 经办人
     */
    private String puTransactor;

    /**
     * 操作人
     */
    private String puOperator;

    /**
     * 备注
     */
    private String puNote;

    /**
     * 商品id
     */
    private Integer sid;

    /**
     * 供货商id
     */
    private Integer suppId;

    private Shop shop;

    private Supplier supplier;

    private static final long serialVersionUID = 1L;
}