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
public class FactoryPatternMainClass {
    public static void main (String[] args){
        System.out.println("KRISTEL KRISTEL KRISTEL KRISTEL KRISTEL KRISTEL KRISTEL KRISTEL KRISTEL KRISTEL KRISTEL ");
        ProfessionFactoryPattern professionFactoryPattern = new ProfessionFactoryPattern();
        Profession doc = professionFactoryPattern.getProfession("Doctor");
        doc.printProfession();
    }
}
