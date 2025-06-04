/**
You are given an integer array ranks and a character array suits. You have 5 cards where the ith card has a rank of ranks[i] and a suit of suits[i].

The following are the types of poker hands you can make from best to worst:

"Flush": Five cards of the same suit.
"Three of a Kind": Three cards of the same rank.
"Pair": Two cards of the same rank.
"High Card": Any single card.
Return a string representing the best type of poker hand you can make with the given cards.

Note that the return values are case-sensitive.

Example 1:

Input: ranks = [13,2,3,1,9], suits = ["a","a","a","a","a"]
Output: "Flush"
Explanation: The hand with all the cards consists of 5 cards with the same suit, so we have a "Flush".
 */

 class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int []hashr = new int[15] ; // Check Constraints
        int []hashs = new int[5] ; // Check Constraints
        for(int i = 0 ; i < 5 ; i++)
        {
            hashr[ranks[i]] += 1 ;
            hashs[suits[i] - 'a'] += 1 ;
        }
        String ans = "High Card" ;
        for(int i = 0 ; i < 5 ; i++) // Checking same suit
        {
            if(hashs[i] == 5)
            {
                ans = "Flush" ;
				break ;
            }
        }
        for(int i = 0 ; i < 14 ; i++) // Checking same rank
        {
            if(hashr[i] >= 3)
            {
                ans = "Three of a Kind" ;
                return ans ;
            }
            else if(hashr[i] == 2)
            {
                ans = "Pair" ;
            }
        }
        return ans ;
    }
}
