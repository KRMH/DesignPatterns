/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.designpatterns.factorypattern;

/**
 *
 * @author k.mhanna
 */
public class Engineer implements Profession {
    String typeOfProfession = "Engineer";
    
    @Override
    public void printProfession(){
        System.out.println("I am an engineer");
    }

    public String getTypeOfProfession() {
        return typeOfProfession;
    }

    public void setTypeOfProfession(String typeOfProfession) {
        this.typeOfProfession = typeOfProfession;
    }
}
