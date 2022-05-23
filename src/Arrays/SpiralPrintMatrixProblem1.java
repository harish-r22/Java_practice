package algo.arrays;

public class SpiralPrintMatrixProblem1 {

        static void spiralPrint(int m, int n, int matrix[][])
        {
            int i, k = 0, l = 0;
            //checking k or l lies outside the matrix
            while (k < m && l < n) {
                //Print First Row
                for (i = l; i < n; ++i) {
                    System.out.print(matrix[k][i] + " ");
                }
                k++;
                //Print Last Column
                for (i = k; i < m; ++i) {
                    System.out.print(matrix[i][n - 1] + " ");
                }
                n--;
                //Print the last row
                if (k < m) {
                    for (i = n - 1; i >= l; --i) {
                        System.out.print(matrix[m - 1][i] + " ");
                    }
                    m--;
                }
                //Print the first column
                if (l < n) {
                    for (i = m - 1; i >= k; --i) {
                        System.out.print(matrix[i][l] + " ");
                    }
                    l++;
                }
            }
        }


        public static void main(String[] args)
        {
            int R = 4;
            int C = 4;
            int matrix[][] = { { 1, 2, 3, 4},
                    {5,6,7,8},
                    { 9, 10, 11, 12},
                    { 13, 14, 15, 16 } };
            spiralPrint(R, C, matrix);
        }
    }

/* Try more Inputs
case 1:
actual = spiralPrint(3,3,[[1,2,3],[4,5,6],[7,8,9]])
expected = [[1,2,3,6,9,8,7,4,5]]

case2:
 actual = spiralPrint(3,4,[[1,2,3,4],[5,6,7,8],[9,10,11,12]])
 expected = [1,2,3,4,8,12,11,10,9,5,6,7]

*/

