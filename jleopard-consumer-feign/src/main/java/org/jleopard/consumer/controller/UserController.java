package org.jleopard.consumer.controller;

import org.jleopard.common.User;
import org.jleopard.common.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-26  上午10:20
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
@RestController
@RequestMapping("/consumer")
public class UserController {

    @Autowired
    private UserClientService userClientService;

    @GetMapping("/get")
    public User get(){
        return userClientService.get();
    }

    @GetMapping("/list")
    public User list(){
        return userClientService.list();
    }
}
