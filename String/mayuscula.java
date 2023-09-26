import java.util.Scanner;

public class mayuscula {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String  palabra ;
        System.out.println("ingrese una palabra");
        palabra = sc.nextLine();
        String mayuscula = palabra.toUpperCase();
        System.out.println("su palabra "+ mayuscula +" fue combertida a mayuscula");
         sc.close();
         
    }
}
