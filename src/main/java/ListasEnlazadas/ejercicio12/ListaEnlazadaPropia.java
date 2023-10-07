package ListasEnlazadas.ejercicio12;

import java.util.Iterator;

public class ListaEnlazadaPropia<T> implements Iterable<T> {

    private Nodo<T> nodoPrimero;
    private Nodo<T> nodoUltimo;
    private int tamanio;

    public ListaEnlazadaPropia() {
        nodoPrimero = null;
        nodoUltimo = null;
        tamanio = 0;
    }

    public void insertar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (nodoPrimero == null) {
            nodoPrimero = nuevoNodo;
            nodoUltimo = nuevoNodo;
        } else {
            nodoUltimo.siguiente = nuevoNodo;
            nodoUltimo = nuevoNodo;
        }
        tamanio++;
    }

    public double calcularMedia() {
        if (tamanio == 0)
            return 0.0;

        double suma = 0.0;
        Nodo<T> actual = nodoPrimero;
        while (actual != null) {
            if (actual.getDato() instanceof Number) {
                suma += ((Number) actual.getDato()).doubleValue();
            }
            actual = actual.getSiguiente();
        }
        return suma / tamanio;
    }

    public double calcularDesviacionEstandar() {
        if (tamanio <= 1)
            return 0.0;

        double media = calcularMedia();
        double sumaCuadrados = 0.0;
        Nodo<T> actual = nodoPrimero;

        while (actual != null) {
            if (actual.getDato() instanceof Number) {
                double valor = ((Number) actual.getDato()).doubleValue();
                sumaCuadrados += Math.pow(valor - media, 2);
            }
            actual = actual.getSiguiente();
        }
        return Math.sqrt(sumaCuadrados / (tamanio - 1));
    }


    public int getTamanio() {
        return tamanio;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Nodo<T> nodoActual = nodoPrimero;

            @Override
            public boolean hasNext() {
                return nodoActual != null;
            }

            @Override
            public T next() {
                T dato = nodoActual.dato;
                nodoActual = nodoActual.siguiente;
                return dato;
            }
        };
    }
}