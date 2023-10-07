package ListasEnlazadas.ejercicio2;

public class Persona {

    private int cedula;
    private String nombre;

    public Persona(int cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Persona [cedula=");
        builder.append(cedula);
        builder.append(", nombre=");
        builder.append(nombre);
        builder.append("]");
        return builder.toString();
    }


}
