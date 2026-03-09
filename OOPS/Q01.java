//Write a Java program that sorts the given array elements in ascending order 
// (use any sorting technique of your choice). Use the following array elements:
// {98.87, 45.24, 39.71, 43.89, 10.09, 47.92, 47.84, 21.17, 38.51, 62.38, 71.39, 40.34, 28.54, 72.45, 59.31, 72.39, 87.34, 58.35, 71.21}

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        double[] arr = new double[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        // Sorting (Bubble Sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
