/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.Scanner;

/**
 *
 * @author DanielWilfredo
 */
public class Iniciales {
    
    
    public String ObtNomb(String nomb)
    {
        String nomb1;
        nomb1 = nomb.substring(0,1);
         
        return nomb1;
    }
    
     public String ObtApel(String Apel)
    {
        String Apel1;
        Apel1 = Apel.substring(0,1);
         
        return Apel1;
    }
     
      public String ObtApel2(String Apel)
    {
          String Apel2;
        Apel2 = Apel.substring(0,1);
         
        return Apel2;
    }
      public String NombComp(String nomb, String apel, String apel2)
      {
          String nombComp;
          nombComp= nomb + " " + apel + " " + apel2;  
        return nombComp;
      }
    
}
