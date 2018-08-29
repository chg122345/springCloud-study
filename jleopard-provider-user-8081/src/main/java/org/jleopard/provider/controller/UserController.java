package org.jleopard.provider.controller;

import org.jleopard.common.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/get")
    public User get(){
        User user = new User(2L,"jleopard","10086");
        return user;
    }

    @GetMapping("/list")
    public ModelAndView list(){
        User user = new User(22L,"list info","10010");
        return new ModelAndView("index").addObject("user",user);
    }
}
