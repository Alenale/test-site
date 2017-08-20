package com.mytestspring.repositories;

import com.mytestspring.model.Answer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by alyba_000 on 22.05.2017.
 */
public interface AnswerRepository extends CrudRepository<Answer, Long> {
}
