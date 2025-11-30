/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     ListNode p=headA;
     ListNode o=headB;
     ListNode temp=null;
     while(p!=o){
        if(p!=null)p=p.next;else p=headB;
        if(o!=null)o=o.next;else o=headA;
     }
     return p;  
    }
}