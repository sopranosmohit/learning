package com.example.work;

public class ChildDto {

    private String childNames;

    private int childAge;

    public ChildDto(String childName, int childAge) {
        this.childNames = childName;
        this.childAge = childAge;
    }

    public ChildDto()
    {

    }


    public String getChildName() {
        return childNames;
    }

    public void setChildName(String childName) {
        this.childNames = childName;
    }

    public int getChildAge() {
        return childAge;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }
}
