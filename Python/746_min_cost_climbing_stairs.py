#You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
#You can either start from the step with index 0, or the step with index 1.
#Return the minimum cost to reach the top of the floor.

#Example 1:

#Input: cost = [10,15,20]
#Output: 15
#Explanation: You will start at index 1.
#- Pay 15 and climb two steps to reach the top.
#The total cost is 15.

class Solution:
    def minCostClimbingStairs(self, cost):
        a, b = 0, 0  # Cost to reach step i-2 and i-1

        for i in range(2, len(cost) + 1):
            current = min(b + cost[i - 1], a + cost[i - 2])
            a, b = b, current

        return b
