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

var candy = function(ratings) {
    let sum = 0;
    let a = new Array(ratings.length).fill(1);

    for(let i = 0; i < ratings.length - 1; i++) {
        if(ratings[i + 1] > ratings[i]) {
            a[i + 1] = a[i] + 1;
        }
    }

    for(let i = ratings.length - 1; i > 0; i--) {
        if(ratings[i - 1] > ratings[i]) {
            if(a[i - 1] < a[i] + 1) {
                a[i - 1] = a[i] + 1;
            }
        }
    }

    for(let i = 0; i < a.length; i++) {
        sum += a[i];
    }

    return sum;
};
