package arrays.doWhith;

import java.util.Scanner;

//Menú interactivo con while: Crea un menú interactivo que contenga
// 5 opciones que pueda elegir el usuario, por ejemplo:
//Comprar producto.
//Realizar devolución
//Ver mis Pedidos.
//Preguntas frecuentes.
//Salir.
//Luego solicite al usuario que elija una opción del conjunto 
//de opciones mostradas por pantalla. El menú debe seguir 
//apareciendo hasta que el usuario elija la opción para salir 
//del programa. Para este ejercicio, no es necesario que las 
//opciones del menú realicen acciones reales. Solo necesitas 
//mostrar un mensaje que indique qué opción eligió el usuario.
public class menuInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opciones;
        while (true) {
            System.out.println("menu");
            System.out.println("1. Comprar productos");
            System.out.println("2. Realizar devolucion");
            System.out.println("3. Ver mis pedidos");
            System.out.println("4. Preguntas frecuentes");
            System.out.println("5. Salir");

            System.out.println("Elija una opcion");
            opciones = sc.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("ha elegido : Comprar productos");
                    break;
                case 2:
                    System.out.println("ha elegido : Realizar devolucion");
                    break;
                case 3:
                    System.out.println("ha elegido : Ver mis pedidos");
                    break;
                case 4:
                    System.out.println("ha elegido : Preguntas frecuentes");
                    break;
                case 5:
                    sc.close();
                    System.out.println("ha elegido : Salir");
                    return;
                default:
                    System.out.println("opcion no valida , por favor seleccione una opcion valida");
                    break;
            }
        }

    }
}