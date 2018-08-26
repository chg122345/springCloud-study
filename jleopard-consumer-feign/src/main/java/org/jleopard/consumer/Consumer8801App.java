package org.jleopard.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-26  上午9:49
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "org.jleopard.common")
@ComponentScan("org.jleopard")
public class Consumer8801App {
    public static void main(String[] args) {
        SpringApplication.run(Consumer8801App.class,args);
    }
}
