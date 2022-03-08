/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> ht = new HashMap<ListNode, Integer>();
        ListNode n = head;
        while(n!=null){
            if(ht.containsKey(n)){
                return true;
            }
            ht.put(n,n.val);
            n = n.next;
        }
        return false;
    }
}