package com.example.demo.controller;

import com.example.demo.exception.UserException;
import com.example.demo.model.*;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by xhou on 2018/8/24.
 */

@Controller
@RequestMapping(value = "/api/v1/user")
@Api("UserController相关api.")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户名密码登录接口")
    @RequestMapping(value="/login", method = RequestMethod.POST)
    @ResponseBody
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return userService.login(loginRequest.getUserName(),loginRequest.getPassword());
    }

    @ApiOperation(value = "获取项目信息")
    @RequestMapping(value="/program", method = RequestMethod.GET)
    @ResponseBody
    public ProgramResponse program(@RequestParam(value = "userId") String userId){
        return userService.getProgram(userId);
    }

    @ApiOperation(value = "获取项目图片")
    @RequestMapping(value="/program/image", method = RequestMethod.GET)
    @ResponseBody
    public ProgramImageResponse programImage(@RequestParam(value = "userId") String userId){
        return userService.getProgramImage(userId);
    }

    @ApiOperation(value = "获取个人投资信息")
    @RequestMapping(value="/program/personal", method = RequestMethod.GET)
    @ResponseBody
    public ProgramPersonalResponse programPersonal(@RequestParam(value = "userId") String userId){
        return userService.getProgramPersonal(userId);
    }

    @ApiOperation(value = "获取个人投资历史")
    @RequestMapping(value="/program/history", method = RequestMethod.GET)
    @ResponseBody
    public ProgramHistoryResponse programPersonalHistory(@RequestParam(value = "userId") String userId){
        return userService.getProgramPersonalHistory(userId);
    }

}
