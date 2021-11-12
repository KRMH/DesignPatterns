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
public class Increment {
    public int count;
    
    public synchronized void getCounter (){
        count++;
    }
}
