package com.trkj.medical_care_after.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author TinkerBell
 */
@Data
public class salesReturn {
    private int sums;
    private BigDecimal amout;
    /**
     * 供货商编码
     */
    private String supplierId;

    /**
     * 供货商名称
     */
    private String suppliername;

    /**
     * 联系人
     */
    private String liaisonman;

    /**
     * 联系电话
     */
    private String suphone;
}
