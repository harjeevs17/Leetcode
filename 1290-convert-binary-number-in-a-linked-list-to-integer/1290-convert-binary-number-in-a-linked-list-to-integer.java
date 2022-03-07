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
    public int getDecimalValue(ListNode head) {
        ListNode n = head;
        StringBuilder str = new StringBuilder();
			while(n.next!=null) {
				str.append(n.val);
				n = n.next;
			}
			str.append(n.val);
			System.out.println(str);
			return Integer.parseInt(str.toString(),2);
    }
}