package com.warren.space.controller;


import com.warren.space.model.user.User;
import com.warren.space.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description: 用户
 * @ClassName TestController
 * @Author hzh
 * @Date 2018/7/26
 */
@Api(tags = "用户管理")
@RestController
@Log4j
@RequestMapping(value = "/login")
public class UserController {

    @Autowired
    private UserService userService;



    /**
     * 查询所有用户
     * @return
     */
    @ApiOperation(value = "查询用户列表")
    @ResponseBody
    @RequestMapping(value = "/findAllUser",method = RequestMethod.GET)
    public Object findAllUser(HttpServletRequest request){

        String pageSize = request.getParameter("pageSize");
        String pageNum  = request.getParameter("pageNum");
        List<User> user = new ArrayList<>();
        user = userService.selectAllUser(pageSize,pageNum);
        return user;
    }

}
