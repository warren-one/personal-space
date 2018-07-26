package com.warren.space.entity;

import lombok.Data;
import lombok.extern.log4j.Log4j;

/**
 * @Description: 用户公共实体类
 * @ClassName User
 * @Author hzh
 * @Date 2018/7/26
 */
@Data
@Log4j
public class User {

    //用户id
    private int id;

    //登录账号
    private String loginCode;

    //用户名
    private String name;

    //邮箱
    private String email;

    //手机号
    private int phone;

    //年龄
    private int age;

    //性别
    private int sex;

    //密码
    private String password;

    //地址
    private String address;

    //是否注销
    private Boolean isLogout;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getLogout() {
        return isLogout;
    }

    public void setLogout(Boolean logout) {
        isLogout = logout;
    }
}
