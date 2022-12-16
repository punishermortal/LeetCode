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
    //the approh is like a merge sort sort first dividing each node 
    //seperately and then merge it by comparing
    public ListNode mergeKLists(ListNode[] lists) {
        //when lists will be empty our ans will be null
        if (lists == null || lists.length == 0) {
            return null;
        }
        //utility function same work as a merge sort 
        return divide(lists, 0, lists.length - 1);
    }
    
    private ListNode divide(ListNode[] lists, int start, int end) {
        //its a base condition for partion or dividing an arr
        if (start == end) {
            return lists[end];
        }
        //calculating the midle of lists and colleng recursion for 0 to mid and mid+1 to end
        int mid = start + (end - start) / 2;
        ListNode l1 = divide(lists, start, mid);
        ListNode l2 = divide(lists, mid + 1, end);
        return merge(l1, l2);
    }
    //its a merging a list 
    private ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        //its checking which is smaller between two node who is smalleer add it first
        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
}