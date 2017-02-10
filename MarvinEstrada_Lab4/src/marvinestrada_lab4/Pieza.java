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
public abstract class Pieza {

    private Color color;

    public Pieza() {
    }

    public Pieza(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pieza{" + "color=" + color + '}';
    }

    public abstract void Mover();

    public abstract void Comer();

}
