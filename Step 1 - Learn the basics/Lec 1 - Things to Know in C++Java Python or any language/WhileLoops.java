// While loops
// Easy
/*While loop is another loop like for loop but unlike for loop it only checks for one condition.
Here, we will use a while loop and print a number n's table in reverse order.

Examples:

Input: n = 1
Output: 10 9 8 7 6 5 4 3 2 1
Input: n = 2
Output: 20 18 16 14 12 10 8 6 4 2
Constraints:
1 <= n<= 1000 */

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        // Print multiplication table of n in reverse order using while loop
        int i = 10;
        while (i >= 1) {
            System.out.print(n * i);
            if (i > 1) {
                System.out.print(" ");
            }
            i--;
        }
    }
}