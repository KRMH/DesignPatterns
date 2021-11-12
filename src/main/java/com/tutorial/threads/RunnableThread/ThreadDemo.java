/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.threads.RunnableThread;


/**
 *
 * @author k.mhanna
 */
public class ThreadDemo {
    public static void main (String args[]){
        HiDemo hiDemo = new HiDemo();
        HelloDemo helloDemo = new HelloDemo();
        Thread t1 = new Thread(hiDemo);
        Thread t2 = new Thread(helloDemo);
        t1.start();
        t2.start();
    }
}
