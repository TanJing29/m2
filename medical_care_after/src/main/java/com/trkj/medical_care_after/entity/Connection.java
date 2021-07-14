package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * connection
 * @author 
 */
@Data
public class Connection implements Serializable {
    /**
     * 客户id
     */
    private Integer conId;

    /**
     * 客户编码
     */
    private String connectionId;

    /**
     * 客户名称
     */
    private String connectionName;

    /**
     * 联系人
     */
    private String liaisonman;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 增加人
     */
    private String addname;

    /**
     * 增加时间
     */
    private Date addtime;

    /**
     * 最后修改人
     */
    private String updatename;

    /**
     * 最后修改时间
     */
    private Date updatetime;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
    private Date deletetime;

    /**
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}