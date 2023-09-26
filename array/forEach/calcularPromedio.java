package array.forEach;

import java.util.Arrays;
import java.util.Random;

//Calcular promedio: Crear un array de 20 elementos de tipo float,
// inicializar con los números que prefiera y  sumar todos los
// elementos del array de números reales y calcular su promedio
// e imprimir en consola el resultado de la suma y el resultado
// del promedio de los elementos.
public class calcularPromedio {
    public static void main(String[] args) {
        float[] numeroAleatorio = new float[20]; 
        Random random = new Random();
        for (int i = 0; i < numeroAleatorio.length; i++) {
            numeroAleatorio[i] = random.nextFloat();
        }
        float suma = 0;
        for(float numero : numeroAleatorio){
            suma += numero ;
        }
        float promedio = suma / numeroAleatorio.length;
        System.out.println(Arrays.toString(numeroAleatorio));
        System.out.println("suma de los elementos tipo float "+ suma);
        System.out.println("promedio de los elementos tipo float "+ promedio);
    }
}
