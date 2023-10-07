package ListasEnlazadas.ejercicio12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Calculos {
    public static void main(String[]args) {
        ListaEnlazadaPropia<Double> listaPropia=new ListaEnlazadaPropia<>();

        InputStream inputStream = Calculos.class.getResourceAsStream("numeros");

        if (inputStream == null) {
            System.err.println("Error: El archivo no se pudo encontrar en el paquete.");
        }

        try (BufferedReader lector = new BufferedReader(new InputStreamReader(inputStream))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                double dato = Double.parseDouble(linea);
                listaPropia.insertar(dato);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        double media = listaPropia.calcularMedia();
        double desviacionEstandar = listaPropia.calcularDesviacionEstandar();

        System.out.println("Media: " + media);
        System.out.println("Desviación estándar: " + desviacionEstandar);
    }
}
