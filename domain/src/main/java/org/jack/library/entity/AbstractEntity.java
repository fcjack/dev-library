package org.jack.library.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jackson on 04/01/17.
 */
@MappedSuperclass
@Table(schema = "library")
public abstract class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
