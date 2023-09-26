
import java.util.Arrays;
import java.util.Scanner;
//Ordenar elementos:  Escribir un programa que solicite al usuario 
//4 nombres, lo cuales debes ordenar alfabeticamente y luego 
//imprimirlos en consola, sin usar el bucle for.
public class ordenarElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[+4];
        int contador =0;
        System.out.println("ingrese primer nombre");
        nombres[contador++] = sc.nextLine();
        System.out.println("ingrese segundo nombre");
        nombres[contador++] = sc.nextLine();
        System.out.println("ingrese tercer nombre");
        nombres[contador++] = sc.nextLine();
        System.out.println("ingrese cuarto nombre");
        nombres[contador] = sc.nextLine();
        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));
        sc.close();

    }
}
