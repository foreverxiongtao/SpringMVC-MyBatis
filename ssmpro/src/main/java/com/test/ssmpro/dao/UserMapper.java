package com.test.ssmpro.dao;

import com.test.ssmpro.entity.UserDataEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by win 10 on 2017/9/25.
 */
@Repository
public interface UserMapper {
    List<UserDataEntity> selectUser();
}
