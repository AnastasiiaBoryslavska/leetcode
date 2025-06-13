#You have a long flowerbed in which some of the plots are planted, and some are not.
#However, flowers cannot be planted in adjacent plots.
#Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty,
#and an integer n, return true if n new flowers can be planted in the flowerbed without violating 
#the no-adjacent-flowers rule and false otherwise.

#Example 1:
#Input: flowerbed = [1,0,0,0,1], n = 1
#Output: true

class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        count = 0
        for i in range(len(flowerbed)):
            if flowerbed[i] == 0:
                empty_left_spot = (i == 0) or (flowerbed[i - 1] == 0)
                empty_right_spot = (i == len(flowerbed) - 1) or (flowerbed[i + 1] == 0)

                if empty_left_spot and empty_right_spot:
                    flowerbed[i] = 1
                    count += 1

                if count >= n:
                    return True

        return count >= n