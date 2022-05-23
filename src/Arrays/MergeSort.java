package algo.arrays;


import java.util.Arrays;

public class MergeSort {

    // Sort array arr [low..high] using auxiliary array aux
    public static void mergeSort(int[] arr, int[] aux, int low, int high) {
        // Base case
        if (low == high) {
            return;
        }
        // find mid point
        int mid = (low + high) / 2;

        // recursively split runs into two halves until run size == 1,
        // then merge them and return back up the call chain
        mergeSort(arr, aux, low, mid); // split / merge left  half
        mergeSort(arr, aux, mid + 1, high); // split / merge right half

        merge(arr, aux, low, mid, high);	// merge the two half runs
    }

    public static void merge(int[] arr, int[] aux, int low, int mid, int high) {

        int i = low;// left half array starting point
        int k = low; // new result array starting point
        int j = mid + 1; // right half array starting point

        // Comparing left array first elements with right array first element and comparison will go on.
        // Example [1,2,3,5] left sorted array and [4,9,10] right sorted array
        // 1<4 & k[0] = 1,  2<4 & k[1] = 2, 3<4 & k[2] = 3,  5<4 & k[3] = 4, 5<9 & k[4] = 5, left array completed
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                aux[k++] = arr[i++];
            } else {
                aux[k++] = arr[j++];
            }
        }
        // now K array is [1,2,3,4,5]
        // Remaining J =1 elements [9,10]
        // i = 4, mid = 3

        while (i <= mid) {
            aux[k++] = arr[i++];
        }
        // j=5
        while (j <= high) {
            aux[k++] = arr[j++];
        }
        for (int l = low; l <= high; l++) {
            arr[l] = aux[l];
        }

    }

    // Function to check if arr is sorted in ascending order or not
    public static boolean isSorted(int[] arr) {
        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (prev > arr[i]) {
                System.out.println("Complete your code");
                return false;
            }
            prev = arr[i];
        }

        return true;
    }


    public static void main(String[] args) {
        //int[] arr = {765,34,2134,5,9,4,2,1,3,6666,754,32,67};
        int[] arr = {1,2,5,3,4,9,10};
        int[] aux = Arrays.copyOf(arr, arr.length);

        // sort array 'arr' using auxiliary array 'aux'
        mergeSort(arr, aux, 0, arr.length - 1);

        if (isSorted(arr)) {
            System.out.println(Arrays.toString(arr));
        }
    }
}

