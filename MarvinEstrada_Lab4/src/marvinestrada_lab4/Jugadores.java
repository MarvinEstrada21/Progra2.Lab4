package marvinestrada_lab4;
public class Jugadores {
    private String nombre;
    private String nombre_usuario;
    private int puntos_actuales;
    private String lugar_nacimiento;
    private int edad;
    private String sexo;

    public Jugadores() {
    }

    public Jugadores(String nombre, String nombre_usuario, int puntos_actuales, String lugar_nacimiento, int edad, String sexo) {
        this.nombre = nombre;
        this.nombre_usuario = nombre_usuario;
        this.puntos_actuales = puntos_actuales;
        this.lugar_nacimiento = lugar_nacimiento;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getPuntos_actuales() {
        return puntos_actuales;
    }

    public void setPuntos_actuales(int puntos_actuales) {
        this.puntos_actuales = puntos_actuales;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", nombre_usuario=" + nombre_usuario + ", puntos_actuales=" + puntos_actuales + ", lugar_nacimiento=" + lugar_nacimiento + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
}