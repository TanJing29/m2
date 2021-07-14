package com.trkj.medical_care_after.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class statistics {
    private int sums;
    private BigDecimal amout;
    /**
     * 商品名称
     */
    private String sname;

    /**
     * 商品编码
     */
    private String shopNumber;

    /**
     * 商品价格
     */
    private Long price;

    /**
     * 单位(个)
     */
    private String company;

}
