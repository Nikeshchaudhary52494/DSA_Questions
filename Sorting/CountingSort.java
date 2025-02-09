import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        // Step 1: Find the maximum value
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1; // Handle negative numbers

        // Step 2: Create and populate the count array
        int[] count = new int[range];
        for (int num : arr) {
            count[num - min]++;
        }

        // Step 3: Modify count array to store cumulative sums
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Build the sorted array
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy sorted elements back to the original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1, -5, 0, -2};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        countingSort(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
