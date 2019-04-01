package com.adaptive.mooc.mooc.controller;


import com.adaptive.mooc.mooc.model.Question;
import com.adaptive.mooc.mooc.service.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class questionController {

    @Autowired
    QuestionServices questionServices;
    @PostMapping("/enroll")
    public Question enrollQuestion(@RequestBody Question question){

        return questionServices.evaluate(question);
    }

    @GetMapping("/getques/{rating}")
    public Question getQuestion(@PathVariable int rating){

        return questionServices.getQuestion(rating);

    }

    @PostMapping("/addQue")
    public void Addques(@RequestBody Question question){

        questionServices.addQues(question);
    }


}
