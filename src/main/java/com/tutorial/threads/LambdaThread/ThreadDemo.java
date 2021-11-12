/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.threads.LambdaThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author k.mhanna
 */
public class ThreadDemo {
    public void  main2 (String args[]){
        Runnable hiDemo = () -> {
            for (int i = 0; i < 5; i++){
                System.out.println("Hi: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        
        Runnable helloDemo = () -> {
            for (int i = 0; i < 5; i++){
                System.out.println(" Hello: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        Thread t1 = new Thread(hiDemo);
        Thread t2 = new Thread(helloDemo);
        t1.start();
        t2.start();
    }
    
    
    public static void main (String args[]) throws InterruptedException{
        
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                System.out.println("Hi: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }, "Hi Thread");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                System.out.println(" Hello: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }, "Hello Thread");
        //t1.setName("Hi Thread");
        //t2.setName("Hello Thread");
        System.out.println(t1);
        System.out.println(t2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Bye");
    }
}
