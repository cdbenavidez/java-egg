import java.util.Scanner;
 
public class nombeYEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad ;
        String nombre ;
        System.out.println("ingrese su nombre y apellido");
        nombre = sc.nextLine();
        System.out.println("ingrede su edad"); 
        edad = sc.nextInt();
        System.out.println("usted se llama "+ nombre + " y tiene una edad de "+ edad +" años");       
        sc.close();        
    }
    
}
