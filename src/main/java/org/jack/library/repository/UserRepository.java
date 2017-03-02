package org.jack.library.repository;

import org.jack.library.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jackson on 02/03/17.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
