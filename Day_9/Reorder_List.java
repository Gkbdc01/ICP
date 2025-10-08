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
    public void reorderList(ListNode head) {
      Stack<ListNode> st =  new Stack<>();
      ListNode dummy = head;
      while(dummy != null){
        st.push(dummy);
        dummy = dummy.next;
      }
      int max = st.size();
      dummy  = head;
      int i  = 0;
      if(max>2){
      while(i>max/2){
        ListNode nn = new ListNode();
        nn = dummy.next;
        dummy.next = st.pop();
        dummy.next.next = nn;
        dummy = nn;
        i++;
      }
      dummy.next = null;
      }
    }
}