/**
We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
 */

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i =0; i<asteroids.length; i++){
            if(asteroids[i]>0 || stack.isEmpty())  stack.push(asteroids[i]);
            else{
                
                while(!stack.isEmpty() && stack.peek()>0 && Math.abs(asteroids[i])>stack.peek()){
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek()== Math.abs(asteroids[i])) stack.pop();
                else{
                    if(stack.isEmpty() || stack.peek() < 0) stack.push(asteroids[i]);
                }
            }
            
        }
        int ans[] = new int[stack.size()];
        for(int i = stack.size()-1; i>=0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}
