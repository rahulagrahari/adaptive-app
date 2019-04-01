package com.adaptive.mooc.mooc.repository;

import com.adaptive.mooc.mooc.model.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends CrudRepository<Question, Integer> {
}
