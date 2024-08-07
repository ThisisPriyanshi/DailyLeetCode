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
    public ListNode reverseBetween(ListNode head, int left, int right) {
if(left == right) //edge case
        return head;
        
        //creation of dummy node to help traversal
        
        ListNode dummy = new ListNode(0); 
        dummy.next = head;
        ListNode prev = dummy;

        for(int i = 0; i < left - 1; i++) // traversing to reach before left-1 position
        {
            prev = prev.next;
        }

        ListNode curr = prev.next; //setting curr

        for(int i = 0; i < (right-left) ; i++)
        {
            ListNode nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }

        return dummy.next; //return the head position post reversals
    }
}