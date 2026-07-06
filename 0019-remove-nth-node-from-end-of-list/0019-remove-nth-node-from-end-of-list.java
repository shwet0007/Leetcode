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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            head = null;
            return head;
        }


        int size = 1;
        ListNode temp = head;
        while(temp.next !=null){
             size++;
             temp = temp.next;
        }
        ListNode t1 = head;
        int count = size - n;
         if (count == 0) {
          return head.next;
        }
        for(int i=0;i<count-1;i++){
            t1 = t1.next;
        }
        t1.next = t1.next.next;

       return head;
       
     
    }
}