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
    public boolean isPalindrome(ListNode head) {

        //first we will use the two pointer method to find the middle point.

        ListNode fast = head;
        ListNode slow = head;

        while( fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        //we have reached the middle point now we shall do reversal

        ListNode prev = slow;
        slow = slow.next;
        prev.next = null; //to avoid infinite loop

        while(slow != null) // reversal
        {
            ListNode temp = slow.next;
            slow.next = prev;
            prev= slow;
            slow = temp;
        }

        slow = prev;
        fast = head;

        while(slow != null)
        {
            if( fast.val != slow.val)
            {
                return false;
            }

            slow = slow.next;
            fast = fast.next;

        }

        return true;

    }
}
