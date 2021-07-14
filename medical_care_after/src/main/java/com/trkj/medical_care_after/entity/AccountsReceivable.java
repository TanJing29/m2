package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * accounts_receivable
 * @author 
 */
@Data
public class AccountsReceivable implements Serializable {
    /**
     * 登记id
     */
    private Integer arId;

    /**
     * 收款日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date arStime;

    /**
     * 客户名称
     */
    private String connectionName;

    /**
     * 客户编号
     */
    private Integer conId;

    /**
     * 欠款金额
     */
    private BigDecimal arOwe;

    /**
     * 收款金额
     */
    private BigDecimal arPayment;

    /**
     * 还欠金额
     */
    private BigDecimal arOwes;

    /**
     * 经办人
     */
    private String arAgent;

    /**
     * 备注
     */
    private String arRemarks;

    /**
     * 操作者
     */
    private String arOperator;

    private static final long serialVersionUID = 1L;
}