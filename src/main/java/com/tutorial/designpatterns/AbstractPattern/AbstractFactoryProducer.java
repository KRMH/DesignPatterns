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
public class AbstractFactoryProducer {
    
    public static AbstractFactory getProfession (boolean isTrainee){
        if (isTrainee){
            return new TraineeProfessionAbstractFactory();
        }
        else{
            return new ProfessionAbstractFactory();
        }
    }
    
}
