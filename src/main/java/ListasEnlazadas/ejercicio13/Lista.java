package ListasEnlazadas.ejercicio13;

public class Lista {

    NodoLista inicio;

    public Lista() {
        inicio=null;
    }
    public int maximaDistancia(int x) {
        return maximaDistanciaRecursivo(inicio, x, 0, 0);
    }

    private int maximaDistanciaRecursivo(NodoLista nodo, int x, int distancia, int maximaDistancia) {
        if (nodo == null)
            return maximaDistancia;

        if (nodo.clave == x) {
            if (distancia != 0) {
                maximaDistancia = Math.max(maximaDistancia, distancia);
                distancia = 0;
            }
            return maximaDistanciaRecursivo(nodo.siguiente, x, 1, maximaDistancia);
        }
        return maximaDistanciaRecursivo(nodo.siguiente, x, distancia + 1, maximaDistancia);
    }

}

