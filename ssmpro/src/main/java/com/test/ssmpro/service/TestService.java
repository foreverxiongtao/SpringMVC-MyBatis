package com.test.ssmpro.service;

import com.test.ssmpro.dao.UserMapper;
import com.test.ssmpro.entity.UserDataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by win 10 on 2017/9/25.
 */
@Service
public class TestService {

    @Autowired
    private UserMapper userMapper;

    public List<UserDataEntity> selectUser() {
        return userMapper.selectUser();
    }
}
