package com.willis.controller;


import com.willis.common.Result;
import com.willis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author willis
 * @since 2020-06-03
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public Result index(){
        return Result.success(200,"请求成功",userService.getById(1));
    }

}
