package com.mytestspring.controller;

import com.mytestspring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.mytestspring.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *  by alyba_000 on 01.05.2017.
 */
@Controller
public class RegistrationController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/registration")
    public String addUser(Model model) {
        model.addAttribute("registration", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String Submit(@ModelAttribute User user) {
        userRepository.save(user);
        return "result";
    }

}
