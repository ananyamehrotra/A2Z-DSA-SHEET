// Print name N times using recursion
// Easy
/*Print GFG n times
Difficulty: EasyAccuracy: 75.76%Submissions: 130K+Points: 2Average Time: 10m
Print GFG n times without the loop.

Example:

Input:
5
Output:
GFG GFG GFG GFG GFG
Your Task:
This is a function problem. You only need to complete the function printGfg() that takes N as parameter and prints N times GFG recursively. Don't print newline, it will be added by the driver code.


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N) (Recursive).

Constraint:
1<=N<=1000 */

public class PrintNameNTimesUsingRecursion {
    void printGfg(int N) {
        if(N<1)return;
        
        System.out.print("GFG ");
        printGfg(N-1);
        
    }
}