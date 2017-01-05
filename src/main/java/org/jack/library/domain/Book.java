package org.jack.library.domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

/**
 * Created by jackson on 04/01/17.
 */
@Entity
@SequenceGenerator(name="seq", sequenceName = "book_seq")
public class Book extends AbstractEntity {

    @NotNull
    @NotBlank
    @NotEmpty
    private String title;

    @NotNull
    @NotBlank
    @NotEmpty
    private Integer year;

    @NotNull
    @NotBlank
    @NotEmpty
    private Integer edition;

    private Integer pages;

    private Double rate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }
}
