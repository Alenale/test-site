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

    // Достать из таблицы test id теста
    /*@RequestMapping(value = "/form", params = "f1")
    public String search(Model model, @RequestParam("f1") int f1) {
        model.addAttribute("f1", formRepository.findById(f1));
        //model.addAttribute("search", search);
        return "form";
    }*/
    /*@RequestMapping(value = "/create", method = RequestMethod.POST)
    public String addAnswer(@ModelAttribute Form form) {
        formRepository.save(form);
        return "newform";
    }
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String addAnswer(Model model) {
        model.addAttribute("newquestion", new Form());
        return "create";
    }*/

/*// добавить вопрос в таблицу Question
    @RequestMapping(value = "/addQuestion", method = RequestMethod.POST)
    public String addQuestion(@ModelAttribute Question question) {
        questionRepository.save(question);
        return "redirect:form1";
    }*/

    /*@RequestMapping(value = "/addQuestion", params = "testName")
    public String addQuestion(@ModelAttribute Question question, Model model, @RequestParam("testName") ) {
        model.addAttribute("testName", formRepository.findByTestName(testName));
        return "redirect:form1";
    }*/


    /*@RequestMapping(value = "/searchtest")
    public String search(Model model, @RequestParam String searchtest) {
        Form f = formRepository.findByTestName(searchtest);
        //String q = f.getTestName();
        model.addAttribute("q", f);
        //model.addAttribute("search", search);
        return "form1";
    }*/

    /*@RequestMapping(value = "/search")
    public String search(Model model, @RequestParam String search) {
        Form f = formRepository.findByTestName(search);
        String q = f.getTestName();
        model.addAttribute("qList", q);
        //model.addAttribute("search", search);
        return "";
    }




    /*List<Question> ques = new ArrayList<Question>();

    @RequestMapping(value = "/getquestion", method = RequestMethod.GET)
    public List<Question> getResource(){
        return ques;
    }

    @RequestMapping(value="/postquestion", method=RequestMethod.POST)
    public void postCustomer(@RequestBody Question question){
        ques.add(question);
        //questionRepository.save(question);
        return;
    }*/

    /*@GetMapping("/newquestion")
    public String addQuestion(Model model) {
        model.addAttribute("newquestion", new Question());
        return "newquestion";
    }

    @PostMapping("/newquestion")
    public String SubmitQuestion(@ModelAttribute Question question) {
        questionRepository.save(question);
        return "question";
    }*/


    /*@RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
    public @ResponseBody
    String getById(@PathVariable long id, Model model) {
        String q = "";
        String result = "<!DOCTYPE html>" + "<html xmlns='http://www.w3.org/1999/xhtml' xmlns:th='http://www.thymeleaf.org'>";
        try {
            Form f = formRepository.findById(id);
            q = f.get();
            result +=  "<head >"  +
                    "<meta http-equiv='Content-Type' content='text/html;  charset=UTF-8'/>"+
                    "<title>" + "Эксперт" + "</title>" +
                    "</head>" +
                    "<body>" +
                    "<form action='' th:action='@{/question}' th:object='${question}' method='post' >" +
                    "<div class='class'>" + q + "</div>" +
                    "<a href=\"/answer1\">Продолжить -></a>" +
                    "</form>" +
                    "</body>";
        }
        catch (Exception ex) {
            return "Вопрос не найден";
        }

        //model.addAttribute(questionRepository);

        return result + "</html>";

    }

    /*@RequestMapping(value = "answer1", method = RequestMethod.GET)
    public String Answer(Model model) {
        model.addAttribute(new Answer());
        return "answer1";
    }


    @RequestMapping(value = "answer1", method = RequestMethod.POST)
    public String SaveAnswer(@ModelAttribute Answer answer) {
        answerRepository.save(answer);
        return "answer1";
    }


    /*@RequestMapping(value = "/question/1")
    public @ResponseBody
    String getById(Model model) {
        model.addAttribute(questionRepository);
        return "question";
    }*/


}
