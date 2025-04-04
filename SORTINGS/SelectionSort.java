public class SelectionSort {
    public static void main(String args[]) {
        int arr[] = {7, 8, 3, 1, 2};

        // Time complexity = O(n^2)
        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        // Pr inting the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
