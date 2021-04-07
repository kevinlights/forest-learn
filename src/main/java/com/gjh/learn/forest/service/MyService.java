package com.gjh.learn.forest.service;

import com.gjh.learn.forest.httpinterfaces.MyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * created on 2021/4/7
 *
 * @author kevinlights
 */
@Component
public class MyService {
    @Autowired
    private MyClient myClient;

    public String testClient() {
        String result = myClient.helloForest();
        System.out.println(result);
        return result;
    }

}
