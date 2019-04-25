package com.imooc.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.imooc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Bean
 * @since 2019-03-20
 */
@Controller
@RequestMapping("/user")
public class UserController {


//    @Autowired
//    private UserService userService;
//
//    @RequestMapping("/getPageResult")
//    @ResponseBody
//    public Object getPageResult() {
////        IPage<User> pages =
//        return userService.selectUserPage(new Page<>(1, 10), 1);
//    }

}

