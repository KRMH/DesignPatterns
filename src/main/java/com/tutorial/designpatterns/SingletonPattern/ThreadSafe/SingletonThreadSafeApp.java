/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.designpatterns.SingletonPattern.ThreadSafe;

/**
 *
 * @author k.mhanna
 */
public class SingletonThreadSafeApp {
    private static SingletonThreadSafeApp singletonThreadSafeApp;
    
    private SingletonThreadSafeApp() {
    }
    
    public static SingletonThreadSafeApp getInstance(){
        if (null == singletonThreadSafeApp){
            singletonThreadSafeApp = new SingletonThreadSafeApp();
        }
        return singletonThreadSafeApp;
    }
    
}
