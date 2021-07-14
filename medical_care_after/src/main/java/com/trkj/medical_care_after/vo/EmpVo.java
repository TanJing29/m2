package com.trkj.medical_care_after.vo;

import java.io.Serializable;
import lombok.Data;

/**
 * emp
 * @author 
 */
@Data
public class EmpVo{
    /**
     * 员工id
     */
    private Integer empid;

    /**
     * 员工名称
     */
    private String empname;

    /**
     * 职位ID
     */
    private ZhiweiVo zhiweiVo;
    private Integer zwid;

    private static final long serialVersionUID = 1L;
}