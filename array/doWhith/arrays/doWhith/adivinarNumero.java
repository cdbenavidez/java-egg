package arrays.doWhith;

import java.util.Random;
import java.util.Scanner;

//Adivinar el número: Escribir un programa que genere un número 
//aleatorio entre 1 y 100, y muestre por consola un mensaje que 
//le pida al usuario adivinar ese número utilizando un bucle 
//do-while. El programa debe mostrar un mensaje indicando si el 
//número ingresado es mayor o menor que el número aleatorio, y 
//continuar pidiendo al usuario que adivine hasta que lo haga 
//correctamente.
public class adivinarNumero {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
    Random random = new Random();
    int numeroAdivinar = random.nextInt(100)+1;
    int numero;
    do {
        System.out.println("adivine el numero");
        numero = sc.nextInt();
        if (numero > numeroAdivinar) {
            System.out.println("No adivinaste el numero es menor");
         } else if(numero < numeroAdivinar){
            System.out.println("No adivinaste el numero es mayor");
         }else {
            System.out.println("adivinaste el numero ");
         }
        } while (numero != numeroAdivinar);
        sc.close();
    } 
}

