package com.mytestspring.controller;

import com.mytestspring.model.Form;
import com.mytestspring.model.Question;
import com.mytestspring.repositories.FormRepository;
import com.mytestspring.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by alyba_000 on 29.05.2017.
 */
@Controller
public class FormController {
    @Autowired
    FormRepository formRepository;

    @Autowired
    QuestionRepository questionRepository;



    @RequestMapping("/home")
    public String Answer1(Model model) {
        model.addAttribute("fList", formRepository.findAll());
        return "home";
    }

    /*@RequestMapping(value = "/search")
    public String search(Model model, @RequestParam String search) {
        model.addAttribute("qList", questionRepository.findByTestName(search));
        //model.addAttribute("search", search);
        return "home";
    }*/


    // забирает из бд вопросы в соответствии в id теста
    @RequestMapping(value = "/test", params = "test")
    public String search(Model model, @RequestParam("test") int test) {
        model.addAttribute("qList", questionRepository.findByTest(test));
        //model.addAttribute("search", search);
        return "home";
    }



}
