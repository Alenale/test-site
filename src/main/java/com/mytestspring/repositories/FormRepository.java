package com.mytestspring.repositories;

import com.mytestspring.model.Form;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by alyba_000 on 26.05.2017.
 */
public interface FormRepository extends CrudRepository<Form, Long> {
    Form findByTestName(String testName);
    Form findById(long id);
}
