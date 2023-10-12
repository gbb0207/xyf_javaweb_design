package com.xyf.demo.bean;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class Teacher {

    @Size(min=1,max = 100,message = "教师ID长度必须在[1,100]")
    private String teaId;

    @Size(min=1,max = 10,message = "名字长度必须在1-10之间")
    private String teaName;

    private String teaPass;

    private String teaSex;

    @Size(min = 11,max = 11,message = "请输入11位手机号码")
    private String teaTele;

}
