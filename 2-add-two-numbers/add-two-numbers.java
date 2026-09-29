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
    private int findSum(ListNode h){
        int sum=0;
        while(h!=null){
            sum=sum*10+h.val;
            h=h.next;
        }
        return sum;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum1=findSum(l1);
        int sum2=findSum(l2);

        int sum=sum1+sum2;

        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int carry=0;

      while(l1!=null || l2!=null || carry!=0){
        int r1=(l1!=null)?l1.val:0;
        int r2=(l2!=null)?l2.val:0;
        
        sum=r1+r2+carry;
        carry=sum/10;

        curr.next=new ListNode(sum%10);
        curr=curr.next;

        if(l1!=null){
            l1=l1.next;
        }
        if(l2!=null){
            l2=l2.next;
        }
      }
        return dummy.next;
    }
}