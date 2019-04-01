package com.adaptive.mooc.mooc.service;

import com.adaptive.mooc.mooc.model.Question;
import com.adaptive.mooc.mooc.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServices {

    @Autowired
    QuestionRepo questionRepo;

    public Question evaluate(Question que) {

        int id = que.getId();
        String user_sol = que.getSol();

        Question q = (Question) questionRepo.findById(id).get();
        if (!user_sol.equals(q.getSol())){
            return questionRepo.findById(id-1).get();
        }

            return questionRepo.findById(id+1).get();


    }


    public Question getQuestion(int rating) {

        return questionRepo.findById(rating).get();

    }

    public void addQues(Question question) {

        questionRepo.save(question);
    }
}
