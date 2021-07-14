package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * emp
 * @author 
 */
@Data
public class Emp implements Serializable {
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
    private Zhiwei zhiwei;
    private Integer zwid;

    private static final long serialVersionUID = 1L;
}