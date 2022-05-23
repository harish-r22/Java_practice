package algo.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Binary Search");
        int[] result = {2, 4, 5, 6, 8, 9, 11, 14, 18, 21};

        int res = binarySearch(0, 8, 18, result);
        System.out.println(res);
    }

    public static int binarySearch(int start, int end, int key, int[] result) {
        if(start > end){
            return -1;
        }
        int mid = (start + end) / 2;
        if (key > result[mid]) {
            return binarySearch(mid + 1, end, key, result);
        } else if (key < result[mid]) {
            return binarySearch(start, mid - 1, key, result);
        } else {
            return mid;
        }
    }
}
