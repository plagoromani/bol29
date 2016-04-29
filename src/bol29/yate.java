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
public class yate extends Barco{
private int potencia;
private int camarotes;

    public yate(int potencia, int camarotes, int eslora) {
        super(eslora);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    @Override
    public void factura(int dias) {
        System.out.println("matricula: "+0+" eslora: "+super.getEslora()+" precio: "+((dias*(10*super.getEslora()))+potencia +camarotes));
    }
    
}
