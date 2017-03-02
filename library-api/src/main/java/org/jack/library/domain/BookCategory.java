package org.jack.library.domain;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

/**
 * Created by jackson on 01/03/17.
 */
@Entity(name = "category")
@SequenceGenerator(name = "seq", sequenceName = "category_seq", allocationSize = 1)
public class BookCategory extends AbstractEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
