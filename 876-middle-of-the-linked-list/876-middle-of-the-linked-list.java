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
    public ListNode middleNode(ListNode head) {
        ListNode n = head;
        int counter = 1;
        while(n.next!=null){
            counter++;
            n = n.next;
        }
        System.out.println(counter);
        if(counter==1){
            return head;
        }
        if(counter == 2){
            ListNode h = head;
            return head.next;
        }
        ListNode n1 = head;
        int count = 0; 
        while(n1.next!=null){
            if(count == (counter/2)){
                head = n1;
                return head;
            }
            n1 = n1.next;
            count = count + 1;
        }
        return null;
    }
}