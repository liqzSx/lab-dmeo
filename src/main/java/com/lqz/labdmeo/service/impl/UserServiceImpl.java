package com.lqz.labdmeo.service.impl;

import com.lqz.labdmeo.entity.Users;
import com.lqz.labdmeo.mapper.UsersMapper;
import com.lqz.labdmeo.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LiQz
 * @version 1.0
 * @date 2020/9/10 6:05 下午
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users queryUserByUsernameAndPassword(String username, String password) {

        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            return null;
        }

        return usersMapper.selectByUsernameAndPassword(username,password);
    }
}
