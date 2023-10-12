package com.xyf.demo.service;

import com.xyf.demo.bean.Classes;

import java.util.List;

public interface ClassService {

    List<Classes> getAllClass();

    Classes selectById(String classId);

    Classes selectByName(String className);

    int deleteById(String classId);

    int addClass(Classes classes);


}
