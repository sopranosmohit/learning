package com.example.work;

public class DTO {


    private int height;
    private String childNames;

    private ChildDto child;


    public String getChildNames() {
        return childNames;
    }

    public ChildDto getChild() {
        return child;
    }

    public void setChild(ChildDto child) {
        this.child = child;
    }

    public void setChildNames(String childName) {
        this.childNames = childName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    private String FirstName;

    public int getHeight() {
        return height;
    }

    public DTO(int height) {
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
