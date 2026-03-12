/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package losportivo;

/**
 *
 * @author 39340
 */
public class LoSportivo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntBox maglia= new IntBox(2);
        //per cambire il tempo basta 
        //cambiare il numero in input delle classi (Secondi)
        Sportivo sport= new Sportivo(5, maglia);
        Lavnderia lavatrice = new Lavnderia(3, maglia);
        
        sport.start();
        lavatrice.start();
    }
    
}
