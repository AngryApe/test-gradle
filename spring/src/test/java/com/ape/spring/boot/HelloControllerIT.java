/**
 * Copyright (C), 杭州中恒云能源互联网技术有限公司，保留所有权利
 */
package com.ape.spring.boot;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * AngryApe created at 2017-11-23
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIT {

    @LocalServerPort
    int port;

    private URL base;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Before
    public void setUp() throws MalformedURLException {
        System.out.println(port);
        this.base = new URL("http://localhost:" + port + "/");
        System.out.println(base);
    }

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> responseEntity = testRestTemplate
                .getForEntity(base.toString(), String.class);
        Assert.assertThat(responseEntity.getBody(), Matchers.equalTo("Hello."));
    }

}
