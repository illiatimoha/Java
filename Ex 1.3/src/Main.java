import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {-2, -1, 4, 6, -1, 5, 7, 2, 4, 12};
        System.out.print("Масив: " + Arrays.toString(array));

        int product = 1;
        for(int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                product *= array[i];
            }
        }
        System.out.println();
        System.out.println("Добуток елем. з парним номером: " + product);

        int sum = 0;
        for(int i = 1; i < array.length - 1; i++){
            sum += array[i];
        }
        System.out.println("Сума елем. між першим та останнім елементом: " + sum);

        int temp;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < i; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Відсортований масив: " + Arrays.toString(array));

    }
}