package com.xyf.demo.bean;


import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class Student {

    @Size(min=12,max = 12,message = "学号长度必须为14")
    private String stuId;

    @Size(min=1,max = 10,message = "名字长度必须在1-10之间")
    private String stuName;

    private String stuPass;

    private String stuClass;

    private String stuSex;

    @Size(min = 11,max = 11,message = "请输入11位手机号码")
    private String stuTele;

}
