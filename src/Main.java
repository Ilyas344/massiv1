import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("1 задание");
        int[] array1 = new int[]{1, 2, 3};

        double[] array2 = {1.57, 7.654, 9.986};

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи размер массива");
        int size = sc.nextInt();
        Random rnd = new Random();
        int[] array3 = new int[size];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = rnd.nextInt(100);
            System.out.printf("array3[%d]=%d ", i, array3[i]);
        }
        System.out.println("\n2 задание");
        for (int i = 0; i <= array1.length - 1; i++) {
            System.out.print(array1[i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i <= array2.length - 1; i++) {
            System.out.print(array2[i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i <= array3.length - 1; i++) {
            System.out.print(array3[i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\n\n3 задание");
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("\n\n4 задание");

        for (int i = 0; i <= array1.length - 1; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}



