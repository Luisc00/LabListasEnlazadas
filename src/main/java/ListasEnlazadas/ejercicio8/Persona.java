package ListasEnlazadas.ejercicio8;

public class Persona {
    private int cedula;
    private String nombre;

    public Persona(int cedula) {
        this.cedula = cedula;

    }

    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("cedula=").append(cedula);
        sb.append('}');
        return sb.toString();
    }
}
