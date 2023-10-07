package ListasEnlazadas.ejercicio11;

public class Polinomio {

    private Nodo primero;

    public Polinomio() {
        this.primero = null;
    }

    public void agregarTermino(double coeficiente, int exponente) {
        Nodo nuevoNodo = new Nodo(coeficiente, exponente);
        if (primero == null) {
            primero = nuevoNodo;
        } else {
            Nodo actual = primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public double evaluar(double x) {
        double resultado = 0.0;
        Nodo actual = primero;
        while (actual != null) {
            resultado += actual.coeficiente * Math.pow(x, actual.exponente);
            actual = actual.siguiente;
        }
        return resultado;
    }
    public void imprimirPolinomio() {
        if (primero == null) {
            System.out.println("Polinomio vacío");

        }
        Nodo actual = primero;
        boolean primerTermino = true;
        while (actual != null) {
            if (!primerTermino) {
                if (actual.coeficiente >= 0) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.print(Math.abs(actual.coeficiente));
            if (actual.exponente > 0) {
                System.out.print("x^" + actual.exponente);
            }

            primerTermino = false;
            actual = actual.siguiente;
        }

        System.out.println();
    }
}
