/**
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

var evalRPN = function(tokens) {
    let stack = [];  //use array to store numbers
    let operators = {   //use object to store operators as keys and functions as values
        '+': (a, b) => a + b,
        '-': ( a, b) => a - b,
        '*': (a, b) => a * b,
        '/': (a, b) => Math.trunc(a / b)
    }

    for(let t of tokens) {   //iterate over a given array of strings
        if(operators[t]) {  //check if current element is operator
            let top = stack.pop(); //if so, take two last elements from stack
            let second = stack.pop();
            stack.push(operators[t](second, top)); //execute the function depending which operator is current
        } else {
            stack.push(Number(t)); //otherwise (if current element is a number) push it to the stack
        }
    }
    return stack.pop(); //we are guaranteed at the end will be only one element, so just pop it and return as the answer
}