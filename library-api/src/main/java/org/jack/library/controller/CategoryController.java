package org.jack.library.controller;

import org.jack.library.domain.BookCategory;
import org.jack.library.repository.BookCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jackson on 02/03/17.
 */
@RestController
@RequestMapping("category")
public class CategoryController extends AbstractCrudController<BookCategory, Integer> {

    @Autowired
    CategoryController(BookCategoryRepository bookCategoryRepository) {
        super(bookCategoryRepository);
    }
}
