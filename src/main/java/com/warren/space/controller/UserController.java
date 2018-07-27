package com.warren.space.controller;


import com.warren.space.model.User;
import com.warren.space.service.UserService;


import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description: 用户
 * @ClassName TestController
 * @Author hzh
 * @Date 2018/7/26
 */
@Controller
@Log4j
@RequestMapping(value = "/login")
public class UserController {

    @Autowired
    private UserService userService;



    /**
     * 查询所有用户
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findAllUser")
    public Object findAllUser(HttpServletRequest request){

        String pageSize = request.getParameter("pageSize");
        String pageNum  = request.getParameter("pageNum");
        List<User> user = new ArrayList<>();
        user = userService.selectAllUser(pageSize,pageNum);
        return user;
    }

}
