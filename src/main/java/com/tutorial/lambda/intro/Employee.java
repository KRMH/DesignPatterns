/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.lambda.intro;

/**
 *
 * @author k.mhanna
 */
public class Employee {
    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
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
    
    
    
}
