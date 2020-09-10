package com.lqz.labdmeo.controller;

import com.lqz.labdmeo.dto.UserLoginDTO;
import com.lqz.labdmeo.entity.Users;
import com.lqz.labdmeo.entity.base.ResponseCode;
import com.lqz.labdmeo.entity.base.Results;
import com.lqz.labdmeo.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiQz
 * @version 1.0
 * @date 2020/9/10 5:37 下午
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Results<Users> login(UserLoginDTO login) {

        if (StringUtils.isBlank(login.getUsername()) || StringUtils.isBlank(login.getPassword())) {
            return Results.failure(ResponseCode.PARAMETER_MISSING);
        }
        Users user = userService.queryUserByUsernameAndPassword(login.getUsername(), login.getPassword());

        if (user == null) {
            return Results.failure(ResponseCode.FAIL);
        }

        return Results.success(ResponseCode.SUCCESS,user);
    }
}
