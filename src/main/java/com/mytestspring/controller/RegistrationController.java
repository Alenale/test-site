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


    //Question
    /*@RequestMapping(value = "/find-by", method = RequestMethod.GET)
    public @ResponseBody String getById(@RequestParam("id") long id) {
        String userName = "";
        id++;
        try {
            User user = repository.findById(id);
            userName = user.getFirstName();
        }
        catch (Exception ex) {
            return "User not found";
        }
        return "The user id is: " + userName;
    }*/

    /*@RequestMapping(value = "/find-by-name", method = RequestMethod.GET)
    public @ResponseBody
    String getByLastName() {
        String userName = "";
        List<User> user = repository.findByLastName();
        while (!user.isEmpty()) {
            String user.getFirstName();

        }
        /*try {
            User user = repository.findByLastName(id);
            userName = user.getFirstName();
        }
        catch (Exception ex) {
            return "User not found";
        }
        return
    }*/



}
