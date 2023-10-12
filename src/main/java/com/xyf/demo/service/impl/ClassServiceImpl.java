package com.xyf.demo.service.impl;

import com.xyf.demo.bean.Classes;
import com.xyf.demo.mapper.ClassMapper;
import com.xyf.demo.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {


    @Autowired
    private ClassMapper classMapper;

    @Override
    public List<Classes> getAllClass() {
        return classMapper.selectAllClass();
    }

    @Override
    public Classes selectById(String classId) {
        return classMapper.selectClassById(classId);
    }

    @Override
    public int deleteById(String classId) {
        return classMapper.deleteClassById(classId);
    }

    @Override
    public int addClass(Classes classes) {
        return classMapper.insertClass(classes);
    }

    @Override
    public Classes selectByName(String className) {
        return classMapper.selectClassByName(className);
    }
}
