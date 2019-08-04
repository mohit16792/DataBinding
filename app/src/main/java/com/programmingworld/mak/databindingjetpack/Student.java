package com.programmingworld.mak.databindingjetpack;

public class Student {
    private String email;

    public Student(String email, String name) {
        this.email = email;
        this.name = name;
    }
    public Student(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
