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
        int size=0;
        ListNode temp =head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size==1){
            return null;
        }
        if(size-n==0) return head.next;
        else if(size==2){
            if(n==1){
                head.next=head.next.next;
                return head;
            }
            else{
                return head.next;
            }
        }
        int nth=size-n+1;
        int i=1;
        ListNode curr=head;
        while(i<nth-1){
            curr=curr.next;
            i++;
        }
        curr.next=curr.next.next;
        return head;
    }
}