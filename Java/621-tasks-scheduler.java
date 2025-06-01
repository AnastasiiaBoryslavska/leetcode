/**
 * Given a characters array tasks, representing the tasks a CPU needs to do, where each letter represents a different task. Tasks could be done in any order. Each task is done in one unit of time. For each unit of time, the CPU could complete either one task or just be idle.

However, there is a non-negative integer n that represents the cooldown period between two same tasks (the same letter in the array), that is that there must be at least n units of time between any two same tasks.

Return the least number of units of times that the CPU will take to finish all the given tasks.


Example 1:

Input: tasks = ["A","A","A","B","B","B"], n = 2
Output: 8
Explanation: 
A -> B -> idle -> A -> B -> idle -> A -> B
There is at least 2 units of time between any two same tasks.
 */

 class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freqTable = new int[26];
        for(char c : tasks) {
            freqTable[c - 'A']++;
        }

        int maxFreq = 0;
        int countMax = 1;
        for(int i = 0; i < 26; i++) {
            if(freqTable[i] > maxFreq) {
                maxFreq = freqTable[i];
                countMax = 1;
            } else if(freqTable[i] == maxFreq) {
                countMax++;
            }
        }
        return Math.max(tasks.length, (n + 1)*(maxFreq - 1)+ countMax);
    }
}

 /** NOTES
 * -------
 * # of tasks < n
    char A is one with the largest freq
    (A-1) *(n+1) + p

# of task > n
    schedule high freq tasks
    
    
Q: How do these 2 solutions explain the test case
["A", "A", "A", "A", "A", "B", "B", "B", "B", "B", "C", "C", "C", "C", "C", "D", "D", "D"], n = 1, even thought the result is correct?


A: Only if the frequency of "B", "C" and "D" is not greater than "A". The first solution should work. Thinking about the idle_time = (f_max - 1) * n is under control of the cool down period.
In this case, we can just down the idle time to zero when we iterate "B". Because "B" just fill up the idle time holes between As. (the last 'B' is after the last 'A'). So for the remaining part of "C". 
We can insert them one by one to every interval between As which of course will not break the cooling down policy. And also "D" is. So CPU would not have new idle time. So the result is the length of tasks. Hope this is helpful.



I thought n IS the number of spaces in between the same task (e.g. 'A'). But actually n is the LEAST number of spaces we need. when n = 1, we can actually place 1, 2, 3.. items in between 'A's (the most frequent task). 
So as long as the idles between the most frequent tasks are filled, it's guaranteed that the rest of tasks will not incur new idle time (bcs we can just insert them in between 'A's)
 */
