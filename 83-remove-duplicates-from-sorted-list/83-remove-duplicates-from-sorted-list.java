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
        ListNode n = head;
        while(n!=null){
            if(n.next==null){
                break;
            }
            System.out.println(n.val);
            if(n.val == n.next.val){
                n.next = n.next.next;
            }else{
                n = n.next;
            }
        }
        return  head;
        
    }
}