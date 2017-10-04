package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер масива: ");
        int myArrayInt = in.nextInt();
        int[] myArrayInt1 = new int[myArrayInt];
        for (int i =0; i < myArrayInt; i++){
            System.out.println("Введите число №" + (i+1));
            myArrayInt1[i] = in.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i=0; i < myArrayInt1.length; i++){
            min = Math.min(min,myArrayInt1[i]);
        }
        System.out.println("Минимальное число массива: " + min);

        int max = Integer.MIN_VALUE;
        for (int i=0; i < myArrayInt1.length; i++){
            max = Math.max(max,myArrayInt1[i]);
        }
        System.out.println("Максимальное число массива: " + max);

        int x = 5;
        int count = 0;
        for (int i=0; i < myArrayInt1.length; i++){
            if (myArrayInt1[i] == x){
                count++;
            }
        }
        System.out.println("Количество повторений числа 5 будет - " + count);

        Arrays.sort(myArrayInt1);
        System.out.println("Отсортированный массив" + Arrays.toString(myArrayInt1));
    }
}
