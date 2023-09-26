package array.math;
import java.util.Arrays;

public class promedioElementos {
 
    public static void main(String[] args) {
        int[] array = {10, 25, 38};
        double promedio = calcularPromedio(array);
        System.out.println("El promedio de los elementos del arreglo es: " + promedio);
    }

    public static double calcularPromedio(int[] array) {
        return Arrays.stream(array)  // Usamos Arrays.stream para crear un flujo de elementos
                .average()  // Calculamos el promedio usando el método average()
                .orElse(0.0);  // Si no hay elementos, el promedio es 0.0
    }
}


