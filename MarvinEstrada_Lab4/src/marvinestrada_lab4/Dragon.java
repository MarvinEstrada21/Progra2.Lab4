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
public class Dragon extends Pieza {

    public Dragon() {
    }

    public Dragon(Color color) {
        super(color);
    }

    @Override
    public String toString() {
        return super.toString() + "Dragon{" + '}';
    }

    @Override
    public void Mover(String x[][], int fila, int col, int fila2, int col2) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if ((i == fila2 && j == col2) && (i >= 0 && j >= 0 || i < x.length - 1 && j == x.length - 1)){
                    x[i][j] = x[fila][col];
                    x[fila][col] = "   ";
                }
            }
        }
    }

    public void Comer(int x[][]) {
    }
}
