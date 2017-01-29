/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.Random;

/**
 *
 * @author DanielWilfredo
 */
public class NumeRand {
    
    
        public int numeAlea;
        public int calcNume()
        {
            Random geneRand = new Random();
            numeAlea= geneRand.nextInt(6)+1;
            return numeAlea;
        }
    }
    

