package com.mytestspring.controller;

import com.mytestspring.model.Answer;
import com.mytestspring.model.Form;
import com.mytestspring.model.Question;
import com.mytestspring.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alyba_000 on 25.05.2017.
 */
@Controller
public class QuestionController {
    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    FormRepository formRepository;

    // вывести все вопросы
    @RequestMapping("/form1")
    public String Answer1(Model model) {
        model.addAttribute("qList", questionRepository.findAll());
        return "form1";
    }

    @RequestMapping(value = "/addQuestion", method = RequestMethod.POST)
    public String addQuestion(@ModelAttribute Question question) {
        questionRepository.save(question);
        return "redirect:newtest";
    }


    // сохранение ответов в бд
    @RequestMapping(value = "/answer", method = RequestMethod.POST)
    public String addAnswer(@ModelAttribute Answer answer) {
        answerRepository.save(answer);
        return "redirect:home";
    }

}
