package com.mica.service;

import com.mica.domain.BaseResult;
import com.mica.domain.Student;

import java.util.List;

/**
 * Created by dllo on 18/2/1.
 */
public interface StudentService {


    BaseResult<Student> selectAll(Student student, int pageIndex, int pageSize);
}
