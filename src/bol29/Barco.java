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
public abstract class Barco {
    private int eslora;

    public int getEslora() {
        return eslora;
    }

    public Barco(int eslora) {
        this.eslora = eslora;
    }
    
    public abstract void factura(int dias);
}
