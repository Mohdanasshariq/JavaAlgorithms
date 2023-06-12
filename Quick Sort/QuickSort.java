import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");

        int numValues = scanner.nextInt();

        int[] values = new int[numValues];

        for (int i = 0; i < numValues; i++) {

            System.out.print("Enter value " + (i + 1) + ": ");

            values[i] = scanner.nextInt();

        }

        quickSort(values, 0, numValues - 1);

        System.out.println("Sorted array:");

        for (int value : values) {

            System.out.print(value + " ");

        }

    }

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);

            quickSort(arr, pivotIndex + 1, high);

        }

    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                int temp = arr[i];

                arr[i] = arr[j];

                arr[j] = temp;

            }

        }

        int temp = arr[i + 1];

        arr[i + 1] = arr[high];

        arr[high] = temp;

        return i + 1;

    }

}
