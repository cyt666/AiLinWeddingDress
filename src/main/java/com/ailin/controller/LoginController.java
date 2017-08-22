package com.ailin.controller;

import com.ailin.model.Consumer;
import com.ailin.model.User;
import com.ailin.service.ConsumerService;
import com.ailin.util.MD5Util;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class LoginController {
    @Autowired
    private ConsumerService consumerService;
    /**
     *@Author tyg
     *@Date 2017/8/4 10:05
     *@Description 登录页面
     */
    @RequestMapping("login")
    public String login(){
        return "login";
    }
    @RequestMapping("home")
    public String enter(){
        return "home";
    }
    /**
     *@Author tyg
     *@Date 2017/8/4 10:06
     *@Description 校验登录
     */
    @RequestMapping("/logincheck")
    @ResponseBody
    public String checkLogin(HttpServletRequest request) throws Exception {
        String username = request.getParameter("username");
        String pwd=request.getParameter("password");
        UsernamePasswordToken token = new UsernamePasswordToken(username, pwd);
        token.setRememberMe(true);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            SecurityUtils.getSubject().getSession().setTimeout(1800000);
        } catch (Exception e) {
            return "login_fail";
        }
        return "login_succ";


    }
    /**
     *@Author tyg
     *@Date 2017/8/4 10:07
     *@Description 注册页面
     */
    @RequestMapping("regist")
    public String regist(){
        return "regist";
    }

    @RequestMapping("doregist")
    public String register(Consumer consumer,HttpServletRequest request) throws Exception {
        String password = MD5Util.getMd5(request.getParameter("password"));
        String gender = request.getParameter("gender");
        System.out.println(gender);
        System.out.println(consumer);
        return "login";
    }
    @RequestMapping("/do")
    public String register(@RequestBody User user) {
        System.out.println(user.getUsername());
        return "home";
    }
}
