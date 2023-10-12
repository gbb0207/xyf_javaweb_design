package com.xyf.demo.mapper;

import com.xyf.demo.bean.Subject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SubjectMapper {

    @Select("select * from subject")
    List<Subject> getAllSubject();
}
