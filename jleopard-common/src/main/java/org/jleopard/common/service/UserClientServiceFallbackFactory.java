package org.jleopard.common.service;

import feign.hystrix.FallbackFactory;
import org.jleopard.common.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-26  上午11:40
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
@Component
public class UserClientServiceFallbackFactory implements FallbackFactory<UserClientService> {
    @Override
    public UserClientService create(Throwable throwable) {
        return new UserClientService() {
            @Override
            public User get() {
                return new User(21L,"error get","110");
            }

            @Override
            public String list() {
                return "当前访问人数过多,请求超时...";
            }
        };
    }
}
