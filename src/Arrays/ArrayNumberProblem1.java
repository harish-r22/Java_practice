package algo.arrays;

import java.util.Arrays;
/*
Title
Digit rearrangement method to find next greater number with same set of digits

Topic
Array problems solving techniques with examples

Description
Write an algorithm to find out next greater number to given number
with the same set of digits Asked in : Morgan Stanley, Makemytrip, Amazon
*/

public class ArrayNumberProblem1 {
        // Given number as int array, this function finds the greatest number and give the number as integer
        static void findNextNumber(int array[], int n)
        {
            //Practise Yourself : Write your code Here
            int min = array[n-1];
            int minIndex = n-1;
            int minStart =0;
            for(int i = n-1;i > 0;i--){

                if(array[i] > array[i-1]){
                    minStart = i-1;
                    break;
                }else{
                    if(min > array[i]){
                        min =   array[i];
                        minIndex = i;
                    }
                    System.out.println("Value "+i+" minIndex "+minIndex);
                }
            }
            System.out.println("minStart "+minStart);
            swap(array,minStart,minIndex);
            Arrays.sort(array,minStart+1,n);


        }

        public static void swap(int[] arr, int pos1, int pos2) {
            int temp = arr[pos1];
            arr[pos1] = arr[pos2];
            arr[pos2] = temp;
        }

        public static void main(String[] args)
        {
            int array[] = {6,9,3,8,6,5,2 };
            int n = array.length;
            findNextNumber(array, n);
            System.out.println(" array  "+ Arrays.toString(array));
        }
    }

/* Try more Inputs
case 1:
actual = findNextNumber([1,2,3,4],4)
expected = 1243

case2:
 actual = findNextNumber([5,3,4,9,7,6],6)
 expected = 536479

case3:
actual = findNextNumber([6,9,3,8,6,5,2],7)
expected = 6952368
*/
