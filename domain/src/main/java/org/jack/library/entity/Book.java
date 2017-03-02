package org.jack.library.entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by jackson on 04/01/17.
 */
@Entity
@SequenceGenerator(name="seq", sequenceName = "book_seq", allocationSize = 1)
public class Book extends AbstractEntity {

    @NotNull
    @NotBlank
    @NotEmpty
    private String title;

    @NotNull
    private Integer year;

    @NotNull
    private Integer edition;

    private Integer pages;

    private Double rate;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "book_category", joinColumns = {@JoinColumn(name = "book_id")}, inverseJoinColumns = {@JoinColumn(name = "category_id")})
    private List<BookCategory> categories;

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

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public List<BookCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<BookCategory> categories) {
        this.categories = categories;
    }
}
