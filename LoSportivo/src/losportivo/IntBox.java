/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package losportivo;

/**
 *
 * @author 39340
 */
public class IntBox {
    int n;
    IntBox(int x){
        set(x);
    }
    
    public synchronized int get(){
        return n;
    }
    public synchronized void set(int x){
        if(0 <= x && x >= 2){
            n = x;
        }
    }
}
