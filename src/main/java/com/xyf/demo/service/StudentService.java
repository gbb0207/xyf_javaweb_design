package com.xyf.demo.service;

import com.xyf.demo.bean.Student;

import java.util.List;

public interface StudentService {
    Student login(String stuId, String stuPass);

    List<Student> getAllStudent();

    int addStudent(Student student);

    int addStudentHavePass(Student student);

    Student selectById(String stuId);

    int deleStu(String stuId);

    List<Student> seleStuByClassName(String stuClass);
}
