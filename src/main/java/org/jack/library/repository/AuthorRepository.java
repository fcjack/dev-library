package org.jack.library.repository;

import org.jack.library.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jackson on 04/01/17.
 */
public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
