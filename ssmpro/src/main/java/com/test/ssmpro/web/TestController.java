package com.test.ssmpro.web;

import com.test.ssmpro.entity.UserDataEntity;
import com.test.ssmpro.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by win 10 on 2017/9/25.
 */
@Controller
@RequestMapping(value = "test")
public class TestController {

    @Autowired
    TestService mTestService;

    @RequestMapping(value = {"list", ""})
    public void create(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<UserDataEntity> list = mTestService.selectUser();
        if (list != null && !list.isEmpty()) {
            response.getWriter().write(list.toString());
        }
    }
}
