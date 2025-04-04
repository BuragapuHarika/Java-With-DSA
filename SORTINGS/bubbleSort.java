import java.util.Arrays;

public class bubbleSort {
    // Bubble Sort Function
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {  // Number of passes
            for (int j = 0; j < n - i - 1; j++) {  // Compare elements
                if (arr[j] > arr[j + 1]) {  // Swap if necessary
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Main Method
    public static void main(String args[]) {
        int arr[] = {1, 3, 7, 5, 2};
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        bubbleSort(arr);  // Call sorting function

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
