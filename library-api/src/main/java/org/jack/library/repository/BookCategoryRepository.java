package org.jack.library.repository;

import org.jack.library.domain.BookCategory;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jackson on 02/03/17.
 */
public interface BookCategoryRepository extends CrudRepository<BookCategory, Integer> {
}
