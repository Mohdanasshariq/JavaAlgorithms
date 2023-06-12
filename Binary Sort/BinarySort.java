import java.util.Arrays;

import java.util.Scanner;

public class BinarySort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the input values

        System.out.print("Enter the number of elements: ");

        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {

            array[i] = scanner.nextInt();

        }

        // Sort the array using binary sort

        binarySort(array);

        // Print the sorted array

        System.out.println("Sorted array:");

        System.out.println(Arrays.toString(array));

        scanner.close();

    }

    private static void binarySort(int[] array) {

        int n = array.length;

        for (int i = 1; i < n; i++) {

            int key = array[i];

            int j = i - 1;

            // Find the position to insert the key using binary search

            int insertPos = binarySearch(array, key, 0, j);

            // Shift elements to the right to make space for the key

            while (j >= insertPos) {

                array[j + 1] = array[j];

                j--;

            }

            // Insert the key at the correct position

            array[insertPos] = key;

        }

    }

    private static int binarySearch(int[] array, int key, int left, int right) {

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (array[mid] == key) {

                return mid;

            } else if (array[mid] < key) {

                left = mid + 1;

            } else {

                right = mid - 1;

            }

        }

        return left;

    }

}