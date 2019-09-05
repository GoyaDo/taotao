package com.goya.controller;


import com.goya.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试使用的controller，查询当前的时间
 * @author cj
 * @create 2019-09-2019/09/04 9:46
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test/queryNow")
    @ResponseBody
    public String queryNow(){
        //1,引入服务
        //2,注入服务
        //3,调用服务的方法
        return testService.queryNow();
    }
}
