package algo.arrays;


/*
Title
        Linear time approach to solve jump game problem

        Topic
        Array problems solving techniques with examples

        Description
        You have an array of non-negative integers,you are initially positioned at the first index of the array.
        Each element in the array represents your maximum jump length at that position.
        Determine if you are able to reach the last index in O(n)Time complexity and O(1)Space Complexity
        Asked in:Adobe,Intuit
        */
public class ArrayJumpProblem2 {

    public static void main(String[] args) {
        int[] array = {1,3,5,8,9,2,6,7,6,8,9};
        System.out.println("Minimum number of jumps to reach end is : "+findJump(array));
    }

    private static int findJump(int[] array) {
        int jump =1;
        int a = array[0];
        int b = array[0];
        for (int i=1; i< array.length;i++){
            if(i == array.length-1){
                return jump;
            }
            a--;
            b--;
            if(b < array[i]){
                b = array[i];
            }
            if(a==0){
                a = b;
                jump++;
            }
            if(b==0){
                return 0;
            }
        }
        return jump;
    }


}
