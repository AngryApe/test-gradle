/**
 * Copyright (C), 杭州中恒云能源互联网技术有限公司，保留所有权利
 */
package com.ape.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * AngryApe created at 2017-11-23
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return args -> {
            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beans = context.getBeanDefinitionNames();
            Arrays.sort(beans);
            for (String bean : beans) {
                System.out.println(bean);
            }
        };
    }

}
