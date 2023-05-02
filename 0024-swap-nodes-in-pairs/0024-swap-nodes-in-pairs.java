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
// class Solution {
//     public ListNode swapPairs(ListNode head) {
//         ListNode temp1 =head;
//         if(head==null){
//             return null;
//         }
//         ListNode temp2 =head.next;
//         ListNode temp3 =head.next;
//         // if(head.next!=null){
//         //     ListNode temp2 =head.next;
//         // }else{
//         //     return head;
//         // }
//         head=head.next;

//         while(temp2!=null && temp1!=null){
//             temp1.next=temp2.next;
//             temp2.next=temp1;
//             temp1=temp1.next;
//             if(temp1!=null)
//             temp2=temp1.next;
//             temp3
            
//         }
//         return head;
//     }
// }

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head.next;
        swapper(head);
        return temp;
    }
    void swapper(ListNode head)
    {
        if(head == null || head.next == null) return;
        ListNode temp = head.next;
        head.next = head.next.next;
        temp.next = head;
        ListNode temp2 = null;
        if(head.next != null)
         temp2 = head.next.next;
        swapper(head.next);
        if(temp2 != null)
        head.next = temp2;
        
    }
}