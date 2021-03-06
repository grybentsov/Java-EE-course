package ru.geekbrains.service;

import ru.geekbrains.persist.Category;

import java.io.Serializable;

public class CategoryRepr implements Serializable {

    private Long id;
    private String name;

    public CategoryRepr() {
    }

    public CategoryRepr(Category category) {
        id = category.getId();
        name = category.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
