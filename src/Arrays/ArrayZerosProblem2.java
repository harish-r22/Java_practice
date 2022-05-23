package algo.arrays;

import java.util.Arrays;

/*
Title
Move All 0's To End

Topic
Array problems solving techniques with examples

Assignment Description
Given an array nums, write a function to move all 0's to the end of it while maintaining
the relative order of the non-zero elements in O(n) Time complexity and O(1) Space complexity
with single traversal allowed
*/
public class ArrayZerosProblem2 {

    static void moveZeroToEnd1(int array[], int n) {
        int mid = 0, high = n - 1;//Try yourself

        while (mid <= high) {
            if (array[mid] == 0) {
                swap(array, mid, high);
                high--;
            } else {
                mid++;
            }
        }
        //Write your Code Here
    }

    static void moveZeroToEnd(int array[], int n) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[count++] = array[i];
            }
        }
        while (count < array.length) {
            array[count++] = 0;
        }

    }

    public static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;

    }

    public static void main(String[] args) {
        int array[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = array.length;
        moveZeroToEnd(array, n);
        System.out.println("result is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

/* Try more Inputs
case1:
 actual = MoveZeroToEnd([1,3,0,0,4,0,9],7)
 expected = [1,3,4,9,0,0,0]

case2:
actual = MoveZeroToEnd([0,1,0,3,12],5)
expected = [1,3,12,0,0]

case3:
actual = MoveZeroToEnd([0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9],13)
expected = [1,9,8,4,2,7,6,9,0,0,0,0,0]

*/