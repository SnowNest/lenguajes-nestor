/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-102
 */
public class Primera {
    public static void main(String[] args) {
        /*
        Vamos a ver primero la familia de 
        excepciones que el compilador se hace 
        cargo de ellas
        */
        
        int x = 0;
        int y = 2;
        
        /*
        Este rnglon lanza una excepcion que
        se llama ArithmeticException
        */
        
        //System.out.println(y/x);
        
        int[] arreglo = {1,2,3};
        
        //System.out.println(arreglo[3]);
        
        try{
            float a = 2;
            float b = Float.parseFloat("veinte");
        
            System.out.println(a*b);
        
        } catch(NumberFormatException a){
            System.out.println("Tonto xD ");
        }
        
        
    }
}
