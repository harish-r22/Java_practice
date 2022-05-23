package algo.arrays;


/*Title
Maximum Value in an array of Increasing and Decreasing using Binary Search

Topic
Array problems solving techniques with examples

Description
One array of integers is given as an input ,which is initially increasing and then decreasing or
it can be only increasing or decreasing , you need to find the maximum value in the array in O(Log n)
Time complexity and O(1) Space Complexity Asked in: Amazon, Microsoft, Uber
*/public class BinarySearchProblem1 {

    public static void main(String[] args) {
        System.out.println("Binary Search");
        int[] result ={8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};
        // Increasing and decreasing
        // left side is less and right side is more --> increasing
        // left side is more  and right side is less --> decreasing
        // left side is less and right side is less --> Maximum vale

        int res = binarySearch(0, result.length-1,  result);
        System.out.println(res);
    }

    private static int binarySearch(int start, int end, int[] result) {
        if (start==end){
            return result[start];
        }
        if(start+1 ==end){
            if(result[start] > result[end]){
                return result[start];
            }else {
                return result[end];
            }
        }
        int mid = (start + end) /2;
        if(result[mid-1] < result[mid] && result[mid] > result[mid+1] ){
            return result[mid];
        }
        if(result[mid-1] < result[mid] && result[mid] < result[mid+1] ){
           return binarySearch(mid+1,end,result);
        }else {
            return binarySearch(start,mid-1,result);
        }

    }

}
