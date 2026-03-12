/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package losportivo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 39340
 */
public class Lavnderia extends Thread {
    int tempo;
    IntBox maglia;
    
    Lavnderia(int t, IntBox ib){
        maglia = ib;
        tempo = t;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                sleep(tempo*1000);
                maglia.set(maglia.get()+1);
                System.out.print("\n<<Lavanderia pulisce maglia:  " + maglia.get());
            } catch (InterruptedException ex) {
                Logger.getLogger(Lavnderia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
