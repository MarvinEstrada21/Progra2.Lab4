/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marvinestrada_lab4;

import java.awt.Color;

/**
 *
 * @author Fernando Goti
 */
public class Mago extends Pieza {

    public Mago() {
        super();
    }

    public Mago(Color color) {
        super(color);
    }

    @Override
    public String toString() {
        return super.toString() + "Mago{" + '}';
    }

    @Override
    public void Mover(String x[][], int fila, int col, int fila2, int col2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
