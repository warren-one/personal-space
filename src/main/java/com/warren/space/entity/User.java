package com.warren.space.entity;

import lombok.Data;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Description: 用户公共实体类  jpa
 * @ClassName User
 * @Author hzh
 * @Date 2018/7/26
 */
@Data
@Log4j
@Entity
public class User {

    //用户id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //登录账号
    private String loginCode;

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
    private Boolean isLogout;


}
