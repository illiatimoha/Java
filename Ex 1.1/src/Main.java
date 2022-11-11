import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] array = new int[15];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(-5, 50);
        }
        System.out.println("Array :" + Arrays.toString(array));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Array numbers bigger than " + num + ": ");
        for(int i = 0; i < array.length; i++){
            if(array[i] > num){
                System.out.print(array[i] + " ");
            }
        }
    }
}
