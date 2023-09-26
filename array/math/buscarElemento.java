package array.math;

import java.util.Arrays;
import java.util.Scanner;

public class buscarElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {1,2,3};
        int numeroBuscado;
        System.out.println("porfavor ingrese un numero entero");
        numeroBuscado= sc.nextInt();
        boolean encontrado = Arrays.stream(numeros)
        .anyMatch(numero-> numero == numeroBuscado);
        if (encontrado) {
            System.out.println("el numero buscado esta en el arreglo");
        } else {
            System.out.println("en numero buscado no se encuentra en el arreglo");
        } sc.close();
        
        
    }
}
