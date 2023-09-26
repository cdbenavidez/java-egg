import java.util.Scanner;

public class valorAbsoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("coloque un numero ");
        int numero = sc.nextInt();

        int absoluto = Math.abs(numero);

        System.out.println("el valor absoluto de "+ numero+" es "+ absoluto);
        sc.close();
    }
}
