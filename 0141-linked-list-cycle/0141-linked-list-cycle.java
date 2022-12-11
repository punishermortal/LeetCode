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
        //slow poinnter move one step and fast pointer move two steps
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            //here is a null pointer exception for at fast.next
            if(fast.next!=null){
                fast=fast.next.next;
            }
            // condition when both at the same point thats means cycle is present
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}