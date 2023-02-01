/* Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * Example 1:
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * 
 * The idea is to add ')' only after valid '('
 * We use two integer variables open & right to see how many '(' & ')' are in the current string
 * If open < n then we can add '(' to the current string
 * If close < open then we can add ')' to the current string
 * 
 * For n = 2, the recursion tree will be something like this:
 * 
 * 								   	(0, 0, '')
								 	    |	
									(1, 0, '(')  
								   /           \
							(2, 0, '((')      (1, 1, '()')
							   /                 \
						(2, 1, '(()')           (2, 1, '()(')
						   /                       \
					(2, 2, '(())')                (2, 2, '()()')
						      |	                             |
					result.add('(())')             result.add('()()')
   
 */

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        recurse(result, 0, 0, "", n);
        return result;
    }

    public void recurse(List<String> result, int open, int close, String s, int n) {
        if(s.length() == n * 2) {
            result.add(s);
            return;
        }

        if(open < n) {
            recurse(result, open + 1, close, s + "(", n);
        }

        if(close < open) {
            recurse(result, open, close + 1, s + ")", n);
        }
    }
}