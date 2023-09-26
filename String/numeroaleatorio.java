
//Ejercicio de generación de números aleatorios: 
//Escribir un programa que genere y muestre en pantalla 
//un número aleatorio en el rango del 1 al 100 utilizando 
//el método random() de la clase Math. Puedes utilizar el 
//método floor() para redondear el número aleatorio hacia abajo.


public class numeroaleatorio {
    public static void main(String[] args) {
        
        double numeroAleatorio = Math.random()*100;

        int redondeo = (int) Math.floor(numeroAleatorio)+1;

        System.out.println("numero aleatorio generado es : "+ redondeo);

    }
    
}
