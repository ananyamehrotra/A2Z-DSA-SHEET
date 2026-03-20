/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c=0;
        ListNode temp=head;

        while(temp!=null){
            c++;
            temp=temp.next;
        }
        if(c==1)return null;
        if (n==c) return head.next;
        temp=head;
        int m=c-n-1;
        while(m!=0){
            temp=temp.next;
            m--;
        }
        temp.next=temp.next.next;
        return head;
    }
}