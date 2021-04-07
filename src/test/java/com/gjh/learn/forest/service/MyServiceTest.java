package com.gjh.learn.forest.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * created on 2021/4/7
 *
 * @author kevinlights
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class MyServiceTest {

    @Autowired
    MyService myService;

    @Test
    void testClient() {
        assertEquals("Hello, World.", myService.testClient());
    }
}