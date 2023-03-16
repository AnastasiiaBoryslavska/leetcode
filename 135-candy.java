/**
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.

 

Example 1:

Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
 */

 class Solution {
    public int candy(int[] ratings) {
        int sumOfCandies = 0;
        int[] candiesPerChild = new int[ratings.length];
        for(int i = 0; i < candiesPerChild.length; i++) {
            candiesPerChild[i] = 1;
        }

        for(int i = 0; i < ratings.length - 1; i++) {
            if(ratings[i + 1] > ratings[i]) {
                candiesPerChild[i + 1] = candiesPerChild[i] + 1;
            }
        }

        for(int i = ratings.length - 1; i > 0; i--) {
            if(ratings[i - 1] > ratings[i]) {
                if(candiesPerChild[i - 1] < candiesPerChild[i] + 1) {
                    candiesPerChild[i -1] = candiesPerChild[i] + 1;
                }
            }
        }

        for(int i = 0; i < candiesPerChild.length; i++) {
            sumOfCandies += candiesPerChild[i];
        }

        return sumOfCandies;
    }
}
