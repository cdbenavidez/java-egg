package array.buclesYArrays;

import java.util.Scanner;

//Copiar parte de un arreglo: Crear un programa en Java 
//que declare y muestre un arreglo de enteros junto 
//con sus índices. Luego, el programa debe solicitar al 
//usuario dos índices: un índice inicial y un índice 
//final. Con estos dos índices, el programa debe copiar 
//la parte del arreglo original comprendida entre estos 
//dos índices (inclusive) en un nuevo arreglo utilizando
// el método Arrays.copyOfRange(). Asegúrese de incluir
// validaciones para confirmar que el índice inicial es 
//menor que el índice final y que ambos índices estén 
//dentro del rango válido del arreglo original. 
//Finalmente, el programa debe imprimir el nuevo arreglo
// por consola.
public class copiarParteadeunArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo ={ 10,20,30,40,50,60,70,80,90,100};
        System.out.println("arreglo original");
        copiaArreglo(arreglo);

        System.out.println("ingrese indice inicial");
     int indiceInicial =  sc.nextInt();
     System.out.println("ingrese indice final");
     int indiceFinal = sc.nextInt();

        if (indiceInicial<0 || indiceFinal> arreglo.length|| indiceInicial>indiceFinal) {
            System.out.println("los indices ingresados no son validos ");
            sc.close();
            return;
        }
    }
}
