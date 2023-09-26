package array.math;
import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero ;
    int numero2 ;
    int opcion ;
    System.out.println("ingrese un numero");
    numero = sc.nextInt();
    System.out.println("ungrese otro numero");
    numero2 = sc.nextInt();
    System.out.println("saeleccione una opcion");
    System.out.println(" opcion 1 SUMA"); 
    System.out.println("opcion 2 RESTA");
    System.out.println("opcion 3 MULTIPLICACION");
    System.out.println("opcion 4 DIVICION");
    opcion = sc.nextInt();
    if ( opcion == 1) {
        System.out.println(numero +" + "+ numero2 +" = " +(numero+numero2));
    } else if (opcion == 2){
    System.out.println(numero +" - "+ numero2 +" = " +(numero-numero2));
    } else if (opcion ==3){
        System.out.println(numero +" * "+ numero2 +" = " +(numero*numero2));
    } else if (opcion == 4){
        System.out.println(numero +" / "+ numero2 +" = " +(numero/numero2));
    }else{ 
    System.out.println("opcion incorrecta seleccione una del 1 al 4");
    }sc.close();
}
}