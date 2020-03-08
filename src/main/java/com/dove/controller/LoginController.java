package com.dove.controller;

import com.dove.entity.Session;
import com.dove.entity.User;
import com.dove.service.UserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginController extends BaseController{
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public boolean login(User user) {
        System.out.println(user.getUsername() + "  " + user.getPassword());
        Map<Object, Object> map = userService.login(user);
        if (map == null || map.isEmpty()) {
            return false;
        } else {
            Session session = new Session();
            session.setName(user.getUsername());
            session.setRole((String) map.get("roleName"));
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("session", session);
            return true;
        }
    }

    @RequestMapping("logout")
    public void logout(User user) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession httpSession = request.getSession();
        httpSession.removeAttribute("session");
    }


}
