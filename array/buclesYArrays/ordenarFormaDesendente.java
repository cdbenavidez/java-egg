package array.buclesYArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
//Ordenar en forma descendente: Escribir un programa en el cual 
//se declare una variable array que contenga 10 elementos de tipo 
//entero,inicializar el arreglo con valores aleatorios entre 1 y 
//100, imprimir por consola el arreglo inicial y luego  ordenar 
//el arreglo de enteros en forma descendente utilizando el método
// Arrays.sort().  y luego imprimirlos ordenados en la consola.
public class ordenarFormaDesendente {

    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100)+1;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.toString(array));
    }
}
