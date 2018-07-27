package com.warren.space.service;

import com.warren.space.entity.User;

import java.util.List;

/**
 * @Description: jpa
 * @ClassName JpaUserService
 * @Author hzh
 * @Date 2018/7/27
 */
public interface JpaUserService {

    User getUser(Integer id);

    List<User> findAllUser();
}
