package com.gjh.learn.forest.httpinterfaces;

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
class MyClientTest {

    @Autowired
    MyClient myClient;

    @Test
    void sendRequest() {
        assertEquals("foo", myClient.sendRequest("foo"));
    }

    @Test
    void testPost() {
        assertEquals("Hello, World.", myClient.simplePost());
    }

    @Test
    void quickPost() {
        assertEquals("Hello, World.", myClient.quickPost());
    }

    @Test
    void postReq() {
        assertEquals("Hello, World.", myClient.postReq());
    }
}