package com.zzq.kp.server.controllor;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author zhiqiang_zhao
 * @date 2020/11/20 15:16
 */
@RestController
@RequestMapping(value = "index")
public class IndexController {
    @RequestMapping(value = "hello")
    public String hello(String name){
        return ("hello m: "+name);
    }
}
