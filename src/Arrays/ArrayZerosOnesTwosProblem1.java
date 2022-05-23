package algo.arrays;


import java.util.Arrays;

/*
Title
Segregation logic to Sort an array of 0's, 1's and 2's

Topic
Array problems solving techniques with examples

Description
Array consist of only 0's, 1's and 2's.
Write an algorithm to sort  this array in O(n) time complexity and O(1)
Space complexity with only one traversal Asked in : : Amazon, Microsoft, Adobe, WalmartLabs
*/
public class ArrayZerosOnesTwosProblem1 {
    public static void main(String[] args){

        int array[] = {0,2,0,1,1,2,0,0,2,1,0,2,1,0};
        System.out.println("Before traverse"+Arrays.toString(array));
        traverseArray(array,0,13,0);
        System.out.println("After traverse"+Arrays.toString(array));
    }

    private static void traverseArray(int[] array, int low, int high,int mid) {
        while(mid<=high){
            if(array[mid] == 0){
                swap(array,mid,low);
                low++;
                mid++;
            }else if(array[mid] == 2){
                swap(array,mid,high);
                high--;
            }
            else{
                mid++;
            }
        }
    }
    private static void swap(int[] array, int position1, int position2){
        int localVar = array[position2];
        array[position2] =  array[position1];
        array[position1]=localVar;
    }
}
