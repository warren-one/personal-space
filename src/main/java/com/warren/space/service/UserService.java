package com.warren.space.service;

import com.warren.space.model.User;

import java.util.List;

/**
 * @Description: TODO
 * @ClassName UserService
 * @Author hzh
 * @Date 2018/7/26
 */
public interface UserService {

    List<User> selectAllUser(String pageSize, String pageNum);
}
