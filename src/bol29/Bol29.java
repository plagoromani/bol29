/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol29;

import java.util.ArrayList;

/**
 *
 * @author Pablite5
 */
public class Bol29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<Barco> barcos = new ArrayList();
        Barco vel = new veleros(18,4);
        Barco dep = new deportivos(18,34);
        Barco yat = new yate(24,5,38);
        
        barcos.add(vel);
        barcos.add(dep);
        barcos.add(yat);
        
       for(Barco b:barcos){
           b.factura(3);
    }
    
}
}