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
public class Duendes extends Pieza {

    public Duendes() {
        super();
    }

    public Duendes(Color color) {
        super(color);
    }

    @Override
    public String toString() {
        return super.toString() + "Duendes{" + '}';
    }

    @Override
    public void Mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Comer() {
    }

}
