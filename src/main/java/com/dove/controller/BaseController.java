package com.dove.controller;

import com.dove.entity.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 基本控制器 所有控制器都继承它 可以提供公共的方法
 */
@Controller
@RequestMapping("/")
public class BaseController {
    //返回当前时间
    public Date getTime() {
        return new Date();
    }

    public Session getSession() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        Session session = (Session) request.getSession().getAttribute("session");
        return session;
    }

    @RequestMapping("/login")
    public String index()  {
        return "LoginPage";
    }
}
