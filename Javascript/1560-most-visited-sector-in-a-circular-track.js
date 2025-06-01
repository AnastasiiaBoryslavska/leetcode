/**
 * Given an integer n and an integer array rounds. We have a circular track which consists of n sectors labeled from 1 to n. A marathon will be held on this track, the marathon consists of m rounds. The ith round starts at sector rounds[i - 1] and ends at sector rounds[i]. For example, round 1 starts at sector rounds[0] and ends at sector rounds[1]

Return an array of the most visited sectors sorted in ascending order.

Notice that you circulate the track in ascending order of sector numbers in the counter-clockwise direction (See the first example).

Input: n = 4, rounds = [1,3,1,2]
Output: [1,2]
Explanation: The marathon starts at sector 1. The order of the visited sectors is as follows:
1 --> 2 --> 3 (end of round 1) --> 4 --> 1 (end of round 2) --> 2 (end of round 3 and the marathon)
We can see that both sectors 1 and 2 are visited twice and they are the most visited sectors. Sectors 3 and 4 are visited only once.
 */

var mostVisited = function(n, rounds) {
    let start = rounds[0];
    let end = rounds[rounds.length - 1];

    let res = new Array();

    if(start <= end) {
        for(let i = start; i <= end; ++i) res.push(i);
    } else {
        for(let i = 1; i <= end; ++i) res.push(i);
        for(let i = start; i <= n; ++i) res.push(i);
    }
    return res;
};

/**
 Notes:
Consider rounds[0] as start of marathon and rounds[A.length-1] as end of marathon, We are running from 1 to n repeatedly.

Most visited sectors can be identified from start and end point, In between how many rounds we run, it doesn't matter.

if(start <= end) we have most visited all sectors between start and end.

if(start > end) then we have to add all from (start to n) and (1 to end).
 */
