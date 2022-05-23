package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {11,2,3,4,0,10};
        int[] arr2 = {11,2,3,4,0,10};
        /**
         *  Method - Arrays.equals(arr1,arr2)
         *  Both Array should be same length and type
         */
        System.out.println(Arrays.equals(arr,arr2));

        /**
         * Method - Arrays.copyOf(arr, new Array length);
         */
        System.out.println(Arrays.copyOf(arr,10).toString());

        /**
         * Method - Arrays.sort(arr,startIndex,endIndex)
         */
        Arrays.sort(arr);
        Arrays.sort(arr2,0,3);
        System.out.println(arr.toString());
        System.out.println(arr2.toString());

        /**
         * Method - Arrays.binarySearch(arr,key)
         * return Index
         */
        System.out.println(Arrays.binarySearch(arr,10));

        /**
         * STREAMS
         */
        System.out.println(Arrays.stream(arr).flatMap(a-> IntStream.of(a)).count());
    }
}
