package desafiosintegradores;
import java.util.Scanner;

public class comvertirTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura;
        String medida;

        try {
            System.out.println("Ingrese una unidad de medida (C para Celsius o F para Fahrenheit):");
            medida = sc.nextLine().toUpperCase();
            System.out.println("Ingrese la temperatura:");
            temperatura = sc.nextDouble();

            if (medida.equals("C")) {
                double gradosFahrenheit = (temperatura * 9/5) + 32;
                System.out.println(temperatura + " grados Celsius equivalen a " + gradosFahrenheit + " grados Fahrenheit.");
            } else if (medida.equals("F")) {
                double gradosCelsius = (temperatura - 32) * 5/9;
                System.out.println(temperatura + " grados Fahrenheit equivalen a " + gradosCelsius + " grados Celsius.");
            } else {
                System.out.println("ERROR: Unidad de medida incorrecta. Use C para Celsius o F para Fahrenheit.");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Temperatura inválida. Ingrese una temperatura numérica.");
        }

        sc.close();
    }
}
