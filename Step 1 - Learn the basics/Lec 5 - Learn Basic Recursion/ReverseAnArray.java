// Reverse an array
// Easy
/*Reverse an Array
Difficulty: EasyAccuracy: 55.32%Submissions: 235K+Points: 2Average Time: 5m
You are given an array of integers arr[]. You have to reverse the given array.

Note: Modify the array in place.

Examples:

Input: arr = [1, 4, 3, 2, 6, 5]
Output: [5, 6, 2, 3, 4, 1]
Explanation: The elements of the array are [1, 4, 3, 2, 6, 5]. After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. Hence, the answer is [5, 6, 2, 3, 4, 1].
Input: arr = [4, 5, 2]
Output: [2, 5, 4]
Explanation: The elements of the array are [4, 5, 2]. The reversed array will be [2, 5, 4].
Input: arr = [1]
Output: [1]
Explanation: The array has only single element, hence the reversed array is same as the original. */

public class ReverseAnArray {
    
    // Recursive function to reverse array
    public static void reverseArray(int[] arr, int start, int end) {
        // Base case: if start >= end, array is reversed
        if (start >= end) {
            return;
        }
        
        // Swap elements at start and end positions
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        // Recursive call with updated positions
        reverseArray(arr, start + 1, end - 1);
    }
    
    
}