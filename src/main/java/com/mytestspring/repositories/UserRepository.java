package com.mytestspring.repositories;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.repository.CrudRepository;
import com.mytestspring.model.User;
import java.util.List;

/**
 * Created by alyba_000 on 01.05.2017.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    /*List<User> findByLastName();
    User findById(long id);*/
}
