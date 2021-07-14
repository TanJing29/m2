package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * flowet
 * @author 
 */
@Data
public class Flowet implements Serializable {
    /**
     * 流程id
     */
    private Integer fid;

    /**
     * 流程类型
     */
    private String flowname;

    /**
     * 申请人
     */
    private String applyfor;

    /**
     * 当前节点审批人
     */
    private String beforpanel;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 申请流程时间
     */
    private Date initiatetime;

    /**
     * 结束流程时间
     */
    private Date finishtime;

    /**
     * 请假结束时间
     */
    private Date jsdata;

    /**
     * 请假开始时间
     */
    private Date kstime;

    /**
     * 请假时长
     */
    private Integer qjsc;

    /**
     * 请假理由
     */
    private String sqqq;

    /**
     * 报销金额
     */
    private Long bxmoney;

    /**
     * 员工id
     */
    private Emp emp;
    private Integer empid;

    private static final long serialVersionUID = 1L;
}