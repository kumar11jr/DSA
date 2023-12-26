import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 6};
        long startTime = System.nanoTime();
        selectionSort(arr);
        long endTime = System.nanoTime();

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Time taken by Selection Sort: " + (endTime - startTime) + " nanoseconds");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
