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
public class ProfessionAbstractFactory extends AbstractFactory {
 
    @Override
    public Profession getProfession (String typeOfProfession){
        switch (typeOfProfession)
        {
            case "Doctor":
                return new Doctor();
            case "Engineer":
                return new Engineer();
            case "Teacher":
                return new Teacher();
            default:
                return null;
        }
        
    }   
}

