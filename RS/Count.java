package RS;

import java.util.*;

public class Count {
    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(int arr[], int n, int exp)
    {
        int i;
        int[] count = countDigitOccurence(arr, n, exp);

        int[] output = getSortResult(arr, count, n, exp);

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    public static int[] countDigitOccurence(int arr[], int n, int exp){
        //array to store the count of the digits. Initialized to 10 because we are working with decimal numbers
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        return count;
    }

    public static int[] getSortResult(int[] arr, int[] count, int n, int exp){
        int i;
        int output[] = new int[n]; // output array
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        return output;
    }
}
