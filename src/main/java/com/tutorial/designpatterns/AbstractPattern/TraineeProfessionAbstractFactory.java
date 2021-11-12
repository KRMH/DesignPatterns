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
public class TraineeProfessionAbstractFactory extends AbstractFactory {
 
    @Override
    public Profession getProfession (String typeOfProfession){
        switch (typeOfProfession)
        {
            case "Doctor":
                return new TraineeDoctor();
            case "Engineer":
                return new TraineeEngineer();
            case "Teacher":
                return new TraineeTeacher();
            default:
                return null;
        }
        
    }   
}

