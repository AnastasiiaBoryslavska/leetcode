#Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
#Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.
#Example 1:

#Input: g = [1,2,3], s = [1,1]
#Output: 1
#Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
#And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
#You need to output 1.

class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()
        content_children = 0
        cookie_index = 0
        while cookie_index < len(s) and content_children < len(g):
            if s[cookie_index] >= g[content_children]:
                content_children += 1
            cookie_index += 1
        return content_children
    