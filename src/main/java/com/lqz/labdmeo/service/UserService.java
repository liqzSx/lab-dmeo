package com.lqz.labdmeo.service;

import com.lqz.labdmeo.entity.Users;

/**
 * @author LiQz
 * @version 1.0
 * @date 2020/9/10 5:57 下午
 */
public interface UserService {

    /**
     * 根据用户名和密码查询用户
     * @param username
     * @param password
     * @return
     */
    Users queryUserByUsernameAndPassword(String username,String password);
}
