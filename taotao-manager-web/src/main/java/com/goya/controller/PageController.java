package com.goya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cj
 * @create 2019-09-2019/09/04 14:28
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }
    //显示商品的查询的页面
    //url:item-list
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
