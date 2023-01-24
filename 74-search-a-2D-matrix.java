/*
 * You are given an m x n integer matrix matrix with the following two properties:
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 * You must write a solution in O(log(m * n)) time complexity.
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n -1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / 2;
            int col = mid % 2;

            if(matrix[row][col] == target) {
                return true;
            } else if ( matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
