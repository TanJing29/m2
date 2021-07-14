package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * shop
 * @author 
 */
@Data
public class Shop implements Serializable {
    /**
     * 商品主键
     */
    private Integer sid;

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

    /**
     * 备注
     */
    private String remarks;

    private static final long serialVersionUID = 1L;
}