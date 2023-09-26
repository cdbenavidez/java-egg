package array.buclesYArrays;

import java.util.Arrays;
import java.util.Scanner;

//Búsqueda binaria: La búsqueda binaria es un algoritmo eficiente 
//para encontrar un elemento en una lista ordenada de elementos. 
//La clase Arrays ya tiene su implementación mediante el método 
//binarySearch().  Escribir un programa que realice una búsqueda
// binaria en un arreglo ordenado de enteros utilizando el método
// Arrays.binarySearch(). El programa debe imprimir el arreglo 
//generado originalmente, solicitar al usuario el valor buscado,
// e imprimir el índice del valor buscado si está presente en el 
//arreglo
public class busquedaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("el arreglo original es : "+ Arrays.toString(array));

        System.out.println("ingrese el valor a buscar");
        int valorABuscar = sc.nextInt();

        int indice = Arrays.binarySearch(array , valorABuscar);
        if (indice >= 0) {
            System.out.println("el valor buscado "+ valorABuscar+" se encuentra en el indice "+ indice );
            
        } else {
            System.out.println("el valor buscado "+ valorABuscar +" no se encuentra en el arreglo");
        } sc.close();
    }
}
