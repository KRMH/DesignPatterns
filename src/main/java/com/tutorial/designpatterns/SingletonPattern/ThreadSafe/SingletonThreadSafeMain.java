/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.designpatterns.SingletonPattern.ThreadSafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author k.mhanna
 */
public class SingletonThreadSafeMain {
    
    public static void main (String args[]){
        ExecutorService exeService = null; 
        MyThread myThread = new MyThread();
        
        try {
            exeService = Executors.newFixedThreadPool(3);
            exeService.execute(myThread);
            exeService.execute(myThread);
            exeService.execute(myThread);
        }
        catch(Exception e){
            e.printStackTrace();
        } finally{
            if (exeService != null){
                exeService.shutdown();
            }
        }
    }
    
    
    
}
