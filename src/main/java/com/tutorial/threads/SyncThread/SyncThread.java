/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.threads.SyncThread;

/**
 *
 * @author k.mhanna
 */
public class SyncThread {
    
    public static void main (String a[]) throws InterruptedException{
        Increment c = new Increment();
        
        Runnable hiDemo = () -> {
            for (int i = 0; i < 1000; i++){
             c.getCounter();
            }
        };
        
        
        Runnable helloDemo = () -> {
            for (int i = 0; i < 1000; i++){
             c.getCounter();
            }
        };
        
        Thread t1 = new Thread(hiDemo);
        Thread t2 = new Thread(helloDemo);
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println("counter : " + c.count);
    }
    
}
