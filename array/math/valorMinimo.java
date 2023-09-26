package array.math;
//Encontrar el valor mínimo: Escribir un programa que recorra 
//un array de enteros y encuentre el valor mínimo presente en 
//el array.

import java.util.Arrays;

public class valorMinimo {
    public static void main(String[] args) {
    int [] array ={44,77,22,99,55,11};
    Arrays.sort(array) ;
    System.out.println(array[0]);
    }

}
