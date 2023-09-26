package array.forEach;

import java.util.Random;

//Contar elementos pares: Escribir un programa que cree una 
//variable de tipo array que contenga 10 elementos de tipo 
//entero, inicializandolos con números aleatorios menores 
//a 100 y luego imprimir por consola sus elementos.
public class contarElementosPares {
    public static void main(String[] args) {
        int[] numero = new int[10];
        Random random = new Random();
        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(100);
        }
        System.out.println("elementos de array :");
        for (int numeros : numero) {
            System.out.print(numeros + " ");
        }
        System.out.println();
        int contadorPares = 0;
        for (int numeros : numero) {
            if (numeros % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("cantidad de elementos pares : " + contadorPares);
    }
}
