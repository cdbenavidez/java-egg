package array.buclesYArrays;
//Comparar arreglos: Escribir un programa que compare 
//dos arreglos de enteros utilizando el método 
//Arrays.equals(). El programa debe imprimir si los 
//arreglos son iguales o no.

import java.util.Arrays;

public class compararArray {
    public static void main(String[] args) {
        int[] array1 = {23,56,98,23,56,12};
        int[] array2 = {23,56,98,23,56,12};
        if (Arrays.equals(array1 , array2)) {
            System.out.println("los arreglos son iguales");
        } else {
            System.out.println("los arreglos no son iguales");
        }
    
    }
    
}
