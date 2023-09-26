import java.util.Scanner;

public class pedirNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero");
        numero = sc.nextInt();
        System.out.println("el numero ingresado es "+ numero);
        sc.close();
    }
    
}
