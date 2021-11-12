/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.designpatterns.BuilderPattern;

/**
 *
 * @author k.mhanna
 */
public class Shop {
    
    public static void main (String args[]){
        Phone p = new Phone("Android",2, "QualComm", 5.5, 3100);
        
        System.out.println("p:" + p);
        
        Phone pb = new PhoneBuilder().setOs("IPhone").setRam(2300).getPhone();
        System.out.println("pb: " + pb);
    }

}
