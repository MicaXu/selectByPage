package com.mica.mapper;

import com.mica.domain.Student;

import java.util.List;

/**
 * Created by dllo on 18/2/1.
 */
public interface StudentMapper {

    int getTotalRecord(Student student);

    List<Student> selectAll(Student student);
}
