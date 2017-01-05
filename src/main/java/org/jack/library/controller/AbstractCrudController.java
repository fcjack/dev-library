package org.jack.library.controller;

import org.jack.library.domain.AbstractEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.Serializable;
import java.util.List;

/**
 * Abstract controller that have all common operations for crud
 * <p>
 * Created by jackson on 04/01/17.
 */
public abstract class AbstractCrudController<T extends AbstractEntity, ID extends Serializable> {

    private final CrudRepository<T, ID> repository;

    AbstractCrudController(CrudRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<T> list() {
        return (List<T>) repository.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public T findOne(@PathVariable ID id) {
        return (T) repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody T entity) {
        repository.save(entity);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public void update(@RequestBody T entity) {
        repository.save(entity);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void remove(@PathVariable ID id) {
        repository.delete(id);
    }

}
