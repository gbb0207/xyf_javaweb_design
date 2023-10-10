package com.lc.demo.bean;

import lombok.Data;

import java.util.Map;
@Data
public class Rank {

    private String stuId;

    private int rownum;

    private int stuAllres;

    private Map<String,Integer> resmap;

    private String resTerm;

    private String stuName;

}
