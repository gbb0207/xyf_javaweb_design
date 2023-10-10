package com.lc.demo.bean;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class Classes {

    @Size(min=6,max = 6,message = "班级号长度必须为6")
    private String classId;

    private String className;

}
