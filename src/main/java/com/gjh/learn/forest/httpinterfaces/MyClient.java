package com.gjh.learn.forest.httpinterfaces;

import com.dtflys.forest.annotation.*;

/**
 * created on 2021/4/7
 *
 * @author kevinlights
 */
public interface MyClient {

    String base = "http://127.0.0.1:8080/hello";

    @Request(url = base)
    String helloForest();

    @Request(
            url = base,
            type = "POST"
    )
    String simplePost();

    @Post(base)
    String quickPost();

    @PostRequest(base)
    String postReq();

    @Request(
            url = base + "/user",
            headers = "Accept: text/plain"
    )
    String sendRequest(@Query("uname") String uname);
}
