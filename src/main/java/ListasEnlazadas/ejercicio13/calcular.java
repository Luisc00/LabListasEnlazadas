package ListasEnlazadas.ejercicio13;

public class calcular {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inicio = new NodoLista(9, new NodoLista(4, new NodoLista(6, new NodoLista(8, new NodoLista(4, new NodoLista(5,new NodoLista(4, null))))))); // Ejemplo de lista
        int claveBuscada = 4;

        int maxDistancia = lista.maximaDistancia(claveBuscada);

        System.out.println("La máxima distancia entre elementos que contienen la clave " + claveBuscada + " es: " + maxDistancia);
    }
}

