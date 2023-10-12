package com.xyf.demo.service.impl;

import com.xyf.demo.bean.Subject;
import com.xyf.demo.mapper.SubjectMapper;
import com.xyf.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    SubjectMapper subjectMapper;

    @Override
    public List<Subject> getAllSubject() {
        return subjectMapper.getAllSubject();
    }
}
