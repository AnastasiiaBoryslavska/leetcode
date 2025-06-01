/*
 * You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

Note that:

The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer.

Example 1:

Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
Example 2:

Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6
 */

class Solution {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length/2+1];  //use array to store the result
        int index = 0;  //increment when adding number to the array, or decrement when encounter an operator
        for(String token : tokens) {  //iterate over the given array of strings
            switch(token) {
                case "+":   
                    stack[index-2] = stack[index-2] + stack[index-1];  //take the last two numbers and compute the result. 
                    index--; 
                    break;
                case "-":
                    stack[index-2] = stack[index-2] - stack[index-1];
                    index--;
                    break;
                case "*":
                    stack[index-2] = stack[index-2] * stack[index-1];
                    index--;
                    break;
                case "/":
                    stack[index-2] = stack[index-2] / stack[index-1];
                    index--;
                    break;
                default:
                    stack[index++] = Integer.parseInt(token);  //if the current element is a number, parse it to a number(remember it's a String at first) and add to the array, incrementing index each time
                    break;
            }
        }
        return stack[0];
    }
}