package arrays.doWhith;

import java.util.Scanner;

//Número de dígitos: Escribe un programa que le pida al usuario 
//un número entero y utilice un bucle while para calcular el 
//número de dígitos de ese número. Por ejemplo, el número 4578 
//tiene 4 dígitos (pensar en la lógica para el 0 que debe devolver
// que tiene una cifra y también para que se cuenten las cifras de 
//números negativos). 
public class cantidadDeDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIngresado;
        int Digitos= 0;
        System.out.println("ingrese un numero");
        numeroIngresado = sc.nextInt();
        
        if (numeroIngresado< 0) {
            numeroIngresado = -numeroIngresado;
        }
        if (numeroIngresado==0) {
            Digitos = 1;
          } else{
            while (numeroIngresado > 0) {
                numeroIngresado = numeroIngresado / 10;
          Digitos++;
          }
            }
          
          System.out.println("el numero tiene "+Digitos+" digitos");
          sc.close();
    }
}
