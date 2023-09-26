package array.math;

import java.util.Arrays;
import java.util.OptionalInt;

public class maxArrays {
    public static void main(String[] args) {
        int[] array = {43,56,102};
        OptionalInt max = Arrays.stream(array)
        .max();
        if (max.isPresent()) {
            System.out.println("el valor maximo es "+ max.getAsInt());
        } else {
            System.out.println("el arreglo esta vacio");
        }

    }
}
