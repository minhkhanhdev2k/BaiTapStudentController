package com.cybersoft18.BaiTapStudentController.model;

import org.springframework.stereotype.Component;

public class Student {
    private String name;
    private int age;

    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
