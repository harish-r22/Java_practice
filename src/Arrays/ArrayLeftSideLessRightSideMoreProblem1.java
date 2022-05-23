package algo.arrays;


import java.util.Arrays;

/*
Title
Left Side More Right Side Less

Topic
Array problems solving techniques with examples

Assignment Description
We have an array, we have to find an element before which all elements are less than it,
and after which all are greater than it. Finally, return the index of the element,
if there is no such element, then return -1: Time complexity O(n) and Space Complexity O(n)
*/
public class ArrayLeftSideLessRightSideMoreProblem1 {
    public static void main(String[] args){

        int array[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};

        System.out.println("Value "+findNumber(array,array.length));


    }

    private static int findNumber(int[] array, int n) {
       int[] left = new int[n];
       left[0] = Integer.MIN_VALUE;
       int right = Integer.MAX_VALUE;
       for(int i = 1; i < n;i++ ){
         left[i] = Math.max(left[i-1],array[i-1]);
       }
        for(int j = n-1; j >= 0;j--){
            if(left[j] < array[j] && right > array[j] ){
                return j;
            }
            right = Math.min(right,array[j]);
        }
        return -1;
    }

}
