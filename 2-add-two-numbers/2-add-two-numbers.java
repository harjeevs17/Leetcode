import java.math.BigInteger;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1;
        ListNode n2 = l2;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        while(n1.next!=null){
            s1.append(n1.val);
            n1 = n1.next;
        }
        s1.append(n1.val);
        while(n2.next!=null){
            s2.append(n2.val);
            n2 = n2.next;
        }
        s2.append(n2.val);
        BigInteger b1 = new BigInteger(s1.reverse().toString());
        BigInteger b2 = new BigInteger(s2.reverse().toString());
        BigInteger ten = new BigInteger("10");
        BigInteger total = b1.add(b2);
        
        System.out.println("Toal"+total);
        int cou = 0;
        ListNode head = new ListNode();
        if(total.doubleValue()>0){
            System.out.println("good");
        }
        else{
            System.out.println("bad"+total);
        }
        while(total.doubleValue()>0){
            BigInteger n = total.mod(ten);
            System.out.println(n);
            if(cou==0){
                head.val = n.intValue();
                head.next = null;
            }else{
                ListNode fin = new ListNode();
                fin.val =  n.intValue();
                fin.next = null;
                ListNode it = head;
                while(it.next!=null){
                    it = it.next;
                }
                it.next = fin;
            }
            
            System.out.println(n);
            total = total.divide(ten);
            cou++;
        }
        return head;
        
    }
}