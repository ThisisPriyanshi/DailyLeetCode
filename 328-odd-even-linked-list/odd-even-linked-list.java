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
    public ListNode oddEvenList(ListNode head) {

if(head==null || head.next==null || head.next.next ==null)
        {
            return head;
        }
        ListNode head2 = head.next;
        ListNode first = head, second = head.next,prev = null;
        while(second!=null && first!=null)
        {
            first.next = second.next;
            prev = first;
            first = first.next;
            if(first!=null)
            {
                second.next = first.next;
                second = second.next;
            }
        }
        //If no of nodes is odd -- (second == null)
        //tail of odd set of nodes is 'first'
        if(second==null)
        {
            first.next = head2;
        }
        //If no of nodes is even -- (first == null)
        //tail of odd set of nodes is 'prev'
        else  
        {
            prev.next = head2;
        }
        return head;
    }
}