package com.xkcoding.webservice.cxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动器
 * @package: com.xkcoding.webservice
 * @description: 启动器
 * @author: mango.mei
 * @date: Created in 2020-10-16 14:24
 */
@SpringBootApplication
public class SpringBootDemoWebServiceCxfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoWebServiceCxfApplication.class, args);
    }

}

