package ListasEnlazadas.ejercicio11;

public class TablaValores {
    public static void main(String[] args) {
        Polinomio polinomio = new Polinomio();
        polinomio.agregarTermino(3.0, 4);
        polinomio.agregarTermino(-4.0, 2);
        polinomio.agregarTermino(11.0, 0);

        System.out.println("polinomio");
        polinomio.imprimirPolinomio();

        System.out.println("Tabla de valores del polinomio:");
        System.out.println("x           tP(x)");
        for (double x = 0.0; x <= 3.0; x += 1.0) {
            double resultado = polinomio.evaluar(x);
            System.out.println(String.format("%.1f        %.2f", x, resultado));
        }
    }
}

