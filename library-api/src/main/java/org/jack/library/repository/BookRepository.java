package org.jack.library.repository;

import org.jack.library.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jackson on 04/01/17.
 */
public interface BookRepository extends CrudRepository<Book, Integer> {

}
