import java.util.Scanner;

public class pedirnombre1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("ingrese su nombre y apellido");
        nombre = sc.nextLine();
        System.out.println("su nombre y apellido es "+ nombre);
        sc.close();
    }
    
}
