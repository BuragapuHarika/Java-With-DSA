public class MergeSort {
    
    // Function to divide the array
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2; // Find the middle index
        divide(arr, si, mid);         // Recursively sort left half
        divide(arr, mid + 1, ei);     // Recursively sort right half
        conquer(arr, si, mid, ei);    // Merge the sorted halves
    }

    // Function to merge two sorted halves
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1]; // Temporary array for merging
        int idx1 = si;    // Starting index for left half
        int idx2 = mid + 1; // Starting index for right half
        int x = 0;        // Index for merged array

        // Compare elements from both halves and merge them in sorted order
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements from left half (if any)
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Copy remaining elements from right half (if any)
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy merged elements back into the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    // Main function to test Merge Sort
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8}; // Unsorted array
        int n = arr.length;

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Apply Merge Sort
        divide(arr, 0, n - 1);

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
