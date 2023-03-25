/**
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */

/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    if (!numRows) return [];
    let matrix = [[1]];
    for (let i = 1; i < numRows; i++) {
        let row = [1], j = 1;
        while (j < i) {
            row.push(matrix[i-1][j-1]+matrix[i-1][j]);
            j++;
        }
        row.push(1);
        matrix.push(row);
    }
    return matrix;
};
