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
        ListNode temp1=head;
        ListNode temp2=head;
        int size=0;
        //calculate the size of linkedlist
        
        while(temp1!=null){
            temp1=temp1.next;
            size++;
        }
        //if 1st node will be delet then 
        if(n==size){
            if(head.next!=null)return head.next;
            return null; 
        }
        //traverse 1 node back where you have to delete a node
        for(int i=0;i<(size-(n+1));i++){
            temp2=temp2.next;
        }
        //if lastnode have to be delete 
        if(n==1){
            temp2.next=null;
            return head;
        }
        if(temp2.next!=null)
        temp2.next=temp2.next.next;
        return head;
    }
}