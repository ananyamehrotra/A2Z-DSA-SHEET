// Print 1 to N using recursion
// Easy
/*Print 1 To N Without Loop
Difficulty: BasicAccuracy: 61.33%Submissions: 327K+Points: 1
You are given an integer n. You have  to print all numbers from 1 to n.
Note: You must use recursion only, and print all numbers from 1 to n in a single line, separated by spaces.

Examples:

Input: n = 10
Output: 1 2 3 4 5 6 7 8 9 10
Input: n = 5
Output: 1 2 3 4 5
Input: n = 1
Output: 1
Constraints:
1 ≤ n ≤ 103 */

public class Print1ToNUsingRecursion {
    public void printNos(int n) {
        // Code here
        if(n<1)return;
        printNos(n-1);
        System.out.print(n+" ");
    }
}