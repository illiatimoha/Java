import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main
{
    public static void main(String[] args)
    {
        int[] array = {2, 2, 4, 6, 6, 7, 2, 4, 7, 3};
        System.out.println("Array :" + Arrays.toString(array));
        int count = 0;
        for(int i = 0; i < array.length; i++){
            boolean newNum = true;
            for(int j = 0; j < i; j++){
                if(array[j] == array[i]){
                    newNum = false;
                    break;
                }
            }
            if( newNum == true){
                count++;
            }
        }
        System.out.println("Кількість різних чисел: " + count);
    }
}
