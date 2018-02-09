package com.mica.domain;

import com.mica.page.PageBean;

/**
 * Created by dllo on 18/2/1.
 */
public class Student {

    private int stuID;
    private String loginName;
    private String loginPwd;
    private String gender;

    private PageBean<Student> pageBean;


    public Student(String loginName, String loginPwd, String gender) {
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.gender = gender;
    }

    public Student() {
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public PageBean<Student> getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean<Student> pageBean) {
        this.pageBean = pageBean;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuID=" + stuID +
                ", loginName='" + loginName + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
