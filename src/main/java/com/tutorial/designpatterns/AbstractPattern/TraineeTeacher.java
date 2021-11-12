/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.designpatterns.AbstractPattern;


/**
 *
 * @author k.mhanna
 */
public class TraineeTeacher implements Profession {
    String typeOfProfession = "Teacher";
    
    @Override
    public void printProfession(){
        System.out.println("I am a TRAINEE teacher");
    }

    public String getTypeOfProfession() {
        return typeOfProfession;
    }

    public void setTypeOfProfession(String typeOfProfession) {
        this.typeOfProfession = typeOfProfession;
    }
    
    
}
