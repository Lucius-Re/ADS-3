import java.util.Random;

public class Sorter {

    // Generates random array
    public int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000); // numbers from 0 to 999
        }

        return arr;
    }

    // Prints array
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // BASIC SORT: Bubble Sort
    public void basicSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                // Swap if current > next
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps → already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // ADVANCED SORT: Quick Sort
    public void advancedSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    // Quick Sort recursive
    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // Partition index
            int pivotIndex = partition(arr, low, high);

            // Sort left side
            quickSort(arr, low, pivotIndex - 1);

            // Sort right side
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition method
    private int partition(int[] arr, int low, int high) {

        // Pivot = last element
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot correctly
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}