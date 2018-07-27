package com.warren.space.model;

import lombok.Data;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

/**
 * @Description: 用户公共实体类  mybatis
 * @ClassName User
 * @Author hzh
 * @Date 2018/7/26
 */
@Data
@Log4j
public class User {
    //用户id
    private Integer id;

    //登录账号
    private String logincode;

    //用户名
    private String name;

    //邮箱
    private String email;

    //手机号
    private Long phone;

    //年龄
    private Integer age;

    //性别
    private Integer sex;

    //密码
    private String password;

    //地址
    private String address;

    //是否注销
    private Boolean islogout;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogincode() {
        return logincode;
    }

    public void setLogincode(String logincode) {
        this.logincode = logincode == null ? null : logincode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Boolean getIslogout() {
        return islogout;
    }

    public void setIslogout(Boolean islogout) {
        this.islogout = islogout;
    }
}