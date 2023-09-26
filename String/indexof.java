import java.util.Scanner;

public class indexof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra ;
        String letra ;
            System.out.println("ingrese una palabra");
        palabra = sc.nextLine();
        System.out.println("ingrese una letra a buscar");
        letra = sc.nextLine();
        int Index  = palabra.indexOf(letra);
        if (Index != -1) {
            System.out.println("la letra " + letra + " se encuentra en la palabra.");
            
        } else {
             System.out.println("la letra " + letra + "  no se encuentra en la palabra.");
        }
    
        
        sc.close();

       
    }
}
