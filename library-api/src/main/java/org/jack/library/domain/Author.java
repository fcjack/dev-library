package org.jack.library.domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jackson on 04/01/17.
 */
@Entity
@SequenceGenerator(name = "seq", sequenceName = "author_seq", allocationSize = 1)
public class Author extends AbstractEntity {

    @NotEmpty(message = "Author has to have a name")
    @NotBlank(message = "The author`s name can not be empty")
    private String name;

    private Integer age;

    @Column(name = "facebook_page")
    private String facebookPage;

    @NotEmpty(message = "Author has to have books")
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "author_book", joinColumns = {@JoinColumn(name = "author_id")}, inverseJoinColumns = {@JoinColumn(name = "book_id")})
    private List<Book> books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFacebookPage() {
        return facebookPage;
    }

    public void setFacebookPage(String facebookPage) {
        this.facebookPage = facebookPage;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
