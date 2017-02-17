/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcione2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author T-102
 */
public class ModeloLector {
    public String leerArchivo(File file)throws FileNotFoundException, IOException{
        String informacion = "Nada";
        
         FileInputStream fis = new FileInputStream(file);
        StringBuilder builder = new StringBuilder();
        byte ch;
        while ((ch = (byte) fis.read()) != -1) {            
            builder.append((char)ch);
        }
        return informacion;
    }
}
