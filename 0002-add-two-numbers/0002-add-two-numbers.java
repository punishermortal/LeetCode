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
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode res=null;
        ListNode temp3=res;
        int carry=0;
        while(temp1!=null && temp2!=null){
            int data=temp1.val+temp2.val+carry;
            carry = data/10;
            int putVal=data %10;
            if(res==null){
                ListNode newNode=new ListNode(putVal);
                res=newNode;
                temp3=newNode;
            }else{
                ListNode neewNode=new ListNode(putVal);
                temp3.next=neewNode;
                temp3=temp3.next;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        while(temp1!=null){
            int data=temp1.val+carry;
            carry=data/10;
            int putVal=data % 10;
            
            ListNode nNode=new ListNode(putVal);
            temp3.next=nNode;
            temp3=temp3.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            int data=temp2.val+carry;
            carry=data/10;
            int putVal=data % 10;
            
            ListNode nNode=new ListNode(putVal);
            temp3.next=nNode;
            temp3=temp3.next;
            temp2=temp2.next;
        }
        if(carry!=0){
            temp3.next=new ListNode(carry);
        }
        return res;
    }
}