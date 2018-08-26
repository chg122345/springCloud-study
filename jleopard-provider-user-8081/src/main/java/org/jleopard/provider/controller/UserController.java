package org.jleopard.provider.controller;

import org.jleopard.common.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-26  上午10:10
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get")
    public User get(){
        User user = new User(2L,"jleopard","10086");
        return user;
    }

    @GetMapping("/list")
    public User list(){
        User user = new User(22L,"戳错了","110");
        return user;
    }
}
