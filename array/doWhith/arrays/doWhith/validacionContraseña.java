package arrays.doWhith;

import java.util.Scanner;

//Validación de contraseña: Escribir un programa que solicite al 
//usuario ingresar una contraseña y la valide usando un bucle
// while. La contraseña correcta es "secreto". El programa debe 
//seguir pidiendo al usuario que ingrese la contraseña hasta que 
//sea correcta.
public class validacionContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseñaCorrecta = "secreto";
        String contraseñaIngresada;

        System.out.println("ingrese la contraseña");
        while (true) {
            contraseñaIngresada = sc.nextLine();
            if (contraseñaIngresada.equals(contraseñaCorrecta)) {
                System.out.println("la contraseña ingresada es correcta acceso concebido");
                break;
            } else {
                System.out.println("la contraseña ingresada es incorrecta, por favor coloque la contraseña correcta");
            }

        }
        sc.close();
    }
}
