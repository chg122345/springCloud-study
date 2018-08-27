package org.jleopard.common.service.impl;

import org.jleopard.common.User;
import org.jleopard.common.service.UserClientService;
import org.springframework.stereotype.Component;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-26  下午4:29
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
//@Component
public class UserClientServiceImpl implements UserClientService {
    @Override
    public User get() {
        return new User(21L,"error get","110");
    }

    @Override
    public String list() {
        return new User(22L,"error list","110").toString();
    }
}
