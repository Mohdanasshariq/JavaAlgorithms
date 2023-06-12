import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the terminal

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the values

        System.out.print("Enter space-separated values: ");

        String input = scanner.nextLine();

        // Split the input string into an array of strings

        String[] values = input.split(" ");

        // Convert the array of strings to an array of integers

        int[] array = new int[values.length];

        for (int i = 0; i < values.length; i++) {

            array[i] = Integer.parseInt(values[i]);

        }

        // Call bubbleSort method

        bubbleSort(array);

        // Print the sorted array

        System.out.print("Sorted array: ");

        for (int num : array) {

            System.out.print(num + " ");

        }

    }

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]

                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;

                }

            }

        }

    }

}