/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.designpatterns.SingletonPattern;

/**
 *
 * @author k.mhanna
 */
public class SingletonMain {
    
    public static void main (String args[]){
        SingletonApp app = SingletonApp.getInstance();
        System.out.println("app: " + app + " : " + app.hashCode());
        
        SingletonApp sapp = SingletonApp.getInstance();
        System.out.println("sapp: " + sapp + " : " + app.hashCode());
    }
    
    
    
}
