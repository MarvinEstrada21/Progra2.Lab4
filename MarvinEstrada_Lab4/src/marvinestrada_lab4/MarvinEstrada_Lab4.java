package marvinestrada_lab4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MarvinEstrada_Lab4 {
    private static String nombre;
    private static String nombre_usuario;
    private static int puntos_actuales;
    private static String lugar_nacimiento;
    private static int edad;
    private static String sexo;
    private static ArrayList lista = new ArrayList();
    
    public static void main(String[] args) {
        String opcion = "";
        while (!opcion.equals("5")){
            opcion = JOptionPane.showInputDialog("JUEGO\n"
                    + "1. Jugadores\n"
                    + "2. Juego\n");
            if (opcion.equals("1")){
                String subopcion;
                subopcion = JOptionPane.showInputDialog("JUGADORES\n"
                        + "1. Agregar\n"
                        + "2. Listar\n"
                        + "3. Eliminar");
                if (subopcion.equals("1")){
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador");
                    nombre_usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario del jugador");
                    puntos_actuales = 0;
                    lugar_nacimiento = JOptionPane.showInputDialog("Ingrese el lugar de nacimiento del jugador");
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del jugador"));
                    sexo = JOptionPane.showInputDialog("Ingrese la edad del jugador");
                    lista.add(new Jugadores(nombre, nombre_usuario, puntos_actuales, lugar_nacimiento, edad, sexo));
                }
                if (subopcion.equals("2")){
                    String salida = "";
                    for (Object temp : lista) {
                        if (temp instanceof Jugadores) {
                            salida += lista.indexOf(temp) + " " + ((Jugadores) temp) + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, salida);
                }
                if (subopcion.equals("3")){
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion que desea eliminar "));
                    lista.remove(pos);
                }
            }
            if (opcion.equals("2")){
                
            }
        }
    }
}