/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode trav(ListNode headA, ListNode headB){
        ListNode n = headA;
        int flag = 0,flag1=0;
        HashSet<ListNode> set=new HashSet();  
        while(n.next!=null){
            set.add(n);
            n = n.next;
            flag++;
        }
         set.add(n);
         ListNode temp = headB;
         while(temp.next!=null){
            temp = temp.next;
            flag1++;
        }
        if(flag == 0 && flag1 == 0){
            if(n.val == temp.val){
                return n;
            }
        }
        //System.out.println("test"+flag);
        ListNode n1 = headB;
        while(n1.next!=null){
            if(set.contains(n1)){
                return n1;
            }
            n1 = n1.next;
        }
        if(set.contains(n1)){
            return n1;
        }
        
        System.out.println("sadfasd");
        return null;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        return trav(headA,headB);
        
    }
}