package org.jack.library.controller;

import org.jack.library.entity.Author;
import org.jack.library.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jackson on 04/01/17.
 */
@RestController
@RequestMapping("author")
public class AuthorController extends AbstractCrudController<Author, Integer> {

    @Autowired
    AuthorController(AuthorRepository repository) {
        super(repository);
    }
}
