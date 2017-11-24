/**
 * Copyright (C), 杭州中恒云能源互联网技术有限公司，保留所有权利
 */
package com.ape.spring.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AngryApe created at 2017-11-23
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello.";
    }
}
