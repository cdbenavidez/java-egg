package array.forEach;
//Concatenar elementos: Crear un array del tamaño que prefiera 
//que contenga elementos de tipo cadena y concatenar los
// elementos en una sola cadena separada por espacios e 
//imprimirlo en consola.
public class concatenacionDePalabra {
    public static void main(String[] args) {
        String[] palabras ={"Hola", "como", "estas", "en", "tu", "dia"};
        String concatenacion = "";
       
        for(String  palabra : palabras){
        concatenacion += palabra + " ";
    }
    System.out.println("concatenacion de elementos :");
    System.out.println(concatenacion);
}
}