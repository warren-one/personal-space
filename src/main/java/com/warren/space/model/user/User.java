package com.warren.space.model.user;

import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 登录账号
     */
    @Column(name = "loginCode")
    private String logincode;

    /**
     * 用户名
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 性别 0男 1女
     */
    private Byte sex;

    /**
     * 密码
     */
    private String password;

    /**
     * 地址
     */
    private String address;

    /**
     * 是否注销： 0否 1是
     */
    @Column(name = "isLogout")
    private Boolean islogout;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取登录账号
     *
     * @return loginCode - 登录账号
     */
    public String getLogincode() {
        return logincode;
    }

    /**
     * 设置登录账号
     *
     * @param logincode 登录账号
     */
    public void setLogincode(String logincode) {
        this.logincode = logincode == null ? null : logincode.trim();
    }

    /**
     * 获取用户名
     *
     * @return name - 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名
     *
     * @param name 用户名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * 获取性别 0男 1女
     *
     * @return sex - 性别 0男 1女
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置性别 0男 1女
     *
     * @param sex 性别 0男 1女
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取是否注销： 0否 1是
     *
     * @return isLogout - 是否注销： 0否 1是
     */
    public Boolean getIslogout() {
        return islogout;
    }

    /**
     * 设置是否注销： 0否 1是
     *
     * @param islogout 是否注销： 0否 1是
     */
    public void setIslogout(Boolean islogout) {
        this.islogout = islogout;
    }
}