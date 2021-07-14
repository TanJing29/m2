package com.trkj.medical_care_after.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * zhiwei
 * @author 
 */
@Data
public class Zhiwei implements Serializable {
    /**
     * 职位id
     */
    private Integer zwid;

    /**
     * 职位名称
     */
    private String zwname;

    private static final long serialVersionUID = 1L;
}