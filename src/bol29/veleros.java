/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol29;

/**
 *
 * @author Pablite5
 */
public class veleros extends Barco {
private int mástiles;

    public veleros(int mástiles, int eslora) {
        super(eslora);
        this.mástiles = mástiles;
    }

    @Override
    public void factura(int dias) {
       System.out.println("matricula: "+0+" eslora: "+super.getEslora()+" precio: "+((dias*(10*super.getEslora()))+mástiles));
    }
    
}
