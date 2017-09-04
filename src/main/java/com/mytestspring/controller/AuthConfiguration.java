package com.mytestspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alyba_000 on 01.05.2017.
 */
@Controller
public class AuthConfiguration {

    @RequestMapping(value={"/welcome"})
    public String welcome(){
        return "welcome";
    }

    @RequestMapping(value="/admin")
    public String admin(){
        return "admin";
    }

    @RequestMapping(value={"/login"})
    public String login(){
        return "login";
    }

    @RequestMapping(value={"/newtest"})
    public String newtest(){
        return "newtest";
    }
}
