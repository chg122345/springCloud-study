package org.jleopard.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-28  上午11:05
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
@SpringCloudApplication
@RestController
public class Auth8881App {
    public static void main(String[] args) {
        SpringApplication.run(Auth8881App.class,args);
    }

    @GetMapping("/oauth/user")
    public Principal getUser(Principal principal){
        return principal;
    }

    @GetMapping("/oauth/key")
    public String getKey(){
        return "jleopard";
    }
}
