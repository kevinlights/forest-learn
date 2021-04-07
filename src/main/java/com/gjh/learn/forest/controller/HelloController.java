package com.gjh.learn.forest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created on 2021/4/7
 *
 * @author kevinlights
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello, World.";
    }

    @PostMapping("hello")
    public String post() {
        return "Hello, World.";
    }

    @GetMapping("hello/user")
    public String hello(@RequestParam("uname") String uname) {
        return uname;
    }
}
