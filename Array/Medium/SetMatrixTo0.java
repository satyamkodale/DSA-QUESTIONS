/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Medium;

/**
 *
 * @author Satyam
 * Intuition:
In the previous approach, the time complexity is minimal as the traversal of a matrix takes at least O(N*M)(where N = row and M = column). In this approach, we can just improve the space complexity. So, instead of using two extra matrices row and col, we will use the 1st row and 1st column of the given matrix to keep a track of the cells that need to be marked with 0. But here comes a problem. If we try to use the 1st row and 1st column to serve the purpose, the cell matrix[0][0] is taken twice. To solve this problem we will take an extra variable col0 initialized with 1. Now the entire 1st row of the matrix will serve the purpose of the row array. And the 1st column from (0,1) to (0,m-1) with the col0 variable will serve the purpose of the col array.


If any cell in the 0th row contains 0, we will mark matrix[0][0] as 0 and if any cell in the 0th column contains 0, we will mark the col0 variable as 0.

Thus we can optimize the space complexity.

Approach: 

The steps are as follows:

First, we will traverse the matrix and mark the proper cells of 1st row and 1st column with 0 accordingly. The marking will be like this: if cell(i, j) contains 0, we will mark the i-th row i.e. matrix[i][0] with 0 and we will mark j-th column i.e. matrix[0][j] with 0.
If i is 0, we will mark matrix[0][0] with 0 but if j is 0, we will mark the col0 variable with 0 instead of marking matrix[0][0] again.
After step 1 is completed, we will modify the cells from (1,1) to (n-1, m-1) using the values from the 1st row, 1st column, and col0 variable.
We will not modify the 1st row and 1st column of the matrix here as the modification of the rest of the matrix(i.e. From (1,1) to (n-1, m-1)) is dependent on that row and column.
Finally, we will change the 1st row and column using the values from matrix[0][0] and col0 variable. Here also we will change the row first and then the column.
If matrix[0][0] = 0, we will change all the elements from the cell (0,1) to (0, m-1), to 0.
If col0 = 0, we will change all the elements from the cell (0,0) to (n-1, 0), to 0.
Observations: Why in the second step, we are first marking the matrix from the cell (1,1) to (n-1, m-1) and not from (0,0):
Let’s understand this using the following example:
Given matrix:


Now, we will try to apply step 1 in the above matrix, col0 will be 0 as (3,0) contains 0 and it will look like the following:


Now, in the second step we will try to start modifying the cells with value 0 from (0,0). First, we will change the value of (0,0) to 0 as col0 is marked with 0. After that, while checking for cell (0, 3) we will find that the value of (0,0) is 0. And we will again modify the cell (0,3) with 0. But this should not happen as (0,0) was initially 1 and that is why (0,3) should remain with the value 1.
This is why we cannot change the 1st row and 1st column on the first go as the rest of the matrix is dependent on them. If we do it, the modification of the matrix will be incorrect.

In the 3rd step, why we are marking the 1st row first and then the 1st column:
We can notice that the modification of the 1st row is dependent on matrix[0][0] and the modification of the 1st column is dependent on col0 which is an independent variable. Now, if we modify the 1st column first, matrix[0][0] might be changed and this will hinder the modification of the 1st row as well. But if we simply do the opposite, the 1st row will be changed first, based on the value matrix[0][0] and then the 1st column will be changed based on the variable col0. This is why the order of change matters.

Note: For a better understanding of intuition, please watch the video at the bottom of the page.

Code
 */
public class SetMatrixTo0 {
    
//    // int row[n] = {0}; --> matrix[..][0]
//    // int col[m] = {0}; --> matrix[0][..]
//
//    int col0 = 1;
//    // step 1: Traverse the matrix and
//    // mark 1st row & col accordingly:
//    for (int i = 0; i < n; i++) {
//        for (int j = 0; j < m; j++) {
//            if (matrix[i][j] == 0) {
//                // mark i-th row:
//                matrix[i][0] = 0;
//
//                // mark j-th column:
//                if (j != 0)
//                    matrix[0][j] = 0;
//                else
//                    col0 = 0;
//            }
//        }
//    }
//
//    // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
//    for (int i = 1; i < n; i++) {
//        for (int j = 1; j < m; j++) {
//            if (matrix[i][j] != 0) {
//                // check for col & row:
//                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//    }
//
//    //step 3: Finally mark the 1st col & then 1st row:
//    if (matrix[0][0] == 0) {
//        for (int j = 0; j < m; j++) {
//            matrix[0][j] = 0;
//        }
//    }
//    if (col0 == 0) {
//        for (int i = 0; i < n; i++) {
//            matrix[i][0] = 0;
//        }
//    }
    
}
