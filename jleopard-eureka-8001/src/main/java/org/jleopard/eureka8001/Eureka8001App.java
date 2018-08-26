package org.jleopard.eureka8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-26  上午8:46
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka8001App {

    public static void main(String[] args) {
        SpringApplication.run(Eureka8001App.class,args);
    }
}
