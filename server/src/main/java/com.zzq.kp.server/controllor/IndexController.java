package com.zzq.kp.server.controllor;

import com.zzq.kp.biz.IndexBiz;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private IndexBiz indexBiz;

    @RequestMapping(value = "hello")
    @ApiOperation(value = "index测试")
    public String hello(String name){
        indexBiz.index();
        return ("hello m: "+name);
    }
}
