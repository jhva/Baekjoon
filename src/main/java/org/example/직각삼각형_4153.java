package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class 직각삼각형_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];

        while (true) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            int z = sc.nextInt();
//
//            if (x == 0 && y == 0 && z == 0) {
//                break;
//            }
//
//            if ((x * x + y * y) == z * z) {
//                System.out.println("right");
//            } else if (x * x == (y * y + z * z)) {
//                System.out.println("right");
//            } else if (y * y == (z * z + x * x)) {
//                System.out.println("right");
//            } else {
//                System.out.println("wrong");
//            }
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();

            if (arr[0] + arr[1] + arr[2] == 0) {
                break;
            }
            Arrays.sort(arr);

            if (arr[2] * arr[2] == arr[0] * arr[0] + arr[1] * arr[1]) System.out.println("right");
            else System.out.println("wrong");

        }


    }
}
