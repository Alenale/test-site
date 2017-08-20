package com.mytestspring.repositories;

import com.mytestspring.model.Form;
import com.mytestspring.model.Question;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by alyba_000 on 25.05.2017.
 */
public interface QuestionRepository extends CrudRepository<Question, Long> {
    List<Question> findByTest(int test);
    List<Question> findByTestName(String testName);
}
