package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 退货登记实体类
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesReturn implements Serializable {
    /**
     * id
     */
    private Integer reId;

    /**
     * 退货单号
     */
    private String reOrderId;

    /**
     * 进货单号
     */
    private String puOrderId;

    /**
     * 价格
     */
    private BigDecimal rePrite;

    /**
     * 退货数量
     */
    private Integer reNumber;

    /**
     * 退货类型
     */
    private String reType;

    /**
     * 应退金额
     */
    private BigDecimal reAmoutPayable;

    /**
     * 实退金额
     */
    private BigDecimal reAmountPaid;

    /**
     * 欠退金额
     */
    private BigDecimal reAmountArear;

    /**
     * 退货时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date reTime;

    /**
     * 经办人
     */
    private String reTransactor;

    /**
     * 操作人
     */
    private String reOperator;

    /**
     * 备注
     */
    private String reNote;

    /**
     * 商品id
     */
    private Integer  suppId;

    private Shop shop;

    private Supplier supplier;

    private Purchase purchase;


    private static final long serialVersionUID = 1L;
}