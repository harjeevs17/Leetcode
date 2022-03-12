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
        ListNode n1 = head;
        StringBuilder  str = new StringBuilder();
        while(n1.next!=null){
            str.append(n1.val);
            n1 = n1.next;
        }
        str.append(n1.val);
        System.out.println(str.toString());
        System.out.println(str.reverse().toString());
        if(str.toString().equals(str.reverse().toString())){
            return true;
        }
        else{
            return false;
        }
    }
}