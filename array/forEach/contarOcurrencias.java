package array.forEach;

import java.util.Scanner;

//tar ocurrencias: Escribir un programa que cree una variable 
//de tipo array que contenga 50 elementos de tipo caracter, 
//inicializar el array con alguna frase elegida y solicitar al 
//usuario un carácter objetivo, y contar cuántas veces aparece 
//el carácter objetivo en  el array e imprimirlo por consola.
public class contarOcurrencias {
    public static void main(String[] args) {
        char[] frase = "hola mundo como estan?? ya deseando que finalice el curso para ponerme a buscar trabajo"
                .toCharArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("elija un caracter para buscar");
        char caracterObjetivo = sc.next().charAt(0);
        int contador = 0;
        for (char caracter : frase) {
            if (caracter == caracterObjetivo) {
                contador++;
            }
        }
        System.out.println("el caracter " + caracterObjetivo + " aparece " + contador + " veses");

        sc.close();
    }
}
