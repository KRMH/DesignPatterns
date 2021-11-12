/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.threads.RunnableThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author k.mhanna
 */
public class HiDemo implements Runnable {
    
    @Override
    public void run (){
        for (int i = 0; i < 5; i++){
            System.out.println("Hi: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
