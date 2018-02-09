package com.mica.service.impl;

import com.mica.domain.BaseResult;
import com.mica.domain.Student;
import com.mica.mapper.StudentMapper;
import com.mica.page.PageBean;
import com.mica.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/1.
 */

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    public BaseResult<Student> selectAll(Student student, int pageIndex, int pageSize) {

        int total = studentMapper.getTotalRecord(student);
        PageBean<Student> pageBean = new PageBean<Student>(pageIndex,pageSize,total);
        student.setPageBean(pageBean);
        List<Student> students = studentMapper.selectAll(student);
        BaseResult<Student> baseResult = new BaseResult<Student>(total,students);
        return baseResult;
    }
}
