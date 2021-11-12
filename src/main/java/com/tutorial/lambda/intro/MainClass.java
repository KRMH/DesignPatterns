/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.lambda.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author k.mhanna
 */
public class MainClass {
    public static void main (String[] arg){
        Employee john = new Employee("John Doe", 33);
        Employee tim = new Employee("Tim Cook", 65);
        Employee jack = new Employee("Jack Daniel", 120);
        Employee jye = new Employee("Jye Xao", 24);
        
        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(jye);
        
        Collections.sort(employees, (Employee employee1, Employee employee2) -> employee1.getName().compareTo(employee2.getName()));
        
        String sillyString = doStringStuff(new UpperConcat() {
            @Override
            public String upperConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, employees.get(0).getName(), employees.get(1).getName());
        
        System.out.println("sillyString: " + sillyString);
        
        
        String sillyString2 = doStringStuff((String s1, String s2) -> s1.toUpperCase() + s2.toUpperCase(), employees.get(0).getName(), employees.get(1).getName());
        
        
        
        for (Employee emp1 : employees){
            System.out.println("Employee: " + emp1.getName() + " age: " + emp1.getAge());
        }
        
    }
    
    public final static String doStringStuff (UpperConcat uc, String s1, String s2){
        return uc.upperConcat(s1, s2);
    }
}
