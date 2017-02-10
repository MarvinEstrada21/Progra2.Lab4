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
        Dragon dr = new Dragon();
        Arquero ar = new Arquero();
        String opcion = "";
        while (!opcion.equals("3")) {
            opcion = JOptionPane.showInputDialog("JUEGO\n"
                    + "1. Jugadores\n"
                    + "2. Juego\n"
                    + "3. Salir");
            if (opcion.equals("1")) {
                String subopcion;
                subopcion = JOptionPane.showInputDialog("JUGADORES\n"
                        + "1. Agregar\n"
                        + "2. Listar\n"
                        + "3. Eliminar");
                if (subopcion.equals("1")) {
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador");
                    nombre_usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario del jugador");
                    puntos_actuales = 0;
                    lugar_nacimiento = JOptionPane.showInputDialog("Ingrese el lugar de nacimiento del jugador");
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del jugador"));
                    sexo = JOptionPane.showInputDialog("Ingrese la edad del jugador");
                    lista.add(new Jugadores(nombre, nombre_usuario, puntos_actuales, lugar_nacimiento, edad, sexo));
                }
                if (subopcion.equals("2")) {
                    String salida = "";
                    for (Object temp : lista) {
                        if (temp instanceof Jugadores) {
                            salida += lista.indexOf(temp) + " " + ((Jugadores) temp) + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, salida);
                }
                if (subopcion.equals("3")) {
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion que desea eliminar "));
                    lista.remove(pos);
                }
            }
            if (opcion.equals("2")) {
                String subopcion;
                String[][] tablero = new String[10][10];
                System.out.println(Print(Piezas(tablero)));
                int cont = 0;
                while (cont < 50) {
                    if (cont % 2 == 0) {
                        subopcion = JOptionPane.showInputDialog("Jugador Blanco, ingrese el nombre de la piesa que desea mover");
                        try {
                            if (subopcion.equalsIgnoreCase("arquero")) {
                                try {
                                    int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la primer coordenada"));
                                    int col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la primer coordenada"));
                                    int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la segunda coordenada"));
                                    int col2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la segunda coordenada"));
                                    ar.Mover(tablero, fila, col, fila2, col2);
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "No debe ingresar coordenadas fuera de el tablero");
                                }
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "No debe ingresar coordenadas fuera de el tablero");
                        }
                        try {
                            if (subopcion.equalsIgnoreCase("dragon")) {
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la primer coordenada"));
                                int col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la primer coordenada"));
                                int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la segunda coordenada"));
                                int col2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la segunda coordenada"));
                                dr.Mover(tablero, fila, col, fila2, col2);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "No debe ingresar coordenadas fuera de el tablero");
                        }
                        try {
                            if (subopcion.equalsIgnoreCase("caballero")) {
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la primer coordenada"));
                                int col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la primer coordenada"));
                                int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la segunda coordenada"));
                                int col2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la segunda coordenada"));
                                ar.Mover(tablero, fila, col, fila2, col2);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "No debe ingresar coordenadas fuera de el tablero");
                        }
                        try {
                            if (subopcion.equalsIgnoreCase("mago")) {
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la primer coordenada"));
                                int col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la primer coordenada"));
                                int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la segunda coordenada"));
                                int col2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la segunda coordenada"));
                                ar.Mover(tablero, fila, col, fila2, col2);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "No debe ingresar coordenadas fuera de el tablero");
                        }
                        try {
                            if (subopcion.equalsIgnoreCase("rey")) {
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la primer coordenada"));
                                int col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la primer coordenada"));
                                int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la segunda coordenada"));
                                int col2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la segunda coordenada"));
                                ar.Mover(tablero, fila, col, fila2, col2);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "No debe ingresar coordenadas fuera de el tablero");
                        }
                        try {
                            if (subopcion.equalsIgnoreCase("duende")) {
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la primer coordenada"));
                                int col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la primer coordenada"));
                                int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la segunda coordenada"));
                                int col2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la segunda coordenada"));
                                ar.Mover(tablero, fila, col, fila2, col2);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "No debe ingresar coordenadas fuera de el tablero");
                        }
                    } else {
                        subopcion = JOptionPane.showInputDialog("Jugador Negro, ingrese el nombre de la piesa que desea mover");
                        try {
                            if (subopcion.equalsIgnoreCase("arquero")) {
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la primer coordenada"));
                                int col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la primer coordenada"));
                                int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la segunda coordenada"));
                                int col2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la segunda coordenada"));
                                ar.Mover(tablero, fila, col, fila2, col2);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "No debe ingresar coordenadas fuera de el tablero");
                        }
                        try {
                            if (subopcion.equalsIgnoreCase("dragon")) {
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la primer coordenada"));
                                int col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la primer coordenada"));
                                int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la segunda coordenada"));
                                int col2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la segunda coordenada"));
                                dr.Mover(tablero, fila, col, fila2, col2);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "No debe ingresar coordenadas fuera de el tablero");
                        }
                        try {
                            if (subopcion.equalsIgnoreCase("caballero")) {
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la primer coordenada"));
                                int col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la primer coordenada"));
                                int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la segunda coordenada"));
                                int col2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la segunda coordenada"));
                                ar.Mover(tablero, fila, col, fila2, col2);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "No debe ingresar coordenadas fuera de el tablero");
                        }
                        try {
                            if (subopcion.equalsIgnoreCase("mago")) {
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la primer coordenada"));
                                int col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la primer coordenada"));
                                int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la segunda coordenada"));
                                int col2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la segunda coordenada"));
                                ar.Mover(tablero, fila, col, fila2, col2);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "No debe ingresar coordenadas fuera de el tablero");
                        }
                        try {
                            if (subopcion.equalsIgnoreCase("rey")) {
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la primer coordenada"));
                                int col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la primer coordenada"));
                                int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la segunda coordenada"));
                                int col2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la segunda coordenada"));
                                ar.Mover(tablero, fila, col, fila2, col2);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "No debe ingresar coordenadas fuera de el tablero");
                        }
                        try {
                            if (subopcion.equalsIgnoreCase("duende")) {
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la primer coordenada"));
                                int col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la primer coordenada"));
                                int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la segunda coordenada"));
                                int col2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la segunda coordenada"));
                                ar.Mover(tablero, fila, col, fila2, col2);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "No debe ingresar coordenadas fuera de el tablero");
                        }
                    }
                    System.out.println(Print(tablero));
                    cont++;
                }
            }
        }
    }

    public static String Print(String[][] t) {
        String c = "";
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                c = c + "[ " + t[i][j] + " ]";
            }//Fin for
            c += "\n";
        }//Fin for
        return c;
    }//Fin del metodo Print

    public static String[][] Piezas(String[][] x) {
        String a = "";
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (i == 0 && (j == 0 || j == x.length - 1)) {
                    x[i][j] = "C-B";
                } else if (i == 0 && (j == 2 || j == x.length - 3)) {
                    x[i][j] = "F-B";
                } else if (i == 0 && (j == 3 || j == x.length - 4)) {
                    x[i][j] = "A-B";
                } else if (i == 0 && j == 4) {
                    x[i][j] = "R-B";
                } else if (i == 0 && j == 5) {
                    x[i][j] = "M-B";
                } else if (i == 1) {
                    if (j == 0 || j == 3 || j == x.length - 4 || j == x.length - 1) {
                        x[i][j] = "D-B";
                    } else if (j == 2 || j == x.length - 3) {
                        x[i][j] = "A-B";
                    } else if (j == 4) {
                        x[i][j] = "C-B";
                    } else if (j == 5) {
                        x[i][j] = "F-B";
                    } else {
                        x[i][j] = "   ";
                    }
                } else if (i == x.length - 1) {
                    if (j == 0 || j == x.length - 1) {
                        x[i][j] = "C-N";
                    } else if (j == 2 || j == x.length - 3) {
                        x[i][j] = "F-N";
                    } else if (j == 3 || j == x.length - 4) {
                        x[i][j] = "A-N";
                    } else if (j == 4) {
                        x[i][j] = "M-N";
                    } else if (j == 5) {
                        x[i][j] = "R-N";
                    } else {
                        x[i][j] = "   ";
                    }
                } else if (i == x.length - 2) {
                    if (j == 0 || j == 3 || j == x.length - 4 || j == x.length - 1) {
                        x[i][j] = "D-N";
                    } else if (j == 2 || j == x.length - 3) {
                        x[i][j] = "A-N";
                    } else if (j == 4) {
                        x[i][j] = "F-N";
                    } else if (j == 5) {
                        x[i][j] = "C-N";
                    } else {
                        x[i][j] = "   ";
                    }
                } else {
                    x[i][j] = "   ";
                }
            }
        }
        return x;
    }
}
