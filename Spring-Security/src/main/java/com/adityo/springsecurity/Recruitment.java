package com.adityo.springsecurity;

public class Recruitment {

    private int id;
    private String name;
    private float salary;
    private String email;

    public Recruitment(int i, String s, String s1, String email) {

    }
    public Recruitment(int id, String name, float salary, String email) {
         this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
