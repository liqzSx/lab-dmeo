package com.lqz.labdmeo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户登录请求 DTO
 * @author LiQz
 * @version 1.0
 * @date 2020/9/10 5:48 下午
 */
@Data
@NoArgsConstructor
public class UserLoginDTO {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
