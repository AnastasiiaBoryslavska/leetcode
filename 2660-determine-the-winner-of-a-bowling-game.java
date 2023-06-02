/**
You are given two 0-indexed integer arrays player1 and player2, that represent the number of pins that player 1 and player 2 hit in a bowling game, respectively.

The bowling game consists of n turns, and the number of pins in each turn is exactly 10.

Assume a player hit xi pins in the ith turn. The value of the ith turn for the player is:

2xi if the player hit 10 pins in any of the previous two turns.
Otherwise, It is xi.
The score of the player is the sum of the values of their n turns.

Return

1 if the score of player 1 is more than the score of player 2,
2 if the score of player 2 is more than the score of player 1, and
0 in case of a draw.
 

Example 1:

Input: player1 = [4,10,7,9], player2 = [6,5,2,3]
Output: 1
Explanation: The score of player1 is 4 + 10 + 2*7 + 2*9 = 46.
The score of player2 is 6 + 5 + 2 + 3 = 16.
Score of player1 is more than the score of player2, so, player1 is the winner, and the answer is 1.
 */

 class Solution {
    public int isWinner(int[] p1, int[] p2) {
    int ans=0,s1=0,s2=0;
    int n=p1.length;
   for(int i=0;i<n;i++){
           s1+=p1[i];
           s2+=p2[i];
       }
    if(n>1) {
        for(int i=1;i<n;i++){
            if(p1[i-1]==10 ||((i>=2) && p1[i-2]==10))s1+=p1[i];
            if(p2[i-1]==10 ||((i>=2)&& p2[i-2]==10))s2+=p2[i];
        }
    }
    if(s1==s2) ans= 0;
    else if(s1>s2) ans= 1;
    else ans= 2;
    return ans;
    
}
}
