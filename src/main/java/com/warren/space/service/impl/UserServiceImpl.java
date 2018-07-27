package com.warren.space.service.impl;

import com.github.pagehelper.PageHelper;
import com.warren.space.mapper.UserMapper;
import com.warren.space.model.User;
import com.warren.space.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Description: 用户service
 * @ClassName UserServiceImpl
 * @Author hzh
 * @Date 2018/7/26
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    /**
     *  这个方法中用的是配置依赖的分页插件pagehelper
     *
     * @param pageSize 每页显示的数据条数
     * @param pageNum 开始页数
     * @return
     */
    @Override
    public List<User> selectAllUser(String pageSize, String pageNum) {
        /*int  size = Integer.valueOf(pageSize);
        int  number = Integer.valueOf(pageNum);*/
        //将参数传给这个方法就可以实现物理分页了
        PageHelper.startPage(1,2);
        return userMapper.selectAllUser();
    }
}
