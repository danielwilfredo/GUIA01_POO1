/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author DanielWilfredo
 */
import java.io.*;
public class Leertxt {
    
    public String ObteText(String nomb)
    { 
        String nomb1 = "";
                try{
            BufferedReader bfre = new BufferedReader(new FileReader(nomb));
            String temp = "";
            String bfRead;
            while((bfRead = bfre.readLine()) != null){ 
                //hace el ciclo, mientras bfRead tiene datos
                temp = temp + bfRead; //guardado el texto del archivo
            }
            
            nomb1 = temp;
            
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
        }
        
        return nomb1;
        
    }
    
      public String ObteText2(String apel)
    { 
        String apel2 = "";
                try{
            BufferedReader bfre = new BufferedReader(new FileReader(apel));
            String temp = "";
            String bfRead;
            while((bfRead = bfre.readLine()) != null){ 
                //hace el ciclo, mientras bfRead tiene datos
                temp = temp + bfRead; //guardado el texto del archivo
            }
            
            apel2 = temp;
            
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
        }
        
        return apel2;
    }
        public String ObteText3(String apel2)
    { 
        String apel3 = "";
                try{
            BufferedReader bfre = new BufferedReader(new FileReader(apel2));
            String temp = "";
            String bfRead;
            while((bfRead = bfre.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                temp = temp + bfRead; //guardado el texto del archivo
            }
            
            apel3 = temp;
            
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
        }
        
        return apel3;
    }

    String leerTxt(String cDevelopersAztecatxtholamundotxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
