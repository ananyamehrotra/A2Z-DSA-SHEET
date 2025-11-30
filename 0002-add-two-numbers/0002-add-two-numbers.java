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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode demo=new ListNode(-1);
        ListNode curr=demo;
        int sum,carry=0;
        while(l1!=null||l2!=null){
            sum=carry;
            if(l1!=null)sum+=l1.val;
            if(l2!=null)sum+=l2.val;
            ListNode newN=new ListNode(sum%10);
            curr.next=newN;
            carry=sum/10;
            curr=curr.next;

            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        if(carry!=0){
            ListNode newN=new ListNode(carry);
            curr.next=newN;
        }
            
        
        return demo.next;
    }
}