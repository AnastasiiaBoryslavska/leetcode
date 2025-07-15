#You are given two positive integer arrays spells and potions, of length n and m respectively, where spells[i] represents the strength of the ith spell and potions[j] represents the strength of the jth potion.
#You are also given an integer success. A spell and potion pair is considered successful if the product of their strengths is at least success.
#Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair with the ith spell.
#Example 1:

#Input: spells = [5,1,3], potions = [1,2,3,4,5], success = 7
#Output: [4,0,3]
#Explanation:
#- 0th spell: 5 * [1,2,3,4,5] = [5,10,15,20,25]. 4 pairs are successful.
#- 1st spell: 1 * [1,2,3,4,5] = [1,2,3,4,5]. 0 pairs are successful.
#- 2nd spell: 3 * [1,2,3,4,5] = [3,6,9,12,15]. 3 pairs are successful.
#Thus, [4,0,3] is returned.

class Solution:
    def successfulPairs(self, spells: List[int], potions: List[int], success: int) -> List[int]:
        maxPot = max(potions)
        minPot = min(potions)
        n = (maxPot-minPot+1)

        counts = [0]*n
        for pot in potions:
            counts[pot-minPot] += 1

        prev = 0
        for i in range(len(counts)-1,-1,-1):
            if counts[i] == 0:
                counts[i] = prev
                continue
            counts[i] = counts[i] + prev
            prev = counts[i]

        ans = []
        for spell in spells:
            minSuccess = ceil(success/spell)            
            if (minSuccess-minPot) >= n: 
                ans.append(0)
            elif minSuccess < minPot:
                ans.append(counts[0])
            else:
                ans.append(counts[minSuccess - minPot])

        return ans
    