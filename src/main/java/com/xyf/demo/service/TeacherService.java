package com.xyf.demo.service;

import com.xyf.demo.bean.Teacher;

import java.util.List;

public interface TeacherService {

    Teacher login(String teaId, String teaPass);

    List<Teacher> getAllTeacher();

    int addTeacher(Teacher teacher);

    int addTeacherHavePass(Teacher teacher);

    Teacher selectById(String teaId);

    int deleTea(String teaId);
}
