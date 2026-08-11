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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int size=0;

        while(temp!=null){
            size++;
            temp=temp.next;
        }

        if(size==0) return null;

        int first=k;
        int last=size-k+1;

        ListNode f=head;
        ListNode e=head;
        while(first>1){
            f=f.next;
            first--;
        }
        while(last>1){
            e=e.next;
            last--;
        }
        int temp1=e.val;
        e.val=f.val;
        f.val=temp1;

        return head;
    }
}