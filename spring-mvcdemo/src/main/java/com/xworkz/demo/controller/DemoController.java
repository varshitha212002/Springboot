package com.xworkz.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DemoController {
    @GetMapping("registerto")
    public String getRegister(){
        return "register.jsp";
    }
    @GetMapping("admitionto")
    public String getAdmin(){
        return "admin.jsp";
    }
    @GetMapping("backto")
    public String getBack (){
        return "back.jsp";
    }
    @GetMapping("hometo")
    public String getHome(){
        return "home.jsp";
    }
    @GetMapping("loginto")
    public String getLogin (){
        return "login.jsp";
    }
    @GetMapping("logoutto")
    public String getLogout (){
        return "logout.jsp";
    }
    @GetMapping("signinto")
    public String getSignin(){
        return "sigin.jsp";
    }
    @GetMapping("sigoutto")
    public String getSignout(){
        return "sigout.jsp";
    }

    @GetMapping("successto")
    public String getSuccess(){
        return "success.jsp";
    }

    @GetMapping("viewto")
    public String getView(){
        return "view.jsp";
    }


}
