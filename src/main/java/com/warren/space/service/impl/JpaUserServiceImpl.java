package com.warren.space.service.impl;

import com.warren.space.entity.User;
import com.warren.space.repository.UserRepository;
import com.warren.space.service.JpaUserService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: jpa
 * @ClassName JpaUserServiceImpl
 * @Author hzh
 * @Date 2018/7/27
 */
@Service
@Log4j
public class JpaUserServiceImpl implements JpaUserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User getUser(Integer id) {
        //使用的是CrudRepository 接口自带的查询
        return userRepository.findOne(id);
    }

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<User> findAllUser() {
        return (List<User>) userRepository.findAll();
    }

}
