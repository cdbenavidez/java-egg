import java.util.Scanner;

//Ejercicio de cálculo de potencia: Escribir un programa 
//que solicite al usuario dos números enteros, representando 
//la base y el exponente, y calcular el resultado de elevar 
//la base al exponente utilizando el método pow() de la clase 
//Math. Mostrar el resultado en pantalla
public class potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double exponente;
        System.out.println("ingrese un numero para la base");
        base = sc.nextDouble();
        System.out.println("ingrese un numero para el exponente");
        exponente = sc.nextDouble();
        double resultado = Math.pow(base, exponente);
        
        System.out.println(base+" elevado "+exponente +" nos da como resultado: "+ resultado);
            sc.close();
    }
}
