package com.mica.controller;

import com.mica.domain.BaseResult;
import com.mica.domain.Student;
import com.mica.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by dllo on 18/2/1.
 */
@Controller
public class MainController {

    @Resource
    private StudentService studentService;

    @RequestMapping(value = {"","/"})
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/selectAll")
    @ResponseBody
    public BaseResult<Student> selectAll(Student student,
                                         int pageIndex,
                                         int pageSize){

        BaseResult<Student> baseResult = studentService.selectAll(student,pageIndex+1,pageSize);
        return baseResult;
    }
}
