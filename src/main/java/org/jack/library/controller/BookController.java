package org.jack.library.controller;

import org.jack.library.domain.Book;
import org.jack.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jackson on 04/01/17.
 */
@RestController
@RequestMapping("book")
public class BookController extends AbstractCrudController<Book, Integer> {

    @Autowired
    public BookController(BookRepository repository) {
        super(repository);
    }
}
