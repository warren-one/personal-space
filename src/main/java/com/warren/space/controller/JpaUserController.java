package com.warren.space.controller;

import com.warren.space.entity.User;
import com.warren.space.service.JpaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: jpa controller
 * @ClassName JpaUserController
 * @Author hzh
 * @Date 2018/7/27
 */
@RestController
@RequestMapping(value = "/japLogin")
public class JpaUserController {

    @Autowired
    private JpaUserService userService;

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable("id") Integer id){

        return userService.getUser(id);
    }
    /**
     * 查询所有
     */
    @RequestMapping(value = "/findAllUser")
    public List<User> findAllUser(HttpServletRequest request){
        List<User> user = new ArrayList<>();
            user=userService.findAllUser();
        return user;
    }

}
