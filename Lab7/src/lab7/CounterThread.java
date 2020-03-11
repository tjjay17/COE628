/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author gabriel
 */
public class CounterThread extends Thread{
    Counter counter;
    int n = 0;
    
    public CounterThread(Counter counter, int n){
        this.counter = counter;
        this.n = n;
    }
    
    @Override
    public void run(){
        for(int i = 0; i < n; i++)
            counter.add(i);
    }
}
