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
    public ListNode deleteDuplicates(ListNode head) {

        ListNode node = new ListNode(1000,head);
        ListNode ans = node.next;
        while(head != null){
            if(node.val != head.val){
                node.next = head;
                node = node.next;
                head = head.next;
            }else{
                head = head.next;
            }
        }
        node.next = null;
        return ans;
    }
}