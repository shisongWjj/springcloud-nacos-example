package com.ss.nacos.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author shisong
 * @date 2020/9/2
 */
@RestController
@RefreshScope
public class TestController {

    @Value(value = "${taaest:shisong}")
    private String value;

    @RequestMapping("/test")
    public String getValue(){
        return value;
    }
}
