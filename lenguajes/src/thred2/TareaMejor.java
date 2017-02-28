/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thred2;

/**
 *
 * @author T-102
 */
public class TareaMejor implements  Runnable{
    
    public static void main(String[] args) {
        
        //Crear thred
        Runnable r = new TareaMejor();
        Thread t1 = new Thread(r);
        t1.start();
        
    }

    @Override
    public void run() {
        System.out.println("thredjkgfygsrafhij");
    }
    
}
