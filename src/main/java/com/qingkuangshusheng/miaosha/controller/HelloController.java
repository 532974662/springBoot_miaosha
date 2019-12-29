package com.qingkuangshusheng.miaosha.controller;

import com.qingkuangshusheng.miaosha.domain.CodeMsg;
import com.qingkuangshusheng.miaosha.domain.Result;
import com.qingkuangshusheng.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public Result<String> hello(){
        return Result.success("hello,qingkuangshusheng");
    }

    @RequestMapping("/helloError")
    @ResponseBody
    public Result<String> helloError(){
        return Result.error(CodeMsg.SERVER_ERROR);
    }

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","轻狂书生");
        return "hello";
    }

    //数据改变
//    @RequestMapping("/db/get")
//    @ResponseBody
//    public Result<String> dbGet(){
//
//    }
//




}


