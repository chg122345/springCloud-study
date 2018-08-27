package org.jleopard.common.service;

import org.jleopard.common.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-26  上午10:00
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
@FeignClient(value = "USER-SERVICE",fallbackFactory = UserClientServiceFallbackFactory.class)
public interface UserClientService {

    @GetMapping("/user/get")
    User get();

    @GetMapping("/user/list")
    String list();
}
