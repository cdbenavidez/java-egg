package array.math;

import java.util.Arrays;

//Calcular suma acumulada: Escribir un programa que recorra un 
//array de enteros y calcule la suma acumulada de los elementos,
//reemplazando cada elemento por la suma acumulada hasta ese punto.
public class sumaAcumulada {
    public static void main(String[] args) {
        int[] array = { 22,33,44,55,66};
        int sumaAcumulada = 0;
        for ( int i = 0; i < array.length; i++) {
            sumaAcumulada += array[i];
            array[i] = sumaAcumulada;
            System.out.println(Arrays.toString(array));
        }
    }
}
