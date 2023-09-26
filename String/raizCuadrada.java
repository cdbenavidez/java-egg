import java.util.Scanner;

//Ejercicio de cálculo de raíz cuadrada: Escribir un programa 
//que solicite al usuario un número positivo y calcule su raíz 
//cuadrada utilizando el método sqrt() de la clase Math. Si el 
//número ingresado es negativo, mostrar un mensaje adecuado en 
//pantalla.

public class raizCuadrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        double raizcuadrada ;
        System.out.println("ingrese un numero");
        numero = sc.nextInt();
        if (numero <=0){
            System.out.println("no se puede hacer raiz cuadrada ");
        }
        else{
        raizcuadrada = Math.sqrt(numero);
        System.out.println("la raiz cuadrada de "+ numero + " es igual "+ raizcuadrada);
        sc.close();
    }
    }
}