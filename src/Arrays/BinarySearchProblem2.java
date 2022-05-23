package algo.arrays;


/*
Title
Search an element in a sorted and rotated array

Topic
Array problems solving techniques with examples

Assignment Description
We rotate an ascending order sorted array at some point unknown to user.
So for instance, 3 4 5 6 7 might become 5 6 7 3 4. Modify binary search algorithm to find an element
in the rotated array in O(log n) time and O(1) Space complexity
*/
public class BinarySearchProblem2 {
    public static void main(String[] args) {
        System.out.println("Binary Search");
        int[] result = { 5, 6, 8, 9, 11, 14, 18, 21,2, 4,};
        long l1 = System.nanoTime();
        int res = findNumber(result,0, result.length-1, 5);
        long l2 = System.nanoTime();
        System.out.println("Answer "+res+"  Time take:"+(l2-l1)+"ms");
    }

    private static int findNumber(int[] array, int start, int end, int value) {

         int mid=(start+end)/2;
         if(value==array[mid]){
             return mid;
         }
        if(value==array[start]){
            return start;
        }
        if(value==array[end]){
            return end;
        }
         if(array[start] <= array[mid]){
             if(value >= array[start] && value <= array[mid]){
                 return findNumber(array,start,mid-1,value);
             }
             return findNumber(array,mid+1,end,value);
         }else{
             if(value >= array[mid] && value <= array[end]){
                 return findNumber(array,mid+1,end,value);
             }
             return findNumber(array,start,mid-1,value);
         }
    }
}
