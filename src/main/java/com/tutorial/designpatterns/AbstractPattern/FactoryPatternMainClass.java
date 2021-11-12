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
public class FactoryPatternMainClass {
    public static void main (String[] args){
        System.out.println("Abstract Factory ");
        AbstractFactory afp = AbstractFactoryProducer.getProfession(true);
        afp.getProfession("Doctor").printProfession();
        
    }
}
