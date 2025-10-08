        ListNode node = new ListNode(1000,head);
        ListNode ans = node.next;
        while(head != null){
            if(node.val != head.val){
                node.next = head;
                node = node.next;

    public ListNode deleteDuplicates(ListNode head) {
class Solution {
                head = head.next;
            }else{
                head = head.next;
            }
        }
        node.next = null;
        return ans;
    }
}
 */