package com.example.work;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Child {


    private String childNames;
    private String childAge;
    private Long id;

    public Child(String childName, String childAge) {
        this.childNames = childName;
        this.childAge = childAge;
    }


    public Child()
    {

    }

    public String getChildNames() {
        return childNames;
    }

    public void setChildNames(String childName) {
        this.childNames = childName;
    }

    public String getChildAge() {
        return childAge;
    }

    public void setChildAge(String childAge) {
        this.childAge = childAge;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
