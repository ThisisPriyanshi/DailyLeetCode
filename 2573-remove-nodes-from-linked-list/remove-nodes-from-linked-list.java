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
    public ListNode removeNodes(ListNode head) {
        if(head == null) return head;

        ListNode result = null;

        ListNode holder = result;
        ListNode node = head;

        ListNode reverse = null;

        while(node != null) {
            ListNode next = node.next;
            node.next = reverse;
            reverse = node;
            node = next;
        }

        ListNode max = reverse;

        node = max;

        while(node != null) {
            if(node.val >= max.val) {
                max = node;
                ListNode next = result;
                result = node;
                node = node.next;
                result.next = next;
            } else 
                node = node.next;
        }
        return max;
    }
}