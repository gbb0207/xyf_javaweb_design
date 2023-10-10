package com.lc.demo.bean;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class Resultss {

    private int resId;

    private String stuId;

    private String subName;

    @Max(value = 100,message = "成绩最大值不能超过100")
    @Min(value = 0,message = "成绩最小值不能小于0")
    private int    resNum;

    private String resTerm;

}
