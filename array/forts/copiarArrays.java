package array.forts;

import java.util.Arrays;

//Copiar elementos:  Escribir un programa que cree un array 
//de 3 enteros y cree una copia del mismo pero con un tamaño 
//extra de 2 elementos, imprimiendo el contenido del nuevo 
//array por consola, sin usar el bucle for.

public class copiarArrays {
    public static void main(String[] args) {
        int[] enteros = {1,2,3};
       int [] nuevoEntero = new int[enteros.length +2];
        System.arraycopy(enteros, 0, nuevoEntero, 0, enteros.length);
        System.out.println(Arrays.toString(nuevoEntero));
    }
}
