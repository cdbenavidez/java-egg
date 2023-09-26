package array.forts;

public class invertirArrays {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6};
        int Longitud = array.length;
        for(int i = 0; i < Longitud /2; i++){
            int temp = array[i];
            array[i]= array[Longitud-1-i];
            array[Longitud-1-i] = temp;
        }
            System.out.println("arrays invertido");
            for(int elemento : array){
                System.out.print(elemento + " ");
            
        } 
    }
}
