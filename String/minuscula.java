 import java.util.Scanner;
public class minuscula {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String  palabra ;
        System.out.println("ingrese una palabra");
        palabra = sc.nextLine();
        String minuscula = palabra.toLowerCase();
        System.out.println("su palabra "+ minuscula +" fue comvertida a minuscula");
         sc.close();
         
    }
}

