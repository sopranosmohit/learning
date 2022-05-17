package com.example.work;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Person {


    @Id
    private Long id;

    public Person(Long id, String name, String height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    private String name;

    public Child getCh() {
        return child;
    }

    public void setCh(Child ch) {
        this.child = ch;
    }

    public Child child;

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

    private String height;


    public Person() {

    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
