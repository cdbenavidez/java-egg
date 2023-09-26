package desafiosintegradores;
import java.util.Scanner;

public class contraseñaSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una contraseña: ");
        String contrasena = scanner.nextLine();

        String requisitosFaltantes = obtenerRequisitosFaltantes(contrasena);

        if (requisitosFaltantes.isEmpty()) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura. Le faltan los siguientes requisitos: " + requisitosFaltantes);
        }

        scanner.close();
    }

    public static String obtenerRequisitosFaltantes(String contrasena) {
        StringBuilder requisitosFaltantes = new StringBuilder();

        if (contrasena.length() < 8) {
            requisitosFaltantes.append("mínimo 8 caracteres, ");
        }

        if (!contieneLetraMayuscula(contrasena)) {
            requisitosFaltantes.append("una letra mayúscula, ");
        }

        if (!contieneLetraMinuscula(contrasena)) {
            requisitosFaltantes.append("una letra minúscula, ");
        }

        if (!contieneNumero(contrasena)) {
            requisitosFaltantes.append("un número, ");
        }

        if (!contieneCaracterEspecial(contrasena)) {
            requisitosFaltantes.append("un carácter especial, ");
        }

        return requisitosFaltantes.toString().replaceAll(", $", "");
    }

    public static boolean contieneLetraMayuscula(String contrasena) {
        for (char caracter : contrasena.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contieneLetraMinuscula(String contrasena) {
        for (char caracter : contrasena.toCharArray()) {
            if (Character.isLowerCase(caracter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contieneNumero(String contrasena) {
        for (char caracter : contrasena.toCharArray()) {
            if (Character.isDigit(caracter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contieneCaracterEspecial(String contrasena) {
        String caracteresEspeciales = "!@#$%^&*()-_=+[]{}|;:,.<>?";
        for (char caracter : contrasena.toCharArray()) {
            if (caracteresEspeciales.indexOf(caracter) != -1) {
                return true;
            }
        }
        return false;
    }
}
