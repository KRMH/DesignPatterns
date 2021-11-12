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
public class SingletonApp {
    private static SingletonApp singletonApp;
    
    private SingletonApp() {
    }
    
    public static SingletonApp getInstance(){
        if (null == singletonApp){
            singletonApp = new SingletonApp();
        }
        return singletonApp;
    }
    
}
