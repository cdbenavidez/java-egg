import java.util.Scanner;
//ejercicio de redondeo de números: Escribir un programa que s
//olicite al usuario un número decimal y muestre en pantalla 
//su valor redondeado utilizando el método round() de la clase 
//Math.

public class redondeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero decimal");
        double decimal = sc.nextDouble();
        long entero = Math.round(decimal);
        System.out.println("el numero redondeado de " + decimal + " es " + entero);
        sc.close();
    }

}
