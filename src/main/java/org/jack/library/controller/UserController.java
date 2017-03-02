package org.jack.library.controller;

import org.jack.library.domain.User;
import org.jack.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by jackson on 02/03/17.
 */
@RestController
@RequestMapping("user")
public class UserController extends AbstractCrudController<User, Integer> {

    @Autowired
    UserController(UserRepository userRepository) {
        super(userRepository);
    }

    @Override
    public void save(@RequestBody User user) {
        user.setCreated(new Date());
        super.save(user);
    }
}
