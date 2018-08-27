package org.jleopard.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-27  下午3:45
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigYml8080App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigYml8080App.class,args);
    }
}
