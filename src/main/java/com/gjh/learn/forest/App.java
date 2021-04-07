package com.gjh.learn.forest;

import com.dtflys.forest.springboot.annotation.ForestScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * created on 2021/4/7
 *
 * @author kevinlights
 */
@SpringBootApplication
@ForestScan(basePackages = "com.gjh.learn.forest.httpinterfaces")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
