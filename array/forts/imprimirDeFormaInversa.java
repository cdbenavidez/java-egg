package array.forts;
//Imprimir elementos en orden inverso: Escribir un programa que 
//recorra un array de enteros y los imprima en orden inverso, 
//comenzando desde el último elemento.


public class imprimirDeFormaInversa {
    public static void main(String[] args) {
        int[] array = {11,22,33,44,55,66,77,88,99};
        for(int i = array.length -1; i>=0 ; i--){
            System.out.print(array[i]+ ", ");
        }
    }
}
