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
public class MyThread implements Runnable {
    
    @Override
    public void run(){
        SingletonThreadSafeApp singleton = SingletonThreadSafeApp.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + singleton.hashCode());
    }
}
